/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Joy Tarafder
 */
public class CustomerBillPaymentController implements Initializable {

    @FXML
    private RadioButton bankRadioButton;
    @FXML
    private RadioButton bkashRadioButton;
    @FXML
    private RadioButton rocketRadioButton;
    @FXML
    private RadioButton nagadRadioButton;


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
    private void paymentButtonOnAction(ActionEvent event) {
    }
    
}
