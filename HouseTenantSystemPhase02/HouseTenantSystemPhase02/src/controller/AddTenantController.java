package controller;


import java.time.LocalDate;
import java.util.Date;

import app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.Tenant;
import model.Visitor;



public class AddTenantController {

    @FXML
    private Button okButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField tenantIDTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField passportTextField;

    @FXML
    private DatePicker VisaExpiryDateDatePicker;

    @FXML
    private DatePicker entryDateDatePicker;

    @FXML
    private TextField phoneTextField;

    @FXML
    private TextField nationalityTextField;

    @FXML
    void handleCancelButton(ActionEvent event) {
    	Stage stage = (Stage) cancelButton.getScene().getWindow(); 
    	stage.close();

    }
    
   /* public interface AddTenantInteraction{
    	
		public void saveTenant(Tenant house);
	}

    private AddTenantInteraction interaction;
	public void setInteraction(AddTenantInteraction interaction) {
		this.interaction = interaction;
	}*/
	

    @FXML
    void handleOkButton(ActionEvent event) {
    	int tenantId;
    	int passportNo;
    	
    	String tmp = tenantIDTextField.getText();
    	try {
    	 tenantId= Integer.parseInt(tmp);
    	}catch (NumberFormatException cc) {
    		 Alert alert = new Alert(AlertType.ERROR, "Tenant Id should be an integer");
    		alert.showAndWait();
    		return;
    		 
    	}
    	String address = addressTextField.getText();
    	if (address.trim().isEmpty()) {
    		 Alert alert = new Alert(AlertType.ERROR, "Address is required");
     		alert.showAndWait();
     		return;
    	}
    	
    	
       	try {
       	 passportNo = Integer.parseInt(tmp);
       	
       	}catch (NumberFormatException cc) {
       		 Alert alert = new Alert(AlertType.ERROR, "Tenant Passport No should be integer");
       		alert.showAndWait();
       		return;
       		 
       	}
       	
       	String name = nameTextField.getText();
    	if (name.trim().isEmpty()) {
    		 Alert alert = new Alert(AlertType.ERROR, "Tenant name is required");
     		alert.showAndWait();
     		return;
    	
       	
    	}
    	
    	String  phoneNum = phoneTextField.getText();
    	if (phoneNum.trim().isEmpty()) {
    		 Alert alert = new Alert(AlertType.ERROR, "Tenant Phone Number is required");
     		alert.showAndWait();
     		return;
    	
       	
    	}
    	
    	String  nationality = nationalityTextField.getText();
    	if (nationality.trim().isEmpty()) {
    		 Alert alert = new Alert(AlertType.ERROR, "Tenant Nationality is required");
     		alert.showAndWait();
     		return;
    	
       	
    	}
       
       	
    	//*********** need toDo ************
    	
    	
    	LocalDate visaExpiryDate= VisaExpiryDateDatePicker.getValue();
    	if (visaExpiryDate == null) {
    		 Alert alert = new Alert(AlertType.ERROR, "Tenant Visa Expiry date is required");
      		alert.showAndWait();
      		return;
    	}
    	
    	
    	LocalDate entryDate= entryDateDatePicker.getValue();
    	
    	if (entryDate == null) {
    		 Alert alert = new Alert(AlertType.ERROR, "Tenant entry date is required");
      		alert.showAndWait();
      		return;
    	}
    	
    	Visitor ts = new Visitor(tenantId,name,phoneNum,address,nationality,passportNo,visaExpiryDate,entryDate);
       	
    	App.db.addTenant(ts);
    	
    	System.out.println("added Tenant: " +App.db.getTenants());
    	Alert alert = new Alert(AlertType.INFORMATION, "Tenant added sucessfully");
   		alert.showAndWait();
   
   		Stage stage = (Stage) okButton.getScene().getWindow(); 
    	stage.close();
    	

    }

}
