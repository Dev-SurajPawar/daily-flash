/*
Program 5: Write a Program that calculates addition of two complex numbers.
*/

import java.util.*;

class complex_numbers {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		System.out.println("Real Part: ");
		int real1 = sc.nextInt();
		System.out.println("Imaginary Number: ");
		int img1 = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		System.out.println("Real Part: ");
		int real2 = sc.nextInt();
		System.out.println("Imaginary Number: ");
		int img2 = sc.nextInt();

		System.out.println("The Addition of "+real1+"+"+img1+"i"+" & "+real2+"+"+img2+"i"+" is "+(real1+real2)+"+"+(img1+img2)+"i");

	}
}

/*
* Enter 1st Number: 
Real Part: 
5
Imaginary Number: 
4
Enter 2nd Number: 
Real Part: 
3
Imaginary Number: 
2
The Addition of 5+4i & 3+2i is 8+6i
*/
