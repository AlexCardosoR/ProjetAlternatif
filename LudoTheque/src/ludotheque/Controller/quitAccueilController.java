/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author tosanchez
 */
public class quitAccueilController{
     @FXML
     Button retour,quitter1,quitter2;
     
     @FXML
     private void quit2() {
         Platform.exit();
     }
      
     @FXML
     private void revenir()  {
         retour.getScene().getWindow().hide();
     }

}
