package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.util.Date;
import java.util.Objects;

public class Cita {
    private Date fecha;
    private Cliente cliente;
    private Medico medico;
    private Mascota mascota;
    private String hora;

    public Cita(Date fecha, Cliente cliente, Medico medico, Mascota mascota, String hora) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.medico = medico;
        this.mascota = mascota;
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return Objects.equals(fecha, cita.fecha) && Objects.equals(cliente, cita.cliente) && Objects.equals(medico, cita.medico) && Objects.equals(mascota, cita.mascota) && Objects.equals(hora, cita.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, cliente, medico, mascota, hora);
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", cliente=" + cliente +
                ", medico=" + medico +
                ", mascota=" + mascota +
                ", hora='" + hora + '\'' +
                '}';
    }
}
