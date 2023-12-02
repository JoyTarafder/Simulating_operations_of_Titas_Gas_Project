/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package customer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Joy Tarafder
 */
public class CustomerNewGasLineController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField zipCodeTextField;
    @FXML
    private RadioButton yesRadioButton;
    @FXML
    private RadioButton noRadioButton;
    @FXML
    private ComboBox<String> gasLineTypeComboBox;
    @FXML
    private DatePicker datePicker;


    ToggleGroup tg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        gasLineTypeComboBox.getItems().addAll(
                                "Domestic",
                                "Commercial",
                                "Industrial"
                                    );

        tg = new ToggleGroup();
        yesRadioButton.setToggleGroup(tg);
        noRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void submitButtonOnAction(ActionEvent event) {
    }
    
}
