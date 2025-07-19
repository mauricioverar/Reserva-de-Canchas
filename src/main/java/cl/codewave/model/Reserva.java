package cl.codewave.model;

import java.time.LocalDate;

public class Reserva {
private String id;
    private String nombreCliente;
    private String nombreCancha;
    private LocalDate fecha;
    private String horario;

    public Reserva(String id, String nombreCliente, String nombreCancha, LocalDate fecha, String horario) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.nombreCancha = nombreCancha;
        this.fecha = fecha;
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreCancha() {
        return nombreCancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getHorario() {
        return horario;
    }
}
