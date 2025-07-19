package cl.codewave.model;

import java.util.Set;

public class Cancha {
private String nombre;
    private String tipoDeportivo;
    private Set<String> horariosDisponibles;

    public Cancha(String nombre, String tipoDeportivo, Set<String> horariosDisponibles) {
        this.nombre = nombre;
        this.tipoDeportivo = tipoDeportivo;
        this.horariosDisponibles = horariosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDeportivo() {
        return tipoDeportivo;
    }

    public Set<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public boolean tieneHorarioDisponible(String horario) {
        return horariosDisponibles.contains(horario);
    }

    public void eliminarHorario(String horario) {
        horariosDisponibles.remove(horario);
    }

    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
    }
}
