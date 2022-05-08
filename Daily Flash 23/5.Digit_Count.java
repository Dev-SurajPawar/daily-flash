/*Program 5: Write a Program that takes a number as input from the user and
prints the digit count from that number.*/

import java.util.Scanner;

class Digit_Count {

  public static void main(String[] args) {

    
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();

	  int count = 0;
    
	  while ( num != 0)
	  {
			
		  num /= 10; 
		  ++count;
    
	  }
    
	  System.out.println("Number of digits: " + count);
  }

}

/*Input: 123458
Output: The number 123458 has 6 digits.
*/
