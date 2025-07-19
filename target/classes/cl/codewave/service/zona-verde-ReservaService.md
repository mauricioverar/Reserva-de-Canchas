```java
package cl.codewave.service;

import java.time.LocalDate;

import cl.codewave.model.Cancha;
import cl.codewave.model.Reserva;

public class ReservaService {
private final ReservaRepository reservaRepository;
private final CanchaRepository canchaRepository;

public ReservaService(ReservaRepository reservaRepository, CanchaRepository canchaRepository) {
this.reservaRepository = reservaRepository;
this.canchaRepository = canchaRepository;
}

public Reserva crearReserva(String id, String nombreCliente, String nombreCancha, LocalDate fecha, String horario) {
Cancha cancha = canchaRepository.findByNombre(nombreCancha);
if (cancha == null) {
throw new IllegalArgumentException("Cancha no encontrada");
}

    if (!cancha.tieneHorarioDisponible(horario)) {
      throw new IllegalArgumentException("Horario no disponible");
    }

    if (reservaRepository.findByCanchaAndFecha(nombreCancha, fecha).stream()
        .anyMatch(r -> r.getHorario().equals(horario))) {
      throw new IllegalArgumentException("La cancha ya está reservada en ese horario");
    }

    Reserva reserva = new Reserva(id, nombreCliente, nombreCancha, fecha, horario);
    cancha.eliminarHorario(horario);
    return reservaRepository.save(reserva);

}

public void cancelarReserva(String id) {
Reserva reserva = reservaRepository.findById(id);
if (reserva == null) {
throw new IllegalArgumentException("Reserva no encontrada");
}

    String nombreCancha = reserva.getNombreCancha();
    Cancha cancha = canchaRepository.findByNombre(nombreCancha);

    if (cancha == null) {
      throw new IllegalArgumentException("Cancha asociada no encontrada");
    }

    cancha.agregarHorario(reserva.getHorario());
    reservaRepository.deleteById(id);

}

public int contarReservasPorDia(LocalDate fecha) {
return reservaRepository.findByFecha(fecha).size();
}
}
```