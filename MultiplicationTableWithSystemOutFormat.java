package day1;

public class MultiplicationTableWithSystemOutFormat {
	public static void main(String[] args) {
		System.out.println("               Multiplication Table"); //print title
		int multipicationTableLenght = 9; // set length
		System.out.print("     ");
		for (int i = 1; i < multipicationTableLenght + 1; i++) {
			System.out.print("   " +i + " "); // print x axis
			
		} 
		System.out.println();
		System.out.println("-------------------------------------------------");//print x axis divider

		int x = 1;
		for (int i = 1; i < multipicationTableLenght + 1; i++) {
			System.out.print(i+" | "); // print beginning of a row 

			for (int j = 1; j < multipicationTableLenght+ 1; j++) {
			int jx = j * x; // create variable for next number in the row
			System.out.format("% 5d", jx); // formats the number so it has 5 digits (any undefined digits are made into leading spaces)

		
			
			}

			x = x  + 1; 
		System.out.println();   // goes to next line
		
		}

		}                     
}
