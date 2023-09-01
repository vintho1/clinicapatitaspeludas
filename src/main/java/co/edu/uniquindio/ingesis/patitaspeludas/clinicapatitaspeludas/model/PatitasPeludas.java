package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatitasPeludas {
    public Medico[] medicosList = {
            new Medico("Ricardo Marin", "3118945687", "RMARIN@clinica.com", "0001"),
            new Medico("Juan Velasco", "3128675117", "JVELASCO@clinica.com", "0002"),
            new Medico("Eriberto Gomez", "3136745687", "EGOMEZ@clinica.com", "0003"),
            new Medico("Gildardo Palacio", "3118967187", "GPALACION@clinica.com", "0004")
    };

    public List<Cliente> clienteList = new ArrayList<>();
    public List<Mascota> mascotaList = new ArrayList<>();
    public List<Factura> facturaList = new ArrayList<>();

    public void generarFactura(Double costoAnadido, Cliente cliente, String observacion, String atencion){
        facturaList.add(new Factura(costoAnadido, cliente, observacion, atencion));
    }

    public AtencionVeterinaria generarAtencionVeterinaria(Enum<Estado> estadoEnum, LocalDate localDate, Mascota mascota, Medico medico){
        return new AtencionVeterinaria(estadoEnum, localDate, mascota, medico);
    }

    public void registrarCliente(String nombre, String telefono, String correo, String cedula, String direccion){
        clienteList.add(new Cliente(nombre, telefono, correo, cedula, direccion));
    }

    public void registrarMascota(String nombre, String edad, String sexo, Tipo tipo, String raza, Cliente propietario, HistorialClinico historialClinico){
        mascotaList.add(new Mascota(nombre, edad, sexo, tipo, raza, propietario, historialClinico));
    }

    public HistorialClinico obtenerHistorialClinico(String cedulaDueno, String nombreMascota){
        List<Mascota> coincidencias = mascotaList
                .stream()
                .filter(mascota -> mascota.getNombre().equals(nombreMascota) && mascota.getPropietario().getCedula().equals(cedulaDueno)).toList();
        return coincidencias.get(0).getHistorialClinico();
    }
}