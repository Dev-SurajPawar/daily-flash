/*
Program 3: Write a Program to that accepts two integers from user and calculates the Quotient & Reminder from their division
*/

import java.io.*;

class Quotient_Reminder{

	public static void main(String []args)throws IOException{

	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                      
	         System.out.println("Calculate Quotient & remainder");
                  
	       	 System.out.println("Enter Number: ");
		 int x = Integer.parseInt(br.readLine());

	       	 System.out.println("Enter Division Value: ");
		 int y = Integer.parseInt(br.readLine());
      
                 int Quotient = x / y;
                 int Remainder = x % y;

                    System.out.println("Quotient = "+ Quotient);
                    System.out.println("Remainder = "+ Remainder);
	}

}
/*
Input: 10 5
Output:
Quotient: 2
Reminder: 0
*/
