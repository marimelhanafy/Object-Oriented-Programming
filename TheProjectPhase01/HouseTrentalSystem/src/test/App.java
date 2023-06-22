package test;

import java.util.ArrayList;
import model.*;

/**
 * @author Marim Elhanafy - Mariam Abdelsalam - Hagar Elsayed - Wadha Albadr
 * @date 16/03/2020
 * @version JDK 13.0
 *
 */
public class App {
	public static void main(String[] args) {

		//Creating 4 tenants (2 residents/ 2 visitors):
		Resident resident1 = new Resident(1, "Hagar Elsayed", "74085096", "Izghawa", "Canadian", 9, "QNB", "19");
		Resident resident2 = new Resident(2, "Wadha Albadr","74478951","Alazizia","Qatari",8,"Doha Bank","28");

		Date entryDate1 = new Date(1,1,2020);
		Date visaExpDate1 = new Date(1,1,2021);
		Visitor visitor1 = new Visitor(3, "Marim ELhanafy", "30309888", "Alsakhama", "Egyptian", 7, entryDate1, visaExpDate1);
		Date entryDate2 = new Date(1,3,2020);
		Date visaExpDate2 = new Date(1,3,2021);
		Visitor visitor2 = new Visitor(4, "Mariam Abdelsalam", "55774704", "Aldafna", "Lebanon", 6, entryDate2, visaExpDate2);

		//Creating ArrayList of tenants:
		ArrayList<Tenant> tenants = new ArrayList<Tenant>();
		tenants.add(resident1);
		tenants.add(resident2);
		tenants.add(visitor1);
		tenants.add(visitor2);

		//Displaying tenants ArrayList:
		System.out.println("All Tenants in OOM real system: \n");

		for (Tenant t: tenants) {
			System.out.println(t+"\n");
		}

		//Creating the types of houses (1 bedroom/ 2 bedrooms/ 3 bedrooms):
		HouseType houseType1 = new HouseType(1, "1 bedroom", 1000);
		HouseType houseType2 = new HouseType(2, "2 bedroom", 2000);
		HouseType houseType3 = new HouseType(3, "3 bedroom", 3000);

		//Creating 6 houses (2 of 1 bedroom/ 2 of 2 bedrooms/ 2 of 3 bedrooms):
		//					4 to be rented later and 2 to be available (not rented)
		House house1 = new House(10, "zone: 70, street: 4",true,houseType1);
		House house2 = new House(11, "zone: 70, street: 4",true,houseType1);
		House house3 = new House(20, "zone: 71, street: 5",true,houseType2);
		House house4 = new House(21, "zone: 71, street: 5",true,houseType2);
		House house5 = new House(30, "zone: 72, street: 6",true,houseType3);
		House house6 = new House(31, "zone: 72, street: 6",true,houseType3);

		//Creating ArrayList of houses:
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(house1);
		houses.add(house2);
		houses.add(house3);
		houses.add(house4);
		houses.add(house5);
		houses.add(house6);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Houses in OOM real system: \n");

		//Displaying houses ArrayList:
		for (House h: houses) {
			System.out.println(h+"\n");
		}

		//Creating payments: 1/ payment for rent 1 or 2 or 3 bedrooms and payment for the deposit of each one
		//					2/ payment for services (AC Service/ Electrical Service/ Monthly Grocery/ Cleaning/ Special Cleaning/ Decoration)
		Date paymentDate1 = new Date(1,2,2020);
		Payment payment1 = new Payment("rent 1 bedroom house",15,"rent 1 bedroom house",1000,paymentDate1);
		Payment payment01 = new Payment("Deposit",94,"Deposit of house",500,paymentDate1);
		Date paymentDate2 = new Date(1,3,2020);
		Payment payment2 = new Payment("rent 2 bedroom house",26,"rent 2 bedroom house",2000,paymentDate2);
		Payment payment02 = new Payment("Deposit",26,"Deposit of house",1000,paymentDate2);
		Date paymentDate3 = new Date(1,4,2020);
		Payment payment3 = new Payment("rent 3 bedroom house",37,"rent 3 bedroom house",3000,paymentDate3);
		Payment payment03 = new Payment("Deposit",26,"Deposit of house",1500,paymentDate3);
		Date paymentDate4 = new Date(1,5,2020);
		Payment payment4 = new Payment("AC Service",48,"Checking and Cleaning AC",100,paymentDate4);
		Date paymentDate5 = new Date(15,6,2020);
		Payment payment5 = new Payment("Electrical Service",59,"Checking Network",200,paymentDate5);
		Date paymentDate6 = new Date(1,7,2020);
		Payment payment6 = new Payment("Monthly Grocery",61,"Buying from supermarket",300,paymentDate6);
		Date paymentDate7 = new Date(15,8,2020);
		Payment payment7 = new Payment("Cleaning",72,"Clean house",100,paymentDate7);
		Date paymentDate8 = new Date(1,9,2020);
		Payment payment8 = new Payment("Special Cleaning",83,"Extra cleaning for house",200,paymentDate8);
		Date paymentDate9 = new Date(15,10,2020);
		Payment payment9 = new Payment("Decoration",94,"Redecorate house",300,paymentDate9);

		//Creating 4 ArrayLists of payments to each one of tenants:
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

		//Creating 4 invoices to each one of tenants:
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
		System.out.println("All Invoices in OOM real system: \n");

		//Displaying invoices ArrayList
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		//Using (modifylPayment) method that exist in Invoice class;
		//			to change the informations of payment number (83):
		invoice3.modifylPayment(new Payment("Cooking", 83, "Cooking 3 meals per day", 200, new Date (15, 9, 2020)));

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in OOM real system after using (modifyPayment) method: \n");

		//Displaying invoices ArrayList to check the payment number (83):
		//	it will change in invoices that it exists in them which are invoice number (3 and 4)
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (deletePayment) method: \n");

		//Using (deletePayment) method that exists in Invoice class;
		// 			to delete specific payment from its invoice;
		//			It will delete payment of ID number (94):
		System.out.println(invoice4.deletePayment(94));

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in OOM real system after using (deletePayment) method: \n");

		//Displaying invoices ArrayList to check the invoice number (4)
		//		to see that payment of ID number (94) deleted successfully:
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		//Using (addPayment) method that exists in Invoice class;
		// 			to add new payment to specific invoice;
		//			It will add new payment with ID number (94):
		invoice4.addPayment(new Payment("Decoration",94,"Redecorate house",300,paymentDate9));

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Invoices in OOM real system after using (addPayment) method: \n");

		//Displaying invoices ArrayList to check the invoice number (4)
		//		to see that payment of ID number (94) added successfully:
		for (Invoice i: invoices) {
			System.out.println(i+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (getPayment) method: ");

		//Using (getPayment) method that exists in Invoice class;
		// 			to get payment from specific invoice;
		//			It will get payment with ID number (83) from invoice number (3):
		System.out.println(invoice3.getPayment(83));

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (calculateTotalPayment) method: \n");

		//Using (calculateTotalPayment) method that exists in Invoice class;
		// 			to get total amount of payment from specific invoice;
		//			then total amount of payments of invoices from (1, 2, 3, and 4) will displayed:
		System.out.println("Invoice 1: "+invoice1.calculateTotalPayment());
		System.out.println("Invoice 2: "+invoice2.calculateTotalPayment());
		System.out.println("Invoice 3: "+invoice3.calculateTotalPayment());
		System.out.println("Invoice 4: "+invoice4.calculateTotalPayment());


		//Creating 4 house rentals
		//		Such that putting in house rental : tenant, house, start date, end date, specific deposit, and invoice
		Date rentalStartDate1 = new Date(1,2,2020);
		Date rentalEndDate1 = new Date(1,7,2020);
		HouseRental houseRental1 = new HouseRental(resident1, house1, rentalStartDate1, rentalEndDate1, 0.0, invoice1);
		Date rentalStartDate2 = new Date(1,3,2020);
		Date rentalEndDate2 = new Date(1,8,2020);
		HouseRental houseRental2 = new HouseRental(resident2, house3, rentalStartDate2, rentalEndDate2, 250.0, invoice2);
		Date rentalStartDate3 = new Date(1,4,2020);
		Date rentalEndDate3 = new Date(1,11,2020);
		HouseRental houseRental3 = new HouseRental(visitor1, house5, rentalStartDate3, rentalEndDate3, 1500.0, invoice3);
		Date rentalStartDate4 = new Date(1,4,2020);
		Date rentalEndDate4 = new Date(1,12,2020);
		HouseRental houseRental4 = new HouseRental(visitor2, house6, rentalStartDate4, rentalEndDate4, 500.0, invoice4);

		//Creating ArrayList of houseRentals:
		ArrayList<HouseRental> houseRentals = new ArrayList<HouseRental>();
		houseRentals.add(houseRental1);
		houseRentals.add(houseRental2);
		houseRentals.add(houseRental3);
		houseRentals.add(houseRental4);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All House Rentals in OOM real system: \n");

		//Displaying houseRentals ArrayList:
		for (HouseRental hr: houseRentals) {
			System.out.println(hr+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Total amount of payments in all House Rentals in OOM real system: \n");
		
		//Display the calculated total amount of payments of a specific tenant after deducted the deposit amount from it 
		for (HouseRental hr: houseRentals) {
			double d=hr.getInvoice().calculateTotalPayment()-hr.getDeposit();
			System.out.println("The total amount of payment after deducted the deposit for Tenant of ID: "+hr.getTenant().getTenantId()+" is: "+d+"\n");
		}
		
		//Creating 1 OOM Real State System
		OOM_RealState OOM1 = new OOM_RealState(tenants, houses, houseRentals);

		//Create new tenant (resident)
		//Using (addTenant) method to add new tenant to tenants ArrayList that exists in OOM Real State System
		Resident resident3 = new Resident(5, "Ahmed Mohamed","55771286","AlKhor","Turkish",5,"Doha Bank","55");
		OOM1.addTenant(resident3);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Tenants in OOM real system after using (addTenant) method: \n");

		//Displaying tenants ArrayList 
		//		to see the new tenant that has been added to tenants ArrayList:
		for (Tenant t: tenants) {
			System.out.println(t+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (findTenant) method: \n");

		//Using (findTenant) method to find specific tenant by his Id from OOM Real State System:
		//			then display the tenant;
		System.out.println(OOM1.findTenant(5));


		//Using (deleteTenant) method to delete tenant of Id number (5) from the OOM Real State System:
		OOM1.deleteTenant(5);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Tenants in OOM real system after using (deleteTenant) method: \n");

		//Displaying tenants ArrayList to check it after deleting tenant of Id number (5):
		for (Tenant t: tenants) {
			System.out.println(t+"\n");
		}

		//Using (addHouse) method to add new house to the OOM Real State System
		House house7 = new House(40, "zone: 73, street: 7",true,houseType1);
		OOM1.addHouse(house7);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Houses in OOM real system after using (addHouse) method: \n");

		//Displaying houses ArrayList to check it after adding new house in it:
		for (House h: houses) {
			System.out.println(h+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (findHouse) method: \n");

		//Using (findHouse) method to find house number (40) that exists in the OOM Real State System
		System.out.println(OOM1.findHouse(40));

		//Using (deleteHouse) method to delete house number (40) from OOM Real State System
		OOM1.deleteHouse(40);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Tenants in OOM real system after using (deleteHouse) method: \n");

		//Displaying houses ArrayList to check it after deleting house number (40):
		for (House h: houses) {
			System.out.println(h+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (getHouseByAvailability) method: ");
		System.out.println("All available houses: \n");

		//Using (getHouseByAvailability) method to find houses that are available in the OOM Real State System
		System.out.println(OOM1.getHouseByAvailability(true).toString());

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (getHouseByAvailability) method: ");
		System.out.println("All non available houses: \n");

		//Using (getHouseByAvailability) method to find houses that are not available in the OOM Real State System
		System.out.println(OOM1.getHouseByAvailability(false).toString());

		//Creating new house rental;
		//			then Using (addHouseRental) method that exists in OOM_RealState;
		//			to add new house rental to houseRentals ArrayList:
		Date rentalStartDate5 = new Date(1,8,2020);
		Date rentalEndDate5 = new Date(1,12,2020);
		HouseRental houseRental5 = new HouseRental(resident1, house7, rentalStartDate5, rentalEndDate5, 0.0, invoice4);
		OOM1.addHouseRental(houseRental5);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All House Rentals in OOM real system after using (addHouseRental) method: \n");

		//Displaying houseRentals ArrayList after adding new house rental to it:
		for (HouseRental hr: houseRentals) {
			System.out.println(hr+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (releaseHouse) method: \n");

		//Using (releaseHouse) method to set house status to available when a tenant leaves the house and The invoice of that house is returned:
		System.out.println(OOM1.releaseHouse(20));

		System.out.println("_____________________________________________________________________________");
		System.out.println("Using (findHouseRentalByTenantId) method: \n");

		//Using (findHouseRentalByTenantId) method to finds all the houses rented by one specific tenant (tenant of Id number 1)
		System.out.println(OOM1.findHouseRentalByTenantId(1).toString());

		//Using (deleteHouseRental) method to Delete specific houseRental by specific tenantId (tenant of Id number 1)
		OOM1.deleteHouseRental(1);

		System.out.println("_____________________________________________________________________________");
		System.out.println("All House Rentals in OOM real system after using (deleteHouseRental) method: \n");

		//Displaying houseRentals ArrayList after deleting house rental of tenant Id (1) from it:
		for (HouseRental hr: houseRentals) {
			System.out.println(hr+"\n");
		}

		System.out.println("_____________________________________________________________________________");
		System.out.println("All Houses will be Available after specific date using (getAvailableHouseByDate) method: ");

		//Using (getAvailableHouseByDate) method to find all houses are available after a specific date;
		//			then display them:
		for (House h: OOM1.getAvailableHouseByDate(new Date(1,10,2020))) {
			System.out.println(h+"\n");
		}

	}
}
