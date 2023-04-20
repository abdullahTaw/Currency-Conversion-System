/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SCc
 */
public class SystemController implements Initializable {

    @FXML
    private Button logOut;
    @FXML
    private TextField ins;
    @FXML
    private TextField usd;
    @FXML
    private Button convert;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutOfSystem(ActionEvent event) {
        
        ((Stage) logOut.getScene().getWindow()).close();
        
       
        ViewManager viewManager = new ViewManager();
        viewManager.showLogin();

    }

    @FXML
    private void convertCurrency(ActionEvent event) {
        
String usdAmountString = usd.getText().trim();
    String insAmountString = ins.getText().trim();
    
    if (usdAmountString.isEmpty() && insAmountString.isEmpty()) {
        // show alert to user that at least one TextField must have a value
        return;
    }
    
    if (!usdAmountString.isEmpty() && !insAmountString.isEmpty()) {
        // show alert to user that only one TextField can have a value
        return;
    }
    
    double usdAmount = 0;
    double insAmount = 0;
    double conversionRate = 3.5; // change this to the appropriate conversion rate
    
    try {
        if (!usdAmountString.isEmpty()) {
            usdAmount = Double.parseDouble(usdAmountString);
            insAmount = usdAmount * conversionRate;
            ins.setText(String.format("%.2f", insAmount));
        } else {
            insAmount = Double.parseDouble(insAmountString);
            usdAmount = insAmount / conversionRate;
            usd.setText(String.format("%.2f", usdAmount));
        }
    } catch (NumberFormatException ex) {
    // show alert to user that input is not a valid number

    }
    }
    
}
