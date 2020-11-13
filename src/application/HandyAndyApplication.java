package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

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
    private Connection DatabaseConnection = null;
    
    @Override
    public void start(Stage stage){
        String query = "select * from users";
        Statement stmt = null;
        ResultSet rs = null;
        try{
            DatabaseConnection = DriverManager.getConnection(CONN_STR, APP_USER, APP_PSWD);
            System.out.println("Connected");
            stmt = DatabaseConnection.prepareStatement(query);
            rs = stmt.executeQuery(query);
            rs.next();
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("email"));
            System.out.println(rs.getString("userType"));
            System.out.println(rs.getString("password"));
            DatabaseConnection.close();
            stmt.close();
            rs.close();
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
