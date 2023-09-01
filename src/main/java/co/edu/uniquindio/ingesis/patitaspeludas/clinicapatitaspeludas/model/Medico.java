package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.util.Objects;

public class Medico extends Persona {
    private String codigo;

    public Medico(String nombre, String telefono, String correo, String codigo) {
        super(nombre, telefono, correo);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return Objects.equals(codigo, medico.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}
