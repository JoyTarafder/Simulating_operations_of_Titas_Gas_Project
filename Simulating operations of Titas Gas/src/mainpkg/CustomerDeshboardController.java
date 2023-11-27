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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Joy Tarafder
 */
public class CustomerDeshboardController implements Initializable {

    @FXML
    private Label nameTextField;
    @FXML
    private Label addressTextField;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newGasLineButtonOnAction(ActionEvent event) throws IOException {
        Parent NewGasLine = FXMLLoader.load(getClass().getResource("CustomerNewGasLine.fxml"));
        Scene newScene = new Scene (NewGasLine);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void billPaymentButtonOnAction(ActionEvent event) throws IOException {
        Parent BillPayment = FXMLLoader.load(getClass().getResource("CustomerBillPayment.fxml"));
        Scene newScene = new Scene (BillPayment);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void emergancyGasServiceButtonOnAction(ActionEvent event) throws IOException {
        Parent EmergancyGasService = FXMLLoader.load(getClass().getResource("CustomerEmergencyGasServices.fxml"));
        Scene newScene = new Scene (EmergancyGasService);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void paymentInvoiceButtonOnAction(ActionEvent event) throws IOException {
        Parent PaymentInvoice = FXMLLoader.load(getClass().getResource("CustomerPaymentInvoices.fxml"));
        Scene newScene = new Scene (PaymentInvoice);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void infoViewButtonOnAction(ActionEvent event) throws IOException {
        Parent AccountInformationView = FXMLLoader.load(getClass().getResource("CustomerInfoView.fxml"));
        Scene newScene = new Scene (AccountInformationView);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void infoGasSafetyButtonOnAction(ActionEvent event) throws IOException {
        Parent InformationGasSafety = FXMLLoader.load(getClass().getResource("CustomerInfoGasSafety.fxml"));
        Scene newScene = new Scene (InformationGasSafety);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    private void customerCareServiceButtonOnAction(ActionEvent event) throws IOException {
        Parent CustomerCareService = FXMLLoader.load(getClass().getResource("CustomerCareService.fxml"));
        Scene newScene = new Scene (CustomerCareService);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();
    }
    
    @FXML
    private void billPaymentHistoryButtonOnAction(ActionEvent event) throws IOException {
        Parent BillPaymentHistory = FXMLLoader.load(getClass().getResource("CustomerPaymentHistory.fxml"));
        Scene newScene = new Scene (BillPaymentHistory);
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
