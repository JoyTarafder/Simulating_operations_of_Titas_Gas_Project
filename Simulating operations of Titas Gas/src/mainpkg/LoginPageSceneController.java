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
import javafx.scene.control.Button;
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
    @FXML
    private Button showbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
//---------------------------------------------Log In code Start ---------------------------------------------------------------------------------------------
    
    @FXML
    private void logInButtonOnAction(ActionEvent event) throws IOException {
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        
        if(username.equals("customer") && password.equals("password")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent CustomerDeshboard = FXMLLoader.load(getClass().getResource("CustomerDeshboard.fxml"));
            Scene newScene = new Scene (CustomerDeshboard);
            Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            newStage.setScene(newScene);
            newStage.show();
        }
        else if(username.equals("financialmanager") && password.equals("password")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent FinancialManagerDeshboard = FXMLLoader.load(getClass().getResource("FinancialManagerDeshboard.fxml"));
            Scene newScene = new Scene (FinancialManagerDeshboard);
            Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            newStage.setScene(newScene);
            newStage.show();
        }
    }
//---------------------------------------------Log In code End ---------------------------------------------------------------------------------------------
    
//------------------------------------- Alert Code Start ---------------------------------------------------------
    
    private void showAlert(String login_sccessful, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle("Login Result");
        alert.setContentText(login_sccessful);
        alert.showAndWait();
    }
//------------------------------------- Alert Code End ---------------------------------------------------------
    
    
//--------------------------------Don't touch this code -------------------------------------------------
    @FXML
    private void showPasswordCheckBoxOnClick(ActionEvent event) {
//        if (showPasswordCheckBox.isSelected()) {
//            passwordTextField.setEchoChar((char)0); //password = JPasswordField
//         } 
//        else {
//            passwordTextField.setEchoChar('*');
//         }
    }

    @FXML
    private void forgotPasswordLinkOnClick(ActionEvent event) {
    }

    @FXML
    private void showButtonOnClick(ActionEvent event) {
//        if(showbutton.isSelected()){
//            passwordTextField.setEchoChar((char)0); //By this line of code. We will actually see the actual characters
//            showbutton.setText("Hide");
//        }
//        else{
//            passwordTextField.setEchoChar('u25cf');
//            showbutton.setText("Show");
//        }
    }
//-------------------------------------------- x x x x x -----------------------------------------------------------------------------------------    
}
