package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

//import org.apache.pdfbox.pdmodel.PDDocument;

import menu.LoginMenu;

/**
 *
 * @author Christian Harris
 */

public class HandyAndyApplication extends Application{

    @Override
    public void start(Stage stage){
        LoginMenu loginMenu = new LoginMenu();
        Scene scene = new Scene(loginMenu, 600, 400);
        stage.setScene(scene);
        stage.setTitle("HandyAndyApplication");
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
