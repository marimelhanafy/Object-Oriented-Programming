import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ...
 * @date ...
 *
 */
public class Test {
	public static void main(String[] args) {

		//Creating 4 customers (2 residents/ 2 visitors):
		Resident resident1 = new Resident(1, "Moza", "97531246","Doha","Qatari","DL",123);
		Resident resident2 = new Resident(2, "Hissa", "80975312","Doha","Qatari","DL",456);

		Date entryDate1 = new Date(2020, 1, 1);
		Date visaExpDate1 = new Date(2021, 1, 1);
		Visitor visitor1 = new Visitor(3, "Nora", "46809753", "Doha", "Turkish", "DL", 123, entryDate1, visaExpDate1);
		Date entryDate2 = new Date(2020, 3, 2);
		Date visaExpDate2 = new Date(2021, 3, 2);
		Visitor visitor2 = new Visitor(4, "Asmaa", "12468097", "Doha", "Egyptian", "DL", 456, entryDate2, visaExpDate2);

		//Creating ArrayList of customers:
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(resident1);
		customers.add(resident2);
		customers.add(visitor1);
		customers.add(visitor2);

		//Displaying customers ArrayList:
		System.out.println("All Customers in FCar Rental System: \n");

		for (Customer c: customers) {
			System.out.println(c+"\n");
		}

		//Creating Cars of Different Types:
		Car car1 = new Car("123", "2020", CarType.SEDAN , true);
		Car car2 = new Car("456", "2020", CarType.SUV , true);
		Car car3 = new Car("789", "2020", CarType.VAN , true);
		Car car4 = new Car("012", "2020", CarType.TRUCK , true);
		Car car5 = new Car("345", "2020", CarType.SEDAN , true);
		Car car6 = new Car("678", "2020", CarType.SUV , true);
		Car car7 = new Car("901", "2020", CarType.VAN , true);
		Car car8 = new Car("234", "2020", CarType.TRUCK , true);


		//Creating ArrayList of cars:
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Cars in FCar Rental System: \n");

		//Displaying cars ArrayList:
		for (Car c: cars) {
			System.out.println(c+"\n");
		}

		//Creating payments
		Date paymentDate1 = new Date(1,2,2020);
		Payment payment1 = new Payment("a", 123, 10000, paymentDate1);
		Payment payment01 = new Payment("aa", 321, 15000, paymentDate1);
		Date paymentDate2 = new Date(1,3,2020);
		Payment payment2 = new Payment("b", 456, 20000, paymentDate2);
		Payment payment02 = new Payment("bb", 654, 25000, paymentDate1);
		Date paymentDate3 = new Date(1,4,2020);
		Payment payment3 = new Payment("c", 789, 30000, paymentDate3);
		Payment payment03 = new Payment("cc", 987, 35000, paymentDate1);
		Date paymentDate4 = new Date(1,5,2020);
		Payment payment4 = new Payment("d", 012, 10000, paymentDate4);
		Date paymentDate5 = new Date(15,6,2020);
		Payment payment5 = new Payment("e", 345, 20000, paymentDate5);
		Date paymentDate6 = new Date(1,7,2020);
		Payment payment6 = new Payment("f", 678, 30000, paymentDate6);
		Date paymentDate7 = new Date(15,8,2020);
		Payment payment7 = new Payment("g", 901, 10000, paymentDate7);
		Date paymentDate8 = new Date(1,9,2020);
		Payment payment8 = new Payment("h", 234, 20000, paymentDate8);
		Date paymentDate9 = new Date(15,10,2020);
		Payment payment9 = new Payment("i", 567, 30000, paymentDate9);

		//Creating 4 ArrayLists of payments to each one of customers:
		ArrayList<Payment> paymentList1 = new ArrayList<Payment>();
		paymentList1.add(payment1);
		paymentList1.add(payment01);
		paymentList1.add(payment5);
		paymentList1.add(payment4);
		ArrayList<Payment> paymentList2 = new ArrayList<Payment>();
		paymentList2.add(payment2);
		paymentList2.add(payment02);
		paymentList2.add(payment6);
		paymentList2.add(payment5);
		ArrayList<Payment> paymentList3 = new ArrayList<Payment>();
		paymentList3.add(payment3);
		paymentList3.add(payment03);
		paymentList3.add(payment8);
		paymentList3.add(payment7);
		ArrayList<Payment> paymentList4 = new ArrayList<Payment>();
		paymentList4.add(payment3);
		paymentList4.add(payment03);
		paymentList4.add(payment9);
		paymentList4.add(payment8);


		//Creating 4 invoices to each one of customers:
		Date invoiceDate1 = new Date(1,7,2020);
		Date invoiceDate2 = new Date(1,10,2020);
		Date invoiceDate3 = new Date(1,11,2020);
		Date invoiceDate4 = new Date(1,12,2020);
		Invoice invoice1 = new Invoice(1, invoiceDate1, paymentList1);
		Invoice invoice2 = new Invoice(2, invoiceDate2, paymentList2);
		Invoice invoice3 = new Invoice(3, invoiceDate3, paymentList3);
		Invoice invoice4 = new Invoice(4, invoiceDate4, paymentList4);

		//Creating ArrayList of invoices:
		ArrayList<Invoice> invoices = new ArrayList<Invoice> ();
		invoices.add(invoice1);
		invoices.add(invoice2);
		invoices.add(invoice3);
		invoices.add(invoice4);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in FCar Rental System: \n");

		//Displaying invoices ArrayList
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		//Using (modifylPayment):
		invoice3.modifyPayment(new Payment("v", 234, 35000, new Date (15, 9, 2020)));

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in FCar Rental System after using (modifyPayment) method: \n");

		//Displaying invoices ArrayList to check the payment number (234):
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (deletePayment) method: \n");

		//Using (deletePayment) method that exists in Invoice class;
		// 			to delete specific payment from its invoice;
		//			It will delete payment of ID number (567):
		System.out.println(invoice4.deletePayment(567));

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in FCar Rental System after using (deletePayment) method: \n");

		//Displaying invoices ArrayList to check the invoice number (4)
		//		to see that payment of ID number (567) deleted successfully:
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		//Using (addPayment) method that exists in Invoice class;
		// 			to add new payment to specific invoice;
		//			It will add new payment with ID number (567):
		invoice4.addPayment(new Payment("m", 567, 40000, paymentDate9));

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in FCar Rental System after using (addPayment) method: \n");

		//Displaying invoices ArrayList to check the invoice number (4)
		//		to see that payment of ID number (567) added successfully:
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (getPayment) method: ");

		//Using (getPayment) method that exists in Invoice class;
		// 			to get payment from specific invoice;
		//			It will get payment with ID number (234) from invoice number (3):
		System.out.println(invoice3.getPayment(234));

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (calculateTotalPayment) method: \n");

		//Using (calculateTotalPayment) method that exists in Invoice class;
		// 			to get total amount of payment from specific invoice;
		//			then total amount of payments of invoices from (1, 2, 3, and 4) will displayed:
		System.out.println("Invoice 1: "+invoice1.calculateTotalPayment());
		System.out.println("Invoice 2: "+invoice2.calculateTotalPayment());
		System.out.println("Invoice 3: "+invoice3.calculateTotalPayment());
		System.out.println("Invoice 4: "+invoice4.calculateTotalPayment());


		//Creating 4 car rentals:
		LocalDate rentalStartDate1 = LocalDate.of(2020,2,1);
		LocalDate rentalEndDate1 = LocalDate.of(2020,7,1);
		Rental carRental1 = new Rental(1, resident1, car1, rentalStartDate1, rentalEndDate1, 0.0, invoice1);
		LocalDate rentalStartDate2 = LocalDate.of(2020,3,1);
		LocalDate rentalEndDate2 = LocalDate.of(2020,8,1);
		Rental carRental2 = new Rental(2, resident2, car2, rentalStartDate2, rentalEndDate2, 250.0, invoice2);
		LocalDate rentalStartDate3 = LocalDate.of(2020,4,1);
		LocalDate rentalEndDate3 = LocalDate.of(2020,11,1);
		Rental carRental3 = new Rental(3, visitor1, car3, rentalStartDate3, rentalEndDate3, 1500.0, invoice3);
		LocalDate rentalStartDate4 = LocalDate.of(2020,4,1);
		LocalDate rentalEndDate4 = LocalDate.of(2020,12,1);
		Rental carRental4 = new Rental(4, visitor2, car4, rentalStartDate4, rentalEndDate4, 500.0, invoice4);

		//Creating ArrayList of carRentals:
		ArrayList<Rental> carRentals = new ArrayList<Rental>();
		carRentals.add(carRental1);
		carRentals.add(carRental2);
		carRentals.add(carRental3);
		carRentals.add(carRental4);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Car Rentals in FCar Rental System: \n");

		//Displaying carRentals ArrayList:
		for (Rental cr: carRentals) {
			System.out.println(cr+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Total amount of payments in all Car Rentals in FCar Rental System: \n");

		//Display the calculated total amount of payments of a specific tenant after deducted the deposit amount from it 
		for (Rental cr: carRentals) {
			double d=cr.getInvoice().calculateTotalPayment()-cr.getDeposit();
			System.out.println("The total amount of payment after deducted the deposit for Customer of ID: "+cr.getCustomer().getCustomerId()+" is: "+d+"\n");
		}

		//Creating 1 FCar Rental System
		FCarRentalSystem FCar1 = new FCarRentalSystem(cars, customers, carRentals);

		//Create new customer (resident)
		//Using (addCustomer) method
		Resident resident3 = new Resident(5, "Malak", "12345678", "Doha", "Sweden", "DL", 789);
		FCar1.addCustomer(resident3);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Customers in FCar Rental System after using (addTenant) method: \n");

		//Displaying customers ArrayList 
		//		to see the new customer that has been added to customers ArrayList:
		for (Customer c: customers) {
			System.out.println(c+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (findCustomer) method: \n");

		//Using (findCustomer) method to find specific customer by his Id from FCar Rental System:
		//			then display the customer;
		System.out.println(FCar1.findCustomer(5));


		//Using (deleteCustomer):
		FCar1.deleteCustomer(5);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Customers in FCar Rental System after using (deleteCustomer) method: \n");

		//Displaying customers ArrayList to check it after deleting customer of Id number (5):
		for (Customer c: customers) {
			System.out.println(c+"\n");
		}

		//Using (addCar) method
		Car Car7 = new Car("835", "2020", CarType.TRUCK, true);
		FCar1.addCar(car7);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Cars in FCar Rental System after using (addCar) method: \n");

		//Displaying cars ArrayList to check it after adding new car in it:
		for (Car c: cars) {
			System.out.println(c+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (findCar) method: \n");

		//Using (findCar) method:
		System.out.println(FCar1.findCar("835"));

		//Using (deleteCar) method:
		FCar1.deleteCar("835");

		//Using (bookCarRental) method
		FCar1.bookCarRental(carRental1);
		FCar1.bookCarRental(carRental2);
		FCar1.bookCarRental(carRental3);
		FCar1.bookCarRental(carRental4);		

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (getCarByAvailability) method: ");
		System.out.println("All available cars: \n");

		//Using (getCarByAvailability) method
		System.out.println(FCar1.getCarByAvailability(true).toString());

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (getCarByAvailability) method: ");
		System.out.println("All non-available cars: \n");

		//Using (getCarByAvailability) method
		System.out.println(FCar1.getCarByAvailability(false).toString());

		//Using (bookCarRental) method
		System.out.println("Using (bookCarRental) method:\nThe invoice of car with plate number: 789 is: "+FCar1.returnCar("789"));

		//Creating new car rental:
		LocalDate rentalStartDate5 = LocalDate.of(2020, 8, 1);
		LocalDate rentalEndDate5 = LocalDate.of(2020, 12, 1);
		Rental carRental5 = new Rental(5, resident1, car7, rentalStartDate5, rentalEndDate5, 0.0, invoice4);
		carRentals.add(carRental5);

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (findCarRentalByCustomerId) method: \n");

		//Using (findCarRentalByCustomerId) method:
		System.out.println(FCar1.findCarRentalByCustomerId(1).toString());

		//Using (deleteCarRental) method:
		FCar1.deleteCarRental(1);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Car Rentals after using (deleteCarRental) method: \n");

		//Displaying carRentals ArrayList after deleting car rental of customer Id (1) from it:
		for (Rental cr: carRentals) {
			System.out.println(cr+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Cars will be Available after specific date using (getAvailableCarByDate) method: ");

		//Using (getAvailableCarByDate) method
		LocalDate LD = LocalDate.of(2020,10,1);
		for (Car c: FCar1.getAvailableCarByDate(LD)) {
			System.out.println(c+"\n");
		}

	}
}

