package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class pantallaPrincipalController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}