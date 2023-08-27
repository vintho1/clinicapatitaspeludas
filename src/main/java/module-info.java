module co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas to javafx.fxml;
    exports co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas;
    exports co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.controllers;
    opens co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.controllers to javafx.fxml;
}