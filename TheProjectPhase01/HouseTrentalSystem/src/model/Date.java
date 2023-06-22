package model;

/**
 * @author Marim Elhanafy - Mariam Abdelsalam - Hagar Elsayed - Wadha Albadr
 * @date 07/03/2020
 * @version JDK 13.0
 *
 */
public class Date {

	/**
	 * The month from 1 to 12
	 */
	private int month;
	
	/**
	 * The day from 1 to 31 based on month
	 */
	private int day;
	
	/**
	 * The year 
	 */
	private int year;

	
	/**	 Constructor: call checkMonth to chick the value of month;
	 * 		 		call checkDay to chick value of day;
	 * @param theDay
	 * @param theMonth
	 * @param theYear
	 */
	public Date(int theDay, int theMonth, int theYear) {
		month = checkMonth(theMonth); 
		year = theYear; 
		day = checkDay(theDay); 
	}

	
	/** utility method to chick the month value
	 * @param testMonth
	 * @return value of month and return 1 (January) as a default month
	 */
	private static int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12)
			return testMonth;
		else
			return 1;
	}

	/**	 utility method to chick day value based on range for month and leap year or not
	 * @param testDay
	 * @return value of day and return 1 (first day of the month) as a default day
	 */
	private int checkDay(int testDay) {
		// check if day in range for month
		if (testDay > 0 && testDay <= daysPerMonth(month, year))
			return testDay;
		// check for leap year
		if (month == 2 && testDay == 29 && Date.isLeap(year))
			return testDay;
		return 1;
	}
	
	/** method to chick if year is a leap or not
	 * @param year
	 * @return  true if the year is leap year
	 */
	public static boolean isLeap(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	/**	method to decide number of days in each month
	 *  the year parameter is needed to decide the number of days in February.
	 * @param month
	 * @param year
	 * @return the number of days in each month
	 */
	public static int daysPerMonth(int month, int year){
		month=checkMonth(month);//Validate month
		switch (month) {
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return isLeap(year)?29:28;
		default:
			return 31;
		}
	}

	/** method to compare between two days
	 * @param date
	 * @return false 
	 */
	public boolean compareTo(Date date) {
		boolean b=false;
		if (year>date.year) b= true;
		if (year==date.year) {
			if (month > date.month) b= true;
			if (month == date.month) {
				if (day>date.day) b= true;
				if (day==date.day) b= false;
			}
		}
		return b;
	}
	
	/**
	 * @return String of the form dd/mm/year
	 */
	public String toString() {
		return String.format("%02d/%02d/%d", day, month, year);
	} 

}
