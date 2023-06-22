package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;

/**
 * @author Marim Elhanafy
 * @date 15/04/2020
 * @version JDK 13.0
 *
 */
public class OOMRealStateApp {

	private  ArrayList<Tenant> tenants;
	private  ArrayList<House> houses;
	private  ArrayList<HouseRental> houseRentals;




	public OOMRealStateApp() {

		loadDate();
	}

	/**
	 * method to get tenants 
	 * @return tenants 
	 */
	public ArrayList<Tenant> getTenants() {
		return tenants;
	}//end get method

	/**
	 * method to get houses
	 * @return houses
	 */
	public  ArrayList<House> getHouses() {


		return houses;
	}//end get method

	/**
	 * method to get houseRentals
	 * @return houseRentals
	 */
	public ArrayList<HouseRental> getHouseRentals() {
		return houseRentals;
	}//end get method

	/**
	 * @param tenants
	 */
	public void setTenants(ArrayList<Tenant> tenants) {
		this.tenants = tenants;
	}//end set method

	/**
	 * @param houses
	 */
	public void setHouses(ArrayList<House> houses) {
		this.houses = houses;
	}//end set method

	/**
	 * @param houseRentals
	 */
	public void setHouseRentals(ArrayList<HouseRental> houseRentals) {
		this.houseRentals = houseRentals;
	}//end set method

	//methods 
	/**
	 * method to add tenant
	 * @param tenant
	 */
	public void addTenant(Tenant tenant) {
		tenants.add(tenant);

	}//end of addTenant method

	/**
	 * method to find a tenant with spicific Id 
	 * @param tenantId 
	 * @return Tenant object
	 */
	public Tenant findTenant(int tenantId){
		for(int i=0;i<tenants.size();i++){
			if(tenants.get(i).getTenantId()==tenantId){
				return tenants.get(i);
			}
		}
		return null;
	}//end of findTenant method


	/**
	 * method to delete for a specific tenant by their id 
	 * @param tenantId
	 */
	public void deleteTenant(int tenantId) {
		for(int i=0;i<tenants.size();i++){
			if(tenants.get(i).getTenantId()==tenantId){
				tenants.remove(i);
			}
		}
	}//end of deleteTenant method

	/**
	 * method to add house
	 * @param house
	 */
	public void addHouse(House house) {
		houses.add(house);

	}//end of addHouse method

	/**
	 * method to find house by specific id
	 * @param houseNo
	 * @return House object
	 */
	public House findHouse(int houseNo) {
		for(int i=0;i<houses.size();i++){
			if(houses.get(i).getHouseNo()==houseNo){
				return houses.get(i);
			}
		}
		return null;
	}//end of findHouse method

	/**
	 * method to delete house
	 * @param houseNo
	 */
	public void deleteHouse(int houseNo) {
		for(int i=0;i<houses.size();i++){
			if(houses.get(i).getHouseNo()==houseNo){
				houses.remove(i);
			}
		}	
	}//end of deleteHouse method

	/**
	 * method to Get all available houses.
	 * @param available
	 * @return ArrayList of houses
	 */
	public  ArrayList<House> getHouseByAvailability(boolean available){
		ArrayList<House> availableHouse = new ArrayList<>();
		for(House h : houses) {
			if(h.isAvailabile()) {
				availableHouse.add(h);
			}
		}
		return availableHouse;
	}//end of getHouseByAvailability method

	/**
	 * method to add houseRental
	 * @param houseRental
	 */
	public void addHouseRental(HouseRental houseRental ) {
		houseRentals.add(houseRental);

	}//end of addHouseRental method
	/**
	 * When a tenant leaves the house, the house status is updated to available.
	 * The invoice of that house is returned
	 * @param houseNo
	 * @return Invoice object
	 */
	public Invoice releaseHouse( int houseNo) {		

		int notAvailableHouseIndex=0;
		for (int i = 0; i < houses.size(); i++) {
			if (houses.get(i).getHouseNo() == houseNo) {
				houses.get(i).setAvailabile(true);
				notAvailableHouseIndex = i;
				break;
			}
		}
		return houseRentals.get(notAvailableHouseIndex).getInvoice();
	}//end of releaseHouse method
	/**
	 * method to find all the houses rented by  a specific tenant 
	 * @param tenantId
	 * @return ArrayList of houseRentals
	 */
	public ArrayList<HouseRental> findHouseRentalByTenantId(int tenantId){
		ArrayList<HouseRental> housesRentedByATenant =new ArrayList<>();

		for(HouseRental hr: houseRentals) {
			if(hr.getTenant().getTenantId()==tenantId) {
				housesRentedByATenant.add(hr);
			}
		}
		return housesRentedByATenant;
	}//end of findHouseRentalByTenantId method

	/**
	 * method to delete houseRental
	 * @param tenantId
	 */
	public void deleteHouseRental(int tenantId) {
		for(int i=0;i<houseRentals.size();i++){
			if(houseRentals.get(i).getTenant().getTenantId()==tenantId){
				houseRentals.remove(i);
			}
		}
	}//end of deleteHouseRental method
	/**
	 * Return all houses are available after a specific tenant id
	 * @param date
	 * @return
	 */
	public List<House> getAvailableHousesByDate(LocalDate date) {
		return houses.stream().filter(house -> houseRentals.stream()
				.anyMatch(rental -> rental.getRentalEndDate().isBefore(date) 
				&& house.getHouseNo() == rental.getHouse().getHouseNo())).collect(Collectors.toList());
	}//end of getAvailableHouseByData method

	//PHASE 2
	public  void saveData() {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("output.dat")));
			out.writeObject(tenants);
			out.writeObject(houses);
			out.writeObject(houseRentals);

			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//end of saveData method

	//PHASE 2
	public void loadDate()  {

		ObjectInputStream input;
		try {
			input = new ObjectInputStream(new FileInputStream(new File("output.dat")));

			Object object =  input.readObject();
			if (object != null) 
				tenants= (ArrayList<Tenant>)object;

			object =  input.readObject();
			if (object != null) 
				houses=(ArrayList<House>)object;

			object =  input.readObject();
			if (object != null) 
				houseRentals=(ArrayList<HouseRental>) object;

			input.close();

		} 
		catch (IOException ex) 
		{
			System.out.println("File not found, All array lists will be initialized to empty lists");
			tenants = new ArrayList<>();
			houses = new ArrayList<>();
			houseRentals = new ArrayList<>();

		}
		catch( ClassNotFoundException ex) {

		}




	}

	@Override
	public String toString() {

		return "OOMRealStateApp: tenants= " + tenants + ",\n\n\nhouses= " + houses + ",\n\n\nhouseRentals= " + houseRentals + "\n\n";
	}//end toString method
}//end of class

