/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque.launch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tosanchez
 */
public class Main extends Application {
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
         
        Parent root = FXMLLoader.load(getClass().getResource("/ludotheque/ihm/PageAccueil.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Ludothèque");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

   


}
