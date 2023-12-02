
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
 * @author Joy Tarafder
 */
public class LoginPageSceneController implements Initializable {

    @FXML private TextField userNameTextField;
    @FXML private PasswordField passwordTextField;
    @FXML private CheckBox showPasswordCheckBox;
    @FXML private TextField passwordTextField1;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
//---------------------------------------------Log In code Start ---------------------------------------------------------------------------------------------
    
    @FXML
    private void logInButtonOnAction(ActionEvent event) throws IOException {
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        
        if(username.equals("cu") && password.equals("p")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent CustomerDeshboard = FXMLLoader.load(getClass().getResource("CustomerDeshboard.fxml"));
            Scene newScene = new Scene (CustomerDeshboard);
            Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            newStage.setTitle("Customer Deshboard");
            newStage.setScene(newScene);
            newStage.show();
        }
        else if(username.equals("fm") && password.equals("p")){
            showAlert("Login Sccessfull!", Alert.AlertType.INFORMATION);
            Parent FinancialManagerDeshboard = FXMLLoader.load(getClass().getResource("FinancialManagerDeshboard.fxml"));
            Scene newScene = new Scene (FinancialManagerDeshboard);
            Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            newStage.setTitle("Financial Manager Deshboard");
            newStage.setScene(newScene);
            newStage.show();
        }
    }
//--------------------------------------------- Log In code End ---------------------------------------------------------------------------------------------
    
//------------------------------------- Alert Code Start ---------------------------------------------------------
    
    private void showAlert(String login_sccessful, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle("Login Result");
        alert.setContentText(login_sccessful);
        alert.showAndWait();
    }
//------------------------------------- Alert Code End ---------------------------------------------------------
    
    
//--------------------------------Show Password Code Start -------------------------------------------------
    @FXML
    private void showPasswordCheckBoxOnClick(ActionEvent event) {
        if (showPasswordCheckBox.isSelected()) {
            passwordTextField1.setText(passwordTextField.getText());
            passwordTextField1.setVisible(true);
            passwordTextField.setVisible(false);
         } 
        else {
            passwordTextField.setText(passwordTextField.getText());
            passwordTextField.setVisible(true);
            passwordTextField1.setVisible(false);
         }
    }
//-------------------------------------- Show Password Code End ----------------------------------------------

//---------------------------------------- Create New Account Code Start -------------------------------------------------------------
    @FXML
    private void createNewAccountButtonOnAction(ActionEvent event) throws IOException {
        Parent CreateNewAccount = FXMLLoader.load(getClass().getResource("CreateAccount.fxml"));
        Scene newScene = new Scene (CreateNewAccount);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }
//---------------------------------------- Create New Account Code End -------------------------------------------------------------
    

}
