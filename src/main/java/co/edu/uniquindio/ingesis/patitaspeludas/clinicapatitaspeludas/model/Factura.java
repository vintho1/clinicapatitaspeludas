package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.time.LocalDate;
import java.util.Objects;

public class Factura {
    /*

    public Factura generarFactura(Double costoAnadido, Cliente cliente, String observacion, String atencion){
        return new Factura(costoAnadido, cliente, observacion, atencion);
    }
    */

    private final double costoBase;
    private double costoAnadido;
    private Cliente cliente;
    private String observacion;
    private String atencion;

    public Factura(Double costoAnadido, Cliente cliente, String observacion, String atencion) {
        this.costoBase = 70000;
        this.costoAnadido = costoAnadido;
        this.cliente = cliente;
        this.observacion = observacion;
        this.atencion = atencion;
    }

    public double getCostoAnadido() {
        return costoAnadido;
    }

    public void setCostoAnadido(double costoAnadido) {
        this.costoAnadido = costoAnadido;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Double.compare(costoBase, factura.costoBase) == 0 && Double.compare(costoAnadido, factura.costoAnadido) == 0 && Objects.equals(cliente, factura.cliente) && Objects.equals(observacion, factura.observacion) && Objects.equals(atencion, factura.atencion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costoBase, costoAnadido, cliente, observacion, atencion);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "costoBase=" + costoBase +
                ", costoAnadido=" + costoAnadido +
                ", cliente=" + cliente +
                ", observacion='" + observacion + '\'' +
                ", atencion='" + atencion + '\'' +
                '}';
    }
}