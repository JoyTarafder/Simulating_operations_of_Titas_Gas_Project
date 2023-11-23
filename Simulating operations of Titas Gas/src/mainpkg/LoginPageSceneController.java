/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginPageSceneController implements Initializable {

    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private CheckBox showPasswordCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logInButtonOnAction(ActionEvent event) throws IOException {
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        
        if(username.equals("customer") && password.equals("password")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent parent = FXMLLoader.load(getClass().getResource("CustomerDeshboard.fxml"));
            Scene newScene = new Scene (parent);
            Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            newStage.setScene(newScene);
            newStage.show();
        }
    }
    private void showAlert(String login_sccessful, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle("Login Result");
        alert.setHeaderText(null);
        alert.setContentText(login_sccessful);
        alert.showAndWait();
    }

    @FXML
    private void showPasswordCheckBoxOnClick(ActionEvent event) {
    }

    @FXML
    private void forgotPasswordLinkOnClick(ActionEvent event) {
    }
    
}
