
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joy Tarafder
 */
public class FinancialManagerDeshboardController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private Label nameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void analyzingReportButtonOnAction(ActionEvent event) throws IOException {
        Parent AnalyzingReport = FXMLLoader.load(getClass().getResource("FinancialManagerCreateAnalyzingReport.fxml"));
        Scene newScene = new Scene (AnalyzingReport);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void financialReportButtonOnAction(ActionEvent event) throws IOException {
        Parent FinancialReport = FXMLLoader.load(getClass().getResource("FinancialManagerCreateFinancialReport.fxml"));
        Scene newScene = new Scene (FinancialReport);
        Stage newWindow  = new Stage();
        newWindow.setScene(newScene);
        newWindow.show();
    }

    @FXML
    private void grossProfitReportButtonOnAction(ActionEvent event) throws IOException {
        Parent GrossProfitReport = FXMLLoader.load(getClass().getResource("FinancialManagerCreateGrossProfitReport.fxml"));
        Scene newScene = new Scene (GrossProfitReport);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void trackingExpensesReportButtonOnAction(ActionEvent event) throws IOException {
        Parent TrackingExpensesReport = FXMLLoader.load(getClass().getResource("FinancialManagerCreateTrackingExpensesReport.fxml"));
        Scene newScene = new Scene (TrackingExpensesReport);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void sendInvoiceCustomerButtonOnAction(ActionEvent event) throws IOException {
        Parent SendInvoiceCustomer = FXMLLoader.load(getClass().getResource("FinancialMangerSendInvoiceCustomer.fxml"));
        Scene newScene = new Scene (SendInvoiceCustomer);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void yearlyBudgetRecordButtonOnAction(ActionEvent event) throws IOException {
        Parent YearlyBudgetRecord = FXMLLoader.load(getClass().getResource("FinancialManagerCreateYearlyBudgetRecord.fxml"));
        Scene newScene = new Scene (YearlyBudgetRecord);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void salaryDistributionButtonOnAction(ActionEvent event) throws IOException {
        Parent SalaryDistribution = FXMLLoader.load(getClass().getResource("FinancialManagerSalaryDistribution.fxml"));
        Scene newScene = new Scene (SalaryDistribution);
        Stage newWindow  = new Stage();
        newWindow.setScene(newScene);
        newWindow.show();
    }

    @FXML
    private void collaborationEmployeeMessageButtonOnAction(ActionEvent event) throws IOException {
        Parent CollaborationEmployeeMessage = FXMLLoader.load(getClass().getResource("CollaborationEmployeeMessage.fxml"));
        Scene newScene = new Scene (CollaborationEmployeeMessage);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void signOutButtonOnAction(ActionEvent event) throws IOException {
        Parent SignOut = FXMLLoader.load(getClass().getResource("LoginPageScene.fxml"));
        Scene newScene = new Scene (SignOut);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }
    
}
