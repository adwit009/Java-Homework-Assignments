package day1;

import javax.swing.JOptionPane;

public class PrimeNumber {
public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("Enter a number.");//take a number from the user
	int x = Integer.parseInt(n);// convert that string into a variable
int flag = 0 //create flag (needed at the end of the program) variable
;
	 int y = (int) Math.sqrt(x);// take the sqrt of entered number(defined y) to speed things up 
	
	for (; y > 1; y--) { // for loop that will subtract 1 from y until y is 2 
		if (x%y == 0){ // checks if x divided by y is 0
			JOptionPane.showMessageDialog(null, x +" is not prime");// if so, prints "number is not prime"
		flag = 1;//changes flag
			break;//breaks loop to prevent move not prime messages
		}
		}
	if (flag == 1) { //checks flag 
	}
	//if flag did change to 1, the not prime was run and the program ends
	else{
	JOptionPane.showMessageDialog(null, x +" is prime");//if not, "number is prime" prints of the screen
}
	
	
	
	
	
	
	
	
}
}
