package model;

import java.util.ArrayList;

/**
 * @author Marim Elhanafy
 * @date 12/03/2020
 * @version JDK 13.0
 *
 */
public class OOM_RealState {

	/**
	 * The list of tenants inside OOM Real State System
	 */
	private ArrayList <Tenant> tenants = new ArrayList <Tenant>();
	
	/**
	 * The list of houses inside OOM Real State System
	 */
	private ArrayList <House> houses = new ArrayList <House>();
	
	/**
	 * The list of house rentals inside OOM Real State System
	 */
	private ArrayList <HouseRental> houseRentals = new ArrayList <HouseRental>();
	

	/** constructor: initialize the list of tenants, houses, and house rentals
	 * @param tenants
	 * @param houses
	 * @param houseRentals
	 */
	public OOM_RealState(ArrayList<Tenant> tenants, ArrayList<House> houses, ArrayList<HouseRental> houseRentals) {
		this.tenants = tenants;
		this.houses = houses;
		this.houseRentals = houseRentals;
	}


	/** method to Add a new tenant to the system (resident or visitor)
	 * @param tenant
	 */
	public void addTenant (Tenant tenant) {
		tenants.add(tenant);
	}

	/** method to Search for a specific tenant by their id
	 * @param tenantId
	 * @return tenant that exists inside the OOM Real State System
	 */
	public Tenant findTenant (int tenantId) {
		Tenant tenant = null;
		for (int i=0; i<tenants.size();i++) {
			if (tenantId==tenants.get(i).getTenantId())
				tenant=tenants.get(i);
		}
		return tenant;
	}

	/** method to Delete a specific tenant by their id
	 * @param tenantId
	 */
	public void deleteTenant (int tenantId) {
		for (int i=0; i<tenants.size();i++) {
			if (tenantId==tenants.get(i).getTenantId()) {
				tenants.remove(i);
				break;
			}	
		}
	}

	/** method to Add a new House to the system (1 bedroom, 2 bedroom or 3 bedroom)
	 * @param house
	 */
	public void addHouse(House house) {
		houses.add(house);
	}

	/** method to Search for a specific house by its number
	 * @param houseNo
	 * @return house exists inside the OOM Real State System
	 */
	public House findHouse (int houseNo) {
		House house=null;
		for (int i=0; i<houses.size();i++) {
			if (houseNo==houses.get(i).getHouseNo())
				house=houses.get(i);
		}
		return house;
	}

	/** method to Delete a specific house by its number
	 * @param houseNo
	 */
	public void deleteHouse (int houseNo) {
		for (int i=0; i<houses.size();i++) {
			if (houseNo==houses.get(i).getHouseNo()) {
				houses.remove(i);
				break;
			}
		}
	}

	/** method to get all available or not available houses
	 * @param available
	 * @return list of houses that is available or not from the OOM Real State System
	 */
	public ArrayList<House> getHouseByAvailability (boolean available){
		ArrayList<House> availableHouses = new ArrayList<House>();
		for (House H: houses) {
			if (available==H.isAvailable()) {
				availableHouses.add(H);
			}
		}
		return availableHouses;
	}

	/** method to Add a new houseRental to the OOM Real State System
	 * @param houseRental
	 */
	public void addHouseRental (HouseRental houseRental) {
		houseRentals.add(houseRental);
	}

	/** method to set house status to available when a tenant leaves the house and The invoice of that house is returned
	 * @param houseNo
	 * @return the invoice of house when the tenant leaves it
	 */
	public Invoice releaseHouse(int houseNo) {
		int mark=0;
		for (int i=0; i<houseRentals.size();i++) {
			if (houseNo==houseRentals.get(i).getHouse().getHouseNo()) {
				houseRentals.get(i).getHouse().setAvailable(true);
				mark=i;
				return houseRentals.get(mark).getInvoice();
			}
		}
		return null;
	}

	/** method to Returns all the houses rented by a specific tenant
	 * @param tenantId
	 * @return list of houses rented by one tenant
	 */
	public ArrayList<HouseRental> findHouseRentalByTenantId (int tenantId){
		ArrayList<HouseRental> houseRentalByTenantId = new ArrayList<HouseRental>();
		for (HouseRental HR: houseRentals) {
			if (tenantId==HR.getTenant().getTenantId()) {
				houseRentalByTenantId.add(HR);
			}
		}
		return houseRentalByTenantId;
	}

	/** method to Delete specific houseRental by specific tenantId
	 * @param tenantId
	 */
	public void deleteHouseRental (int tenantId) {
		for (int i=0; i<houseRentals.size();i++) {
			if (tenantId==houseRentals.get(i).getTenant().getTenantId()) {
				houseRentals.remove(i);
			}
		}
	}

	/** method to Return all houses are available after a specific date
	 * @param date
	 * @return list of houses that will be available after specific date
	 */
	public ArrayList<House> getAvailableHouseByDate(Date date) {
		ArrayList<House> availableHouse = new ArrayList<House>();
		for (HouseRental hR : houseRentals) {
			if (hR.getRentalEndDate().compareTo(date)) {
				availableHouse.add(hR.getHouse());

			}
		}
		for (House h:houses) {
			if(h.isAvailable()) {
				availableHouse.add(h);
			}
		}
		return availableHouse;

	}

}
