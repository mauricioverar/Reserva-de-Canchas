package cl.codewave.model;

public class Horario {
  public static boolean esHorarioValido(String horario) {
    return horario.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
  }
}
