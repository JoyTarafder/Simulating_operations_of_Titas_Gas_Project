
package financialManager;

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
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joy Tarafder
 */
public class FinancialManagerCreateYearlyBudgetRecordController implements Initializable {

    @FXML
    private Label preYearlyRecordPieChart;
    @FXML
    private TextField amountTextField;
    @FXML
    private TableView<?> preYearlyRecordTableView;
    @FXML
    private TableColumn<?, ?> yearTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private PieChart preYearly;
    @FXML
    private TextField yearTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent BackBtn = FXMLLoader.load(getClass().getResource("FinancialManagerDeshboard.fxml"));
        Scene newScene = new Scene (BackBtn);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void submitButtonOnAction(ActionEvent event) {
    }
    
}
