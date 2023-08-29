package co.edu.uniquindio.ingesis.patitaspeludas.clinicapatitaspeludas.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class pantallaPrincipalController implements Initializable {

   @FXML
   private BorderPane bp;
   @FXML
   private AnchorPane ap;

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {

   }

   @FXML
   private void Rregistro(MouseEvent event){
      bp.setCenter(ap);
   }
   @FXML
   private void Rcitas(MouseEvent event) throws IOException {
         loadPage("citas");
   }
   @FXML
   private void Ratencion(MouseEvent event) throws IOException {
         loadPage("atencion");
   }
   @FXML
   private void Rhistorial(MouseEvent event) throws IOException {
         loadPage("historial");
   }

   private void loadPage (String page) throws IOException {


      Parent root = FXMLLoader.<Parent>load(getClass().getResource(page + ".fxml"));

         bp.setCenter(root);
   }


}