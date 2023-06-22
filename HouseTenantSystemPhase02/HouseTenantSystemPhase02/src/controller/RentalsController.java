package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import app.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.House;
import model.HouseRental;
import model.Invoice;
import model.Payment;
import model.Tenant;

public class RentalsController {

    @FXML
    private ComboBox<Integer> tenantComboBox;

    @FXML
    private ComboBox<Integer> houseComboBox;

    @FXML
    private DatePicker rentStartDateDatePicker;

    @FXML
    private DatePicker rentEndDateDatePicker;

    @FXML
    private TableView<HouseRental> rentalTable;

    @FXML
    private TableColumn<HouseRental, Date> rentalStartDateCol;

    @FXML
    private TableColumn<HouseRental, Date> rentalEndDateCol;

    @FXML
    private TableColumn<HouseRental, Double> despositCol;

    @FXML
    private TableColumn<HouseRental, Integer> invoiceNoCol;

    @FXML
    private TableColumn<HouseRental, Date> invoiceDateCol;

    @FXML
    private TableColumn<HouseRental, Double> totalCol;

    @FXML
    void handelEndDate(ActionEvent event) {

    }

    @FXML
    void handelHouse(ActionEvent event) {

    }

    @FXML
    void handelStartDate(ActionEvent event) {

    }

    @FXML
    void handelTenant(ActionEvent event) {

    }
    
    @FXML
    void handleRent(ActionEvent event) {

    	int hId = houseComboBox.getSelectionModel().getSelectedItem();
    	House h = App.db.findHouse(hId);
    	
    	int tId = tenantComboBox.getSelectionModel().getSelectedItem();
    	Tenant t = App.db.findTenant(tId);
    	
    	LocalDate sdate = rentStartDateDatePicker.getValue();
    	
    	LocalDate edate = rentEndDateDatePicker.getValue();
    	
    	
    	double deposit = h.getPrice()/2;
    	Payment p = new Payment("Deposit", 1,"Deposit for renatal", deposit, sdate);
    	ArrayList<Payment> payments = new ArrayList<>();
    	payments.add(p);
    	
    	Invoice inv = new Invoice( sdate, payments);
    	
    	HouseRental hr = new HouseRental(t, h, sdate, edate,deposit, inv);
    	App.db.addHouseRental(hr);
    	App.db.saveData();
    	
    	final ObservableList<HouseRental> data = FXCollections.observableArrayList(App.db.getHouseRentals());
    	rentalTable.setItems(data);
    	
    	
    }

    public void initialize() {
    	
    	rentalStartDateCol.setCellValueFactory(new PropertyValueFactory<HouseRental, Date>("rentalStartDate"));
    	rentalEndDateCol.setCellValueFactory(new PropertyValueFactory<HouseRental, Date>("rentalEndDate"));
    	despositCol.setCellValueFactory(new PropertyValueFactory<HouseRental, Double>("deposit"));
    	
    	
    	invoiceNoCol.setCellValueFactory(new PropertyValueFactory<HouseRental, Integer>("invoiceNo"));
    	invoiceDateCol.setCellValueFactory(new PropertyValueFactory<HouseRental, Date>("invoiceDate"));
    	totalCol.setCellValueFactory(new PropertyValueFactory<HouseRental, Double>("total"));
		
    	final ObservableList<HouseRental> data = FXCollections.observableArrayList(App.db.getHouseRentals());
    	rentalTable.setItems(data);
    	
    	ArrayList<Integer> housesIds =new ArrayList<>();
    	ArrayList<Integer> tenantIds =new ArrayList<>();
    	
    	for(House h : App.db.getHouses()) {
    		housesIds.add(h.getHouseNo());
    	}
    	
    	for(Tenant t : App.db.getTenants()) {
    		tenantIds.add(t.getTenantId());
    	}
    	
    	final ObservableList<Integer> houses = FXCollections.observableArrayList(housesIds);
    	final ObservableList<Integer> tenants = FXCollections.observableArrayList(tenantIds);
    	
    	
    	houseComboBox.setItems(houses);
    	
    	tenantComboBox.setItems(tenants);

	}// end saveTenant method

}
