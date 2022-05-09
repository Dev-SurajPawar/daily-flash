/*
Program 1: Write a Program to check whether the entered number is a Strong Number or Not.
{Note: A number can be termed as a strong number; if the sum of factorials of each digit from that number is equal to that number, itself. e.g. 145 is a Strong Number since 1 + 24 + 120 = 145.}
*/

import java.util.Scanner;

class Strong_Number{

  public static void main(String[] args) {

	  System.out.print("Enter Number: ");	  
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  
	  int temp= num;
	  int sum = 0; 
	  
	  while (num!=0)
	  {
		  int rem=num%10;
		  int fact = 1;
		  for(int i=1;i<=rem;i++)
		  {
			fact = fact*i;
		  }
		  
		  sum = sum + fact;
		  num=num/10;
	  }
    
	  if(sum==temp)
	  	System.out.println("Strong Number: " +temp);
	  	
	  else
		  System.out.println("Not Strong Number: " +temp);
  }

}

/*
Input: 145
Output: 145 is a Strong Number.
*/
