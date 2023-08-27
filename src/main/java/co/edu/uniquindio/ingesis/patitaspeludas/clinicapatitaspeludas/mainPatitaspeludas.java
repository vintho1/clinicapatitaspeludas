package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas;
import co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.model.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainPatitaspeludas extends Application {

    public static void main(String[] args) {
        launch();
        PatitasPeludas patitasPeludas = new PatitasPeludas();
        patitasPeludas.registrarCliente("Jorge Nitales", "3159864487", "Jorge@correo.com", "123", "Barrio Cilindro");
        System.out.println(patitasPeludas.clienteList.get(0).getNombre());
        patitasPeludas.registrarMascota
                ("Carlos", "1 año", "m", Tipo.PERRO, "Caniche", patitasPeludas.clienteList.get(0),
                        new HistorialClinico("Chillidos", "Diarre", "Pata partida"));
        patitasPeludas.getHistorialClinico("123", "Carlos");
    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(mainPatitaspeludas.class.getResource("pantallaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



}

