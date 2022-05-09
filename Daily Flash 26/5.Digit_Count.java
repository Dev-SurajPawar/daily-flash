/*Program 5: Write a Program that takes a number as input from user and prints the counts the occurrence of Odd Digits & Even Digits from it
*/

import java.util.Scanner;

class Digit_Count {

  public static void main(String[] args) {

    
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();

	  int count1 = 0;
	  int count2 = 0;
    
	  while (num != 0)
	  {
		 
		  num /= 10;
			  
		  if(num%2!=0)
			  count1++;
		  else if (num%2==0)
			  count2++;
    
	  }
    
	  System.out.println("Number of Odd digits: " + count1);
	  System.out.println("Number of Even digits: " + count2);
  
  }

}

/*Input: 123458
Output: Number of Odd digits: 3
        Number of Odd digits: 3
*/
