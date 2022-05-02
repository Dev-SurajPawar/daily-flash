/*
Program 1: Write a Program to Find Maximum between two numbers
*/
import java.util.*;

class MaximumNumber{

	public static void main(String[] args){

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		int x= sc.nextInt();

		System.out.println("Enter Number: ");

                Scanner sc1 = new Scanner(System.in);

                int y= sc1.nextInt();

		if(x>y)
			System.out.println(x+" is Max number among "+ x +" & "+ y);
		
		else
			System.out.println(y+" is Max number among "+ y +" & "+ x);

	}
	
}

/*
Input: 1 2
Output: 2 is Max number among 1 & 2
*/
