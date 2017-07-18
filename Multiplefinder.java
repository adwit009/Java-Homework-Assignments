package day1;

import javax.swing.JOptionPane;

public class Multiplefinder {
public static void main(String[] args) {
	
	String n1 =JOptionPane.showInputDialog("Give a number."); //asks for first number and stores it into a string (n1)
	String n2 = JOptionPane.showInputDialog("Give another number.");//asks for second number and stores it into a string(n2)	
	
	
	int x = Integer.parseInt(n1); //converts string n1 into int type variable (x)
	int y = Integer.parseInt(n2);//converts  string n2 into int type variable (y)
	int y2 = y;//creates a copy of y variable 
	
	
	if (x <  y) { //checks if x is less than y
		JOptionPane.showMessageDialog(null, "Error, please make sure your first number is larger than your second number");// if it is true, this prints an error statement
	}
	else{ //if not, this part runs
		
		
			
	for (; x > y; y = y + y2) { // for loop for printing multiples; it checks if x is still greater than y, prints y, then adds y2(copy of y1) to y
		System.out.println(y);
	}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


}
