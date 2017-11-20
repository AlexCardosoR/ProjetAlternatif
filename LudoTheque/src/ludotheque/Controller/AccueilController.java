/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque.Controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author tosanchez
 */
public class AccueilController {
    
        @FXML
        Button quitter1; 
    
    
       @FXML
        private void quit() throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("/ludotheque/Vue/PageQuitter.fxml"));
         Stage quitStage = new Stage();
         quitStage.setScene(new Scene(root));
         quitStage.show();
        }
        
        @FXML
        private void listerLivre() throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("/ludotheque/Vue/PageListeLivre.fxml"));
         Stage quitStage = new Stage();
         quitStage.setScene(new Scene(root));
         quitStage.show();
        }
    
}
