/*
Program 2: Write a program that takes electricity unit charges as input and
calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit.
*/

import java.util.*;

class Unit_Charges {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Unit Consumed: ");
		double unit = sc.nextDouble();  

			if(unit<=50){

				System.out.println(unit*0.50);
				

			}else if(unit<50 && unit>=150){

				System.out.println(unit*0.75);
				

			}else if(unit<150 && unit>=250){

				System.out.println(unit*1.20);
				

			}else {

				System.out.println(unit*1.50);
				
			}

	}
	
}	

/*
Unit Consumed: 
150
225.0
*/
