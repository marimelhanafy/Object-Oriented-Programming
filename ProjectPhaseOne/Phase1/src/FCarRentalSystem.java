import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author ...
 * @date ...
 *
 */
public class FCarRentalSystem {
	private ArrayList <Car> cars = new ArrayList <Car> ();
	private ArrayList <Customer> customers = new ArrayList <Customer> ();
	private ArrayList <Rental> rentals = new ArrayList <Rental> ();

	public FCarRentalSystem(ArrayList<Car> cars, ArrayList<Customer> customers, ArrayList<Rental> rentals) {
		super();
		this.cars = cars;
		this.customers = customers;
		this.rentals = rentals;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}


	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}


	public ArrayList<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}


	public ArrayList<Rental> getRentals() {
		return rentals;
	}


	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}

	/**method to add customer
	 * @param customer
	 * @return confirmation message
	 */
	public String addCustomer (Customer customer) {
		customers.add(customer);
		return "added customer successfully";
	}

	/**method to find customer by his/her id
	 * @param customerId
	 * @return customer
	 */
	public Customer findCustomer (int customerId){
		for (Customer c: customers) {
			if(c.getCustomerId()==customerId)
				return c;
		}
		System.out.println("customer not found");
		return null;
	}

	/**method to delete customer by his/her id
	 * @param customerId
	 * @return confirmation message
	 */
	public String deleteCustomer (int customerId){
		for (Customer c: customers) {
			if(c.getCustomerId()==customerId)
				customers.remove(c);
			return "delete customer successfully";
		}
		return "customer not found";
	}

	/**method to add car
	 * @param car
	 * @return confirmation message
	 */
	public String addCar (Car car) {
		cars.add(car);
		return "added car successfully";
	}

	/** method to find car by its plate number
	 * @param plateNo
	 * @return car
	 */
	public Car findCar (String plateNo){
		for (Car entry: cars) {
			if(entry.getPlateNo()== plateNo)
				return entry;
		}
		System.out.println("plateNo is not avialble");
		return null;
	}

	/** method to delete car by its plate number
	 * @param plateNo
	 * @return confirmation message
	 */
	public String deleteCar (String plateNo) {
		for(Car entry: cars) {
			if (entry.getPlateNo()==plateNo ) {
				cars.remove(entry);
				//missing rental
				return "deleted car successfully";

			}

		}
		return "plateNo is not avialble";
	}

	/** method to search for available or non-available cars
	 * @param available
	 * @return array list of cars
	 */
	public ArrayList <Car> getCarByAvailability(boolean available){
		ArrayList<Car> x = new ArrayList <Car> ();
		for (Car entry: cars) {
			if (entry.isAvailable()== available) {
				x.add(entry);
			}

		}
		return x;
	}

	/** method to set the availability of car to true after the customer return it
	 * @param plateNo
	 * @return the invoice of the car
	 */
	public Invoice returnCar (String plateNo) {
		int mark=0;
		for (int i=0; i<rentals.size();i++) {
			if (plateNo.equals(rentals.get(i).getCar().getPlateNo())) {
				rentals.get(i).getCar().setAvailable(true);
				mark=i;
				return rentals.get(mark).getInvoice();
			}
		}
		return null;
	}

	/**method to set the availability of car to false after the customer book it
	 * @param rental
	 */
	public void bookCarRental (Rental rental) {
		for (Car c: cars) {
			if (c.getPlateNo().equals(rental.getCar().getPlateNo())) {
				c.setAvailable(false);
			}
		}
	}

	/** method to find car rental by customer id
	 * @param customerId
	 * @return array list of all rentals for the same customer
	 */
	public ArrayList<Rental> findCarRentalByCustomerId (int customerId){
		ArrayList<Rental> carRentalByCustomerId = new ArrayList<Rental>();
		for (Rental R: rentals) {
			if (customerId==R.getCustomer().getCustomerId()) {
				carRentalByCustomerId.add(R);
			}
		}
		return carRentalByCustomerId;
	}

	/** method to delete car rental by customer id
	 * @param customerId
	 */
	public void deleteCarRental (int customerId) {
		for (int i=0; i<rentals.size();i++) {
			if (customerId==rentals.get(i).getCustomer().getCustomerId()) {
				rentals.remove(i);
			}
		}
	}

	/**method to get all available car after a specific date
	 * @param date
	 * @return array list of cars
	 */
	public ArrayList<Car> getAvailableCarByDate(LocalDate date) {
		ArrayList<Car> availableCars = new ArrayList<Car>();
		for (Rental R : rentals) {
			if (R.getEndDate().isBefore(date)) {
				availableCars.add(R.getCar());
			}
		}
		for (Car c:cars) {
			if(c.isAvailable()) {
				availableCars.add(c);
			}
		}
		return availableCars;
	}


	@Override
	public String toString() {
		return "FComRentalSystem [cars=" + cars + ", customers=" + customers + ", rentals=" + rentals + "]";
	}

}


