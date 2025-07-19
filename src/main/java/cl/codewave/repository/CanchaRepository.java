package cl.codewave.repository;

import cl.codewave.model.Cancha;

public interface CanchaRepository {
  Cancha findByNombre(String nombre);
}
