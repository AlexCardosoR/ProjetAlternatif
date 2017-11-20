/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ludotheque.Class.Livre;

/**
 *
 * @author tosanchez
 */
public class LudoTheque extends Application {
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
         
        Parent root = FXMLLoader.load(getClass().getResource("/ludotheque/Vue/PageAccueil.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Ludothèque");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

}
