package menu;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;

/**
 *
 * @author Christian Harris
 */
public class LoginMenu extends Pane{
    
    private final VBox loginBox;
    
    private final Label userLabel;
    private final TextField userTextField;
    private final HBox userBox;
    
    private final Label passwordLabel;
    private final PasswordField passwordField;
    private final HBox passwordBox;
    
    public LoginMenu(){
        userLabel = new Label("Username: ");
        userTextField = new TextField("username");
        userBox = new HBox(userLabel, userTextField);
        
        passwordLabel = new Label("Password: ");
        passwordField = new PasswordField();
        passwordBox = new HBox(passwordLabel, passwordField);
        
        loginBox = new VBox(userBox, passwordBox);
        
        this.getChildren().add(loginBox);
    }
}
