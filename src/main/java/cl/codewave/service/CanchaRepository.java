package cl.codewave.service;

import cl.codewave.model.Cancha;

public interface CanchaRepository {
  Cancha findByNombre(String nombre);
}
