package controller;

import java.io.IOException;
import java.util.Date;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.House;
import model.Tenant;

public class TenantController  implements Refreshable{

	@FXML
	private Button addButton;

	@FXML
	private Button updateButton;

	@FXML
	private Button deleteButton;

	@FXML
	private Button saveButton;

	@FXML
	private TableView<Tenant> tenantTable;

	@FXML
	private TableColumn<Tenant, Integer> idCol;

	@FXML
	private TableColumn<Tenant, String> nameCol;

	@FXML
	private TableColumn<Tenant, String> phoneCol;

	@FXML
	private TableColumn<Tenant, String> addressCol;

	@FXML
	private TableColumn<Tenant, String> nationalityCol;

	@FXML
	private TableColumn<Tenant, Integer> passportNoCol;

	@FXML
	private TableColumn<Tenant, Date> entryDateCol;

	@FXML
	private TableColumn<Tenant, Date> expireDateCol;

	@FXML
	void handelAdd(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AddTenantView.fxml"));
		try {
			Parent root = loader.load();
			// controller
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);

			stage.focusedProperty().addListener((observable, oldValue, newValue) -> {
				if (!newValue) {
					refreshTable();
				}
			});

			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// handelUpdate(event);

	}// end handelAdd method


	@FXML
	private void refreshTable() {

		System.out.println("Current houses: " + App.db.getTenants());
		final ObservableList<Tenant> tData = FXCollections.observableArrayList(App.db.getTenants());
		

		tenantTable.setItems(tData);
	}
	@FXML
	void handelDelete(ActionEvent event) {
		Tenant te = tenantTable.getSelectionModel().getSelectedItem();
		if (te == null) {
			showInformationDialog("Delete", "Failure", "please select any tenent to delete!!");
		}
		else {
			App.db.deleteTenant(te.getTenantId());
			App.db.saveData();
			showInformationDialog("Success", "Sucess", "Tenant deleted successfully !!");
			refreshTable();
		}
	}

	@FXML
	void handelSave(ActionEvent event) {
		App.db.saveData();

		showInformationDialog("Success", "Sucess", "Data saved successfully !!");
		
	}

	@FXML
	void handelUpdate(ActionEvent event) {
		Tenant te = tenantTable.getSelectionModel().getSelectedItem();
		if (te != null) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/UpdateTenantView.fxml"));
		try {
			Parent root = loader.load();
			UpdateTenantController controller = loader.getController();
			controller.setRefreshable(this);
			controller.setTenant(te);
			

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
			showInformationDialog("Selection","please select","Please select a tenant to update his/her information");
		}

	}

	
	private void showInformationDialog(String title, String headerText, String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);
		alert.showAndWait();
	}

	public void initialize() {
		idCol.setCellValueFactory(new PropertyValueFactory<Tenant, Integer>("tenantId"));
		nameCol.setCellValueFactory(new PropertyValueFactory<Tenant, String>("name"));
		phoneCol.setCellValueFactory(new PropertyValueFactory<Tenant, String>("phone"));
		addressCol.setCellValueFactory(new PropertyValueFactory<Tenant, String>("address"));
		nationalityCol.setCellValueFactory(new PropertyValueFactory<Tenant, String>("nationaliy"));
		passportNoCol.setCellValueFactory(new PropertyValueFactory<Tenant, Integer>("passportNo"));
		entryDateCol.setCellValueFactory(new PropertyValueFactory<Tenant, Date>("entryDate"));
		expireDateCol.setCellValueFactory(new PropertyValueFactory<Tenant, Date>("visaExpiryDate"));
		
		refresh();

	}// end saveTenant method


	@Override
	public void refresh() {
		/**/
		
		final ObservableList<Tenant> data = FXCollections.observableArrayList(App.db.getTenants());
		System.out.println("Current tenants: " + App.db.getTenants());
		tenantTable.setItems(data);
		
		tenantTable.refresh();
		
	}



}
