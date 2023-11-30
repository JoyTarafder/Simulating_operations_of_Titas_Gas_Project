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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CreateAccountController implements Initializable {

    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private TextField userNameTextField1;
    @FXML
    private TextField userNameTextField11;
    @FXML
    private TextField userNameTextField111;
    @FXML
    private PasswordField passwordTextField1;
    @FXML
    private TextField userNameTextField1111;
    @FXML
    private AnchorPane dobDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createAccountButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void alreadyCreateAccountButtonOnAction(ActionEvent event) throws IOException {
        Parent LoginPageScene = FXMLLoader.load(getClass().getResource("LoginPageScene.fxml"));
        Scene newScene = new Scene (LoginPageScene);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }
    
}
