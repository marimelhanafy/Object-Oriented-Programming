package controller;


import app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import model.House;
import model.HouseType;

public class AddHouseController {
	

    @FXML
    private Button addButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField houseNoTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextField typeIDTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private ToggleGroup availability;



    @FXML
    private RadioButton radioYes;
    

    @FXML
    private RadioButton radioNo;
    
	
    private Refreshable refresh;
	
    @FXML
    void handleAddButton(ActionEvent event) {
    	int houseNo;
    	double price;
    	int id;
    	String tmp = houseNoTextField.getText();
    	try {
    	 houseNo = Integer.parseInt(tmp);
    	}catch (NumberFormatException cc) {
    		 Alert alert = new Alert(AlertType.ERROR, "House No should be an integer");
    		alert.showAndWait();
    		return;
    		 
    	}
    	String address = addressTextField.getText();
    	if (address.trim().isEmpty()) {
    		 Alert alert = new Alert(AlertType.ERROR, "Address is required");
     		alert.showAndWait();
     		return;
    	}
    	
    	boolean isAvailabile = radioYes.isSelected();
    	
    	tmp = typeIDTextField.getText();
       	try {
       	  id = Integer.parseInt(tmp);
       	
       	}catch (NumberFormatException cc) {
       		 Alert alert = new Alert(AlertType.ERROR, "House Type Id should be integer");
       		alert.showAndWait();
       		return;
       		 
       	}
       	
       	tmp = priceTextField.getText();
       	try {
       	  price = Double.parseDouble(tmp);
       	 
       	}catch (NumberFormatException cc) {
       		 Alert alert = new Alert(AlertType.ERROR, "Invalid value for price");
       		alert.showAndWait();
       		return;
       		 
       	}
       	String description = descriptionTextArea.getText();
       	HouseType ht = new HouseType(id,description,price);
       	
    	House h = new House(houseNo, address, isAvailabile, ht);
    	App.db.addHouse(h);
    	System.out.println("added house: " +App.db.getHouses());
    	Alert alert = new Alert(AlertType.INFORMATION, "House added sucessfully");
   		alert.showAndWait();
   
   		refresh.refresh();
   		
   		Stage stage = (Stage) addButton.getScene().getWindow(); 
    	stage.close();
    	
    }
    

    @FXML
    void handleCancelButton(ActionEvent event) {

    	Stage stage = (Stage) cancelButton.getScene().getWindow(); 
    	stage.close();
    }
  
	
    public void initialize() {
    	
    	
    }//end of initialize method


	

	public void setRefreshable(Refreshable ref) {
		this.refresh = ref;
	}

  
}
