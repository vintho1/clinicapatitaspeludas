package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.time.LocalDate;
import java.util.Objects;

public class AtencionVeterinaria {
    private Enum<Estado> estadoEnum;
    private LocalDate localDate;
    private Mascota mascota;
    private Medico medico;

    public AtencionVeterinaria(Enum<Estado> estadoEnum, LocalDate localDate, Mascota mascota, Medico medico) {
        this.estadoEnum = estadoEnum;
        this.localDate = localDate;
        this.mascota = mascota;
        this.medico = medico;
    }

    public Enum<Estado> getEstadoEnum() {
        return estadoEnum;
    }

    public void setEstadoEnum(Enum<Estado> estadoEnum) {
        this.estadoEnum = estadoEnum;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtencionVeterinaria that = (AtencionVeterinaria) o;
        return Objects.equals(estadoEnum, that.estadoEnum) && Objects.equals(localDate, that.localDate) && Objects.equals(mascota, that.mascota) && Objects.equals(medico, that.medico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estadoEnum, localDate, mascota, medico);
    }

    @Override
    public String toString() {
        return "AtencionVeterinaria{" +
                "estadoEnum=" + estadoEnum +
                ", localDate=" + localDate +
                ", mascota=" + mascota +
                ", medico=" + medico +
                '}';
    }
}
