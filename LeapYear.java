package day1;

import com.spun.util.database.SQLQuery.FromPart;
public class LeapYear {
public static void main(String[] args) {
	boolean check = false;  // creates a check variable
	int minYear = 101; // starting date
	int maxYear = 2100; // ending date
	int y = 0;
	for (; ; ) { //forever loop ( that hits enter every time the inner loop is broken)
		for (; ; ) { // forever loop (that ends when 10 numbers have been printed)
		if (minYear%4 == 0) { //checks for divisibility by 4 (returns true if it is)
			check = true;
		}
		if (minYear%100 == 0 ) { // checks if the number is divisible by 100 (returns false if it is)
			check = false;
			if (minYear%400 == 0) { // if it is divisible by 100, this checks if it is divisible by 400, (if it is, it returns true)
				check = true;
			}
		}
		if ( check == true) { // checks if true is returned (if so, prints the number )
			//System.out.format("% 5d", minYear); //if you want the table formatted, uncomment this line and comment the next line
			System.out.print(minYear + " ");
			y++; // adds one to the numbers on a line checker
		}
		if (y == 10) { //if the numbers on a line check is 10 ( 10 numbers have been printed on this line)
			y = 0;     //it resets the checker and breaks the inner forever loop
			break;
		}
		if ( minYear >= maxYear) {  // checks if the minYear is equal to or exceeding the max check date
			System.exit(0);   // if so, ends the program
		}
		minYear ++; //adds one to the F
		check = false; // resets the check
		}
	System.out.println(); // hits enter
		
	}
}
}
