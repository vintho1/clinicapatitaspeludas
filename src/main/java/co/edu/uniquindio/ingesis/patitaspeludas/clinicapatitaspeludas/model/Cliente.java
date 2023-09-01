package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente extends Persona {
    private String cedula;
    private String direccion;

    public Cliente(String nombre, String telefono, String correo, String cedula, String direccion) {
        super(nombre, telefono, correo);
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cedula, cliente.cedula) && Objects.equals(direccion, cliente.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, direccion);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
