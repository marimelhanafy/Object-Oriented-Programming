package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import model.House;


public class MainController {

	static House house;
	
    @FXML
    private Button housesButton;

    @FXML
    private Button tenantsButton;

    @FXML
    private Button rentalsButton;

    @FXML
    void handelHouses(ActionEvent event) throws IOException {
    	try {
    	Stage stage= new Stage();
    	BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/view/MainHouse.fxml"));
    	stage.setScene(new Scene(root, 800, 500));
         stage.setTitle("House");
         stage.show();
    	}catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    }
    	
    	
    	
    	
 

    @FXML
    void handelRentals(ActionEvent event) {
    	try {
        	Stage stage= new Stage();
        	BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/view/RentalView.fxml"));
        	stage.setScene(new Scene(root, 800, 500));
             stage.setTitle("Rental");
             stage.show();
        	}catch (Exception e) {
    			// TODO: handle exception
        		e.printStackTrace();
    		}
    }

    @FXML
    void handelTenants(ActionEvent event) {
    	try {
        	Stage stage= new Stage();
        	BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/view/MainTenant.fxml"));
        	stage.setScene(new Scene(root, 800, 500));
             stage.setTitle("Tenant");
             stage.show();
        	}catch (Exception e) {
    			// TODO: handle exception
        		e.printStackTrace();
    		}
    }
    
    @FXML
    public void initialize() {
    	housesButton.setText("Houses");
    	tenantsButton.setText("Tenants");
    	rentalsButton.setText("Rentals");
    }//end of initialize method

}
