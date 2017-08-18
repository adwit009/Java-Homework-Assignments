package java_Homework;

import java.util.Scanner;

public class DateToDay {
public static void main(String[] args) {
	boolean leapyear = false; 
	Scanner keyboard = new Scanner(System.in); // next few lines get date
	System.out.println("This is a program which will determine the day of the week \nusing the date. It can only work for dates past 1/1/1900 (inclusive) ");
	System.out.println("Please enter the day of the month");
	int day;
	day = keyboard.nextInt();
	System.out.println("Please enter the month (number)");
	int month;
	month = keyboard.nextInt();
	System.out.println("Please enter the year (4 digits)");
	int year;
	year = keyboard.nextInt();
	int year1 = year;  //creates a copy
	year = year - 1900; // year is relative from 1900
	
	if (day <= 0|| month <= 0 || year1 <= 0) {  // next lines are checks for invalid inputs
		System.out.println("Please enter non-negetive numbers");
		System.exit(0);
	}
	if ( year < 0) {
		System.out.println("Please enter a year that is not under 1900");
		System.exit(0);
	}
	if (day >= 32|| month >= 13) {
		System.out.println("Please enter valid numbers only");
		System.exit(0);
	}
	
	int q1 = year/12;   // calculations from a formula
	int r1 = year%12;
	int total1 = (q1 + r1)%7;
	int q2 = r1/4;
	int total2 = (total1 + q2)%7;
    switch (month) {   
	case 1:
		total2 = total2 + 1;
		break;
	case 2:
		total2 = total2 + 4;
		break;
	case 3:
		total2 = total2 + 4;
		break;
	case 4:
		total2 = total2 + 0;
		break;
	case 5:
		total2 = total2 + 2;
		break;
	case 6:
		total2 = total2 + 5;
		break;
	case 7:
		total2 = total2 + 0;
		break;
	case 8:
		total2 = total2 + 3;
		break;
	case 9:
		total2 = total2 + 6;
		break;
	case 10:
		total2 = total2 + 1;
		break;
	case 11:
		total2 = total2 + 4;
		break;
	case 12:
		total2 = total2 + 6;
		break;
		
	//default:
	//	break;
	}
total2 = total2 % 7; 
total2 = (total2 + day)%7;
if (year1 %4 == 0) {
leapyear = true;    // determines leap year
}
if (year1 %100 == 0) {
	leapyear = false;


if (year1 %400 == 0) {
	leapyear = true;
}
}
if (leapyear == true) { // checks if leap year is valid in this situation
	if (month <= 2) {
		if (day < 29) {
			total2 = (total2 - 1)%7;
		}
	}
}
total2 = total2 - 1;   
switch (total2) {   // uses switch to printout input date with the day of the week
case 0:             // there are 7 possible outputs for the calculations (0-6)     
	                // 0 is Sunday, 1 is Monday etc.
	System.out.println(month+"/"+day+"/"+year1+" falls on a Sunday");
	break;
case 1:
	System.out.println(month+"/"+day+"/"+year1+" falls on a Monday");
	break;
case 2:
	System.out.println(month+"/"+day+"/"+year1+" falls on a Tuesday");
	break;
case 3:
	System.out.println(month+"/"+day+"/"+year1+" falls on a Wednesday");
	break;
case 4:
	System.out.println(month+"/"+day+"/"+year1+" falls on a Thursday");
	break;
case 5:
	System.out.println(month+"/"+day+"/"+year1+" falls on a Friday");
	break;
case 6:
	System.out.println(month+"/"+day+"/"+year1+" falls on a Saturday");
	break;
//default:
	//break;
}



}
}
