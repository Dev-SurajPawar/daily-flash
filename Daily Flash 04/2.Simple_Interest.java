/*
Program 2: Write a Program to calculate Simple Interest. Taking all essential
terms to compute as input.
*/

import java.util.*;

class Simple_Interest {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount: ");
		int amt = sc.nextInt();   // principle amount

		System.out.println("Enter rate of interest: ");
		double ri = sc.nextDouble();    // rate of interest
		
		System.out.println("Enter years: ");
		int yr = sc.nextInt();   // Duration in years


		double si = (amt*ri*yr)/100;  // principle amount * rate of interst * Duration in year 

		System.out.println("Enter Annual Interest Rate: " +si);
		

	}
			
}

/*
Enter Amount: 
15000
Enter rate of interest: 
2.4
Enter years: 
2
Enter Annual Interest Rate: 720.0
*/

