/*
Program 2: Write a Program to Swap two entered numbers without using a third temporary variable.
*/

import java.util.Scanner;

class Swapnumber {

	public static void main(String[] args){

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter First Value: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Value: ");
		int b = sc.nextInt();

	          System.out.println("Before Swap : " + a +" "+b);

	   if(a>b){

	          System.out.println("After Swap : " + b +" "+a);
    		  
	   }else{

	          System.out.println("After Swap : " + b +" "+a);
	   }

	}
}

/*
Input: 10 30
Output:
Before Swap: a = 10 & b = 20
After Swap: a = 20 & b = 10
*/
