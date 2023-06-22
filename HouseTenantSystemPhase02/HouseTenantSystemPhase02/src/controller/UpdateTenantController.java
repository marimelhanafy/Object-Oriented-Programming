package controller;


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


public class UpdateTenantController {

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

	private Tenant tenant;

	private Refreshable refresh;
	@FXML
	void handleCancelButton(ActionEvent event) {

		Stage stage = (Stage) cancelButton.getScene().getWindow(); 
		stage.close();
	}

	public void setTenant(Tenant te) {
		System.out.println("setting house");
		this.tenant = te;

		Visitor v = (Visitor) te;
		
		tenantIDTextField.setText(String.valueOf(v.getTenantId()));
		nameTextField.setText(v.getName());
		addressTextField.setText(v.getAddress());
		passportTextField.setText(String.valueOf( v.getPassportNo()));
		VisaExpiryDateDatePicker.setValue(v.getVisaExpiryDate());
		entryDateDatePicker.setValue(v.getEntryDate());
		phoneTextField.setText(v.getPhone());
		nationalityTextField.setText(v.getNationaliy());
		
		//************** need to do *******************
		//	VisaExpiryDateDatePicker.setPromptText( te.getVisitor().getVisaExpiryDate());



	}




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
		//*********** need to do ************


		//DatePicker visaExpiryDate= VisaExpiryDateDatePicker;
		//DatePicker entryDate= entryDateDatePicker;
		//Visitor ts = new Visitor( passportNo,visaExpiryDate,entryDate);

	  	//house = App.db.findHouse(house.getHouseNo());
       	
		tenant.setAddress(address);
		tenant.setName(name);
		tenant.setNationaliy(nationality);
	       tenant.setPhone(phoneNum);
	       tenant.setTenantId(tenantId);
	       
	       	
	    	
	    	
	    	System.out.println("Update tenant: " + tenant);
	    	Alert alert = new Alert(AlertType.INFORMATION, "tenant Updated sucessfully");
	   		alert.showAndWait();
	 
	   		
	   		refresh.refresh();
  
		Stage stage = (Stage) okButton.getScene().getWindow(); 
		stage.close();
	}

	public void initialize() {
		System.out.println("init");

	}//end of initialize method

	  public void setRefreshable(Refreshable ref) {
			this.refresh = ref;
		}
	   


}
