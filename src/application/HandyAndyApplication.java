package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

//import org.apache.pdfbox.pdmodel.PDDocument;

import menu.LoginMenu;
import user.User;

/**
 *
 * @author Christian Harris
 */

public class HandyAndyApplication extends Application{
    
    private User currentUser = null;
    
    private static final String APP_USER = "application";
    private static final String APP_PSWD = "applicationPassword";
    private static final String CONN_STR = "jdbc:mysql://localhost:3306/handyandydb";

    @Override
    public void start(Stage stage){
        Connection conn = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(CONN_STR, APP_USER, APP_PSWD);
            System.out.println("Connected");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        //LoginMenu loginMenu = new LoginMenu();
        //Scene scene = new Scene(loginMenu, 600, 400);
        //stage.setScene(scene);
        stage.setTitle("HandyAndyApplication");
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
