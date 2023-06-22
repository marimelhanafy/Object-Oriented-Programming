package controller;

import java.io.IOException;
import java.util.Optional;

import app.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.House;

public class HouseController implements Refreshable {

	@FXML
	private Button addButton;

	@FXML
	private Button updateButton;

	@FXML
	private Button deleteButton;

	@FXML
	private Button saveButton;

	@FXML
	private TableView<House> houseTable;

	@FXML
	private TableColumn<House, Integer> houseNoCol;

	@FXML
	private TableColumn<House, String> addressCol;

	@FXML
	private TableColumn<House, String> descriptionCol;

	@FXML
	private TableColumn<House, Double> priceCol;

	@FXML
	private TableColumn<House, Boolean> availabilityCol;

	// make it global
	// List<House> houses =OOMRealStateApp.getHouses();
	// ObservableList<House> housesOL=FXCollections.observableArrayList(houses);

	@FXML
	void handelAdd(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddHouseView.fxml"));
		try {
			Parent root = loader.load();
			AddHouseController controller = loader.getController();
			controller.setRefreshable(this);
			// controller
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			
			
			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// handelUpdate(event);

	}// end handelAdd method

	

	@FXML
	void handelDelete(ActionEvent event) {

		House hs = houseTable.getSelectionModel().getSelectedItem();
		if (hs == null) 
		{
			
			showInformationDialog("Delete", "Failure", "please select any house to update!!");
		}
		else {
			
			Alert alert = new Alert(AlertType.CONFIRMATION,"",ButtonType.YES, ButtonType.NO);
			alert.setTitle("Confirmation");
			alert.setHeaderText("Please confirm");
			alert.setContentText("Are you sure to delete this house?");
			Optional<ButtonType> userAction = alert.showAndWait();
			
			if (userAction.get() == ButtonType.YES) {
				App.db.deleteHouse(hs.getHouseNo());
				showInformationDialog("Success", "Sucess", "House deleted successfully !!");
				refresh();
			}
			
			
		}
		
	}

	@FXML
	void handelSave(ActionEvent event) {

		App.db.saveData();
		
		showInformationDialog("Success", "Sucess", "Data saved successfully !!");
	}

	@FXML
	void handelUpdate(ActionEvent event) {

		House hs = houseTable.getSelectionModel().getSelectedItem();
		if (hs != null) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/UpdateHouseView.fxml"));
		try {
			Parent root = loader.load();
			UpdateHouseController controller = loader.getController();
			controller.setRefreshable(this);
			controller.setHouse(hs);
			

			// controller
			
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			
			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		else
		{
			showInformationDialog("Selection","please select","Please select a house to update its information");
		}

	}

	public void initialize() {
	
		houseNoCol.setCellValueFactory(new PropertyValueFactory<House, Integer>("houseNo"));
		addressCol.setCellValueFactory(new PropertyValueFactory<House, String>("address"));
		descriptionCol.setCellValueFactory(new PropertyValueFactory<House, String>("description"));
		priceCol.setCellValueFactory(new PropertyValueFactory<House, Double>("price"));
		availabilityCol.setCellValueFactory(new PropertyValueFactory<House, Boolean>("availabile"));
		refresh();

	}// end saveHouse method

	

	private void showInformationDialog(String title, String headerText, String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);
		alert.showAndWait();
	}

	@Override
	public void refresh() {
		/**/
		
		final ObservableList<House> data = FXCollections.observableArrayList(App.db.getHouses());
		System.out.println("Current houses: " + App.db.getHouses());
		houseTable.setItems(data);
		
		houseTable.refresh();
		
	}

	

}
