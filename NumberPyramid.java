package day1;

public class NumberPyramid {
public static void main(String[] args) {
int space = 30; // variable for spaces ahead of numbers
	for (int i = 0, b = 1; i < 8; i ++, b = b+2 ) { // loop to reset variable, go to next line
		                                              //define a variable b( tells how many numbers in a certain row) 
		                                              //and lessen the space variable (so the next row is not as far)
		int j1 = 1;
		for (int j = 0; j < space; j++) {       // prints spaces before row
			System.out.print(" ");
		}
		for (int j = 1; j <b + 1 ;j++) {    //runs as many times as b (the amount of numbers in that row)
		int y2 = (b+1)/2;
			if(j > (b+1)/2 ) {             // if it is past the 1/2 mark, it starts dividing by 2 (for the decrease)
				j1 = j1 / 2 ;
				System.out.format("% 4d",j1);			
			}
			else{                                 // if not, it prints the number and then multiplies it by 2 (for the next  time it prints)
			System.out.format("% 4d" ,j1);        // this variable is resent in the outer for loop so each row is a new start
			j1 = j1* 2;	
			}
			if (j == y2) {                     // this corrects the mistake that happens (the previous code prints then multiplies)
				j1 = j1 / 2;                   // the decreasing code divides by 2 but it also has to compensate for the already multiplied by 2 number (this code does that) 
			}	
		
		}
		space = space - 4; //subtracts from the leading spaces (one number is added on the left side and each number takes 4 spaces) 
		System.out.println(); // goes to next line
		}
}
}
