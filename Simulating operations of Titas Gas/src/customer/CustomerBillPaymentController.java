/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package customer;

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joy Tarafder
 */
public class CustomerBillPaymentController implements Initializable {

    @FXML private RadioButton bankRadioButton;
    @FXML private RadioButton bkashRadioButton;
    @FXML private RadioButton rocketRadioButton;
    @FXML private RadioButton nagadRadioButton;


    ToggleGroup tg;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        bankRadioButton.setToggleGroup(tg);
        bkashRadioButton.setToggleGroup(tg);
        rocketRadioButton.setToggleGroup(tg);
        nagadRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void paymentButtonOnAction(ActionEvent event) throws IOException {
        if(bkashRadioButton.isSelected()){
        Parent BkashPayment = FXMLLoader.load(getClass().getResource("BkashScene.fxml"));
        Scene newScene = new Scene (BkashPayment);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
        }
        else if(bankRadioButton.isSelected()){
        Parent BkashPayment = FXMLLoader.load(getClass().getResource("BankScene.fxml"));
        Scene newScene = new Scene (BkashPayment);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
        }
        else if(rocketRadioButton.isSelected()){
        Parent BkashPayment = FXMLLoader.load(getClass().getResource("RocketScene.fxml"));
        Scene newScene = new Scene (BkashPayment);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
        }
        else if(nagadRadioButton.isSelected()){
        Parent BkashPayment = FXMLLoader.load(getClass().getResource("NagadScene.fxml"));
        Scene newScene = new Scene (BkashPayment);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
        }
    }
    
}
