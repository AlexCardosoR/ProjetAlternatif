/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque.controller;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 *
 * @author tosanchez
 */
public class AccueilController {
    
        @FXML
        Button quitter1; 
        @FXML
        Button ListerLivres;
    
    
       @FXML
        private void quit() throws IOException{
            
            Alert confirmationQuitter = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationQuitter.setTitle("Attention!");
            confirmationQuitter.setContentText("Voulez-vous vraiment quitter l'application?");
            confirmationQuitter.showAndWait();

            if (confirmationQuitter.getResult()== ButtonType.OK){

               Platform.exit();
            }

            if (confirmationQuitter.getResult()== ButtonType.CANCEL){           
            }
            
        }
        
        @FXML
        private void listerLivre() throws IOException{
         Parent root2 = FXMLLoader.load(getClass().getResource("/ludotheque/ihm/PageListeLivre.fxml"));
         Stage quitStage2 = new Stage();
         quitStage2.setScene(new Scene(root2));
         quitStage2.show();
        }
        
        @FXML
         private void supprimerLivre() throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("/ludotheque/ihm/PageSupprimerLivre.fxml"));
         Stage quitStage = new Stage();
         quitStage.setScene(new Scene(root));
         quitStage.show();
        }
         
        @FXML
         private void ajouterLivre() throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("/ludotheque/ihm/PageAjouterLivre.fxml"));
         Stage quitStage = new Stage();
         quitStage.setScene(new Scene(root));
         quitStage.show();
        }
    
    
}
