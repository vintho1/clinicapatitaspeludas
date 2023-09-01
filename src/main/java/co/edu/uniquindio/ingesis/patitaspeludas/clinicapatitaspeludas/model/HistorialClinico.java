package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.util.Objects;

public class HistorialClinico {
    private String motivoConsulta;
    private String enfermedadActual;
    private String antecedentes;

    public HistorialClinico(String motivoConsulta, String enfermedadActual, String antecedentes) {
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.antecedentes = antecedentes;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistorialClinico that = (HistorialClinico) o;
        return Objects.equals(motivoConsulta, that.motivoConsulta) && Objects.equals(enfermedadActual, that.enfermedadActual) && Objects.equals(antecedentes, that.antecedentes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motivoConsulta, enfermedadActual, antecedentes);
    }

    @Override
    public String toString() {
        return "HistorialClinico{" +
                "motivoConsulta='" + motivoConsulta + '\'' +
                ", enfermedadActual='" + enfermedadActual + '\'' +
                ", antecedentes='" + antecedentes + '\'' +
                '}';
    }
}
