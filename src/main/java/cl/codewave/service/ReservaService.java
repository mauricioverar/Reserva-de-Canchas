package cl.codewave.service;

import java.time.LocalDate;
import java.util.Objects;

import cl.codewave.model.Cancha;
import cl.codewave.model.Reserva;

public class ReservaService {

  private static final String CANCHA_NO_ENCONTRADA = "Cancha no encontrada";
  private static final String HORARIO_NO_DISPONIBLE = "Horario no disponible";
  private static final String CANCHA_RESERVADA_HORARIO = "La cancha ya está reservada en ese horario";
  private static final String RESERVA_NO_ENCONTRADA = "Reserva no encontrada";

  private final ReservaRepository reservaRepository;
  private final CanchaRepository canchaRepository;

  // Constructor
  public ReservaService(ReservaRepository reservaRepository, CanchaRepository canchaRepository) {
    this.reservaRepository = Objects.requireNonNull(reservaRepository);
    this.canchaRepository = Objects.requireNonNull(canchaRepository);
  }


  /**
   * Crea una reserva para una cancha en una fecha y horario específicos.
   *
   * @param id            ID de la reserva
   * @param nombreCliente Nombre del cliente que realiza la reserva
   * @param nombreCancha  Nombre de la cancha a reservar
   * @param fecha         Fecha de la reserva
   * @param horario       Horario de la reserva
   * @return Reserva creada
   */
  public Reserva crearReserva(String id, String nombreCliente, String nombreCancha, LocalDate fecha, String horario) {

    Objects.requireNonNull(id, "ID no puede ser null");
    Objects.requireNonNull(nombreCliente, "Nombre del cliente no puede ser null");
    Objects.requireNonNull(nombreCancha, "Nombre de la cancha no puede ser null");
    Objects.requireNonNull(fecha, "Fecha no puede ser null");
    Objects.requireNonNull(horario, "Horario no puede ser null");

    Cancha cancha = canchaRepository.findByNombre(nombreCancha);
    validarCanchaExiste(cancha);

    validarHorarioDisponible(cancha, horario, fecha, nombreCancha);

    Reserva reserva = new Reserva(id, nombreCliente, nombreCancha, fecha, horario);
    cancha.eliminarHorario(horario);

    return reservaRepository.save(reserva);
  }


  public void cancelarReserva(String id) {
    Objects.requireNonNull(id, "ID de reserva no puede ser null");
    Reserva reserva = reservaRepository.findById(id);
    if (reserva == null) {
      throw new IllegalArgumentException(RESERVA_NO_ENCONTRADA);
    }

    String nombreCancha = reserva.getNombreCancha();
    Cancha cancha = canchaRepository.findByNombre(nombreCancha);

    if (cancha == null) {
      throw new IllegalArgumentException(CANCHA_NO_ENCONTRADA);
    }

    cancha.agregarHorario(reserva.getHorario());
    reservaRepository.deleteById(id);
  }


  public int contarReservasPorDia(LocalDate fecha) {
    Objects.requireNonNull(fecha, "Fecha no puede ser null");
    return reservaRepository.findByFecha(fecha).size();
  }


  // Métodos privados para mejorar legibilidad

  private void validarCanchaExiste(Cancha cancha) {
    if (cancha == null) {
      throw new IllegalArgumentException(CANCHA_NO_ENCONTRADA);
    }
  }


  private void validarHorarioDisponible(Cancha cancha, String horario, LocalDate fecha, String nombreCancha) {
    if (!cancha.tieneHorarioDisponible(horario)) {
      throw new IllegalArgumentException(HORARIO_NO_DISPONIBLE);
    }

    if (reservaRepository.findByCanchaAndFecha(nombreCancha, fecha).stream()
        .anyMatch(r -> r.getHorario().equals(horario))) {
      throw new IllegalArgumentException(CANCHA_RESERVADA_HORARIO);
    }
  }
}
