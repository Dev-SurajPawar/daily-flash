/*Program 3: Write a Program that accepts an integer value from the user and prints the sum of all digits from that number. 
*/

import java.util.Scanner;

class Digit_Count_Sum{

  public static void main(String[] args) {

    
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();

	  int sum = 0;
    
	  while (num != 0)
	  {
		 int rem = num%10;
		 sum = sum+rem;
		  num /= 10;
    
	  }
    
	  System.out.println("Total Sum: " +sum);

  
  }

}

/*Input: 15895
Output: Total Sum: 28
*/
