package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
*
* @author myslf
*/
public class App extends Application {

@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Tienda.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("TIENDA");
        stage.show();
    }

    public static void main(String[] args) {
        launch(); 
    }
} 
