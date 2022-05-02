/*
Program 4: Write a Program to simulate a simple calculator. Accept two
integers from the user and sign of operation also to perform operations.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Sign_Opration {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First Number: ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number: ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Enter sign of Operation: ");
		char sign = (char)br.read();

		if(sign == '+')
			System.out.println("Addition of "+num1+" & "+num2+" is "+ (num1+num2));
		else if(sign == '-')
		{
			if(num1>num2)
				System.out.println("Subtraction of "+num1+" & "+num2+" is "+ (num1-num2));
			else
				System.out.println("Subtraction of "+num1+" & "+num2+" is "+ (num2-num1));
		}
		else if(sign == '*')
			System.out.println("Multiplication of "+num1+" & "+num2+" is "+(num1*num2));
		else if(sign == '/')
		{
			if(num1>num2)
                                System.out.println("Division of "+num1+" & "+num2+" is "+ (num1/num2));
                        else
                                System.out.println("Division of "+num1+" & "+num2+" is "+ (num2/num1));
		}
		else
			System.out.println("Wrong Oprater");



	}
}

/*
Input:
Enter First Number: 10
Enter Second Number: 20
Enter the sign of Operation: +
Output: Addition of 10 & 20 is 30.
*/
