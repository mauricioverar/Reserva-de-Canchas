package cl.codewave.repository;

import java.time.LocalDate;
import java.util.List;

import cl.codewave.model.Reserva;

public interface ReservaRepository {
  Reserva save(Reserva reserva);

  Reserva findById(String id);

  void deleteById(String id);

  List<Reserva> findByFecha(LocalDate fecha);

  List<Reserva> findByCanchaAndFecha(String nombreCancha, LocalDate fecha);
}
