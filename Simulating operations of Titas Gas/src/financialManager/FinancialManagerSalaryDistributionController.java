/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package financialManager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FinancialManagerSalaryDistributionController implements Initializable {

    @FXML
    private DatePicker salaryDatepicker;
    @FXML
    private ComboBox<?> employeeComboBox;
    @FXML
    private ComboBox<?> deptComboBox;
    @FXML
    private TextArea salaryTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sumitButtonOnAction(ActionEvent event) {
    }
    
}
