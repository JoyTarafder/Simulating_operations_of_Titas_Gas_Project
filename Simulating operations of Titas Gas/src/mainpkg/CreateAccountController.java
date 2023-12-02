/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import customer.Customer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
    private DatePicker dobDatePicker;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private TextField fullnameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField phoneNoTextField;
    @FXML
    private PasswordField rePassowordTextField;
    @FXML
    private TextField emailTextField;
    
    private ArrayList<Customer> custList;
    private ToggleGroup tg;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void createAccountButtonOnAction(ActionEvent event) {
        Customer cust = new Customer(
                userNameTextField.getText(),
                fullnameTextField.getText(),
                addressTextField.getText(),
                emailTextField.getText(),
                (maleRadioButton.isSelected() ? "Male" : "Female"),
                passwordTextField.getText(),
                dobDatePicker.getValue(),
                Integer.parseInt(phoneNoTextField.getText())
                
        );
        
        custList.add(cust);
        
        try{
                FileOutputStream fos = new FileOutputStream("customer.bin",true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Customer c: custList)
                    oos.writeObject(c);
                oos.close();
            }
            catch(Exception e){
                //............
            }
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
