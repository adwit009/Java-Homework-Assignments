package day1;



public class MultiplicationTable2 {
public static void main(String[] args) {
System.out.println("           Multiplication Table");
System.out.println();
int multipicationTableLenght = 9;
System.out.print("    ");
for (int i = 1; i < multipicationTableLenght + 1; i++) {
	System.out.print("   " +i + " ");
	
} 
System.out.println();
System.out.println("   ----------------------------------------------");

int x = 1;
for (int i = 1; i < multipicationTableLenght + 1; i++) {
	System.out.print(i+" | ");

	for (int j = 1; j < multipicationTableLenght+ 1; j++) {
	
	int jx = j * x;
	if (jx-10<0) {
		System.out.print("   "+jx+" ");
		}	
	else if(jx - 100 <  0){
		System.out.print("  "+jx+" ");
	}
	else if(jx - 1000 < 0){
		System.out.print(" "+jx+" ");
	}

	
	}

	x = x  + 1;
System.out.println();
System.out.println("  |");

}
}                     
}
