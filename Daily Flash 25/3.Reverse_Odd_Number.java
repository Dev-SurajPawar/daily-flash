/*
 * Program 3: Write a Program that accepts an integer value from the user and
prints all odd numbers from that number to 1 using a while loop. */

import java.util.Scanner;

class Reverse_Odd_Numbers{
        
        public static void main(String[] args){
        
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number: ");
                int num = sc.nextInt();

                while(num>=0)
                {
                        if(num%2!=0)
                                System.out.print(num+" ");

			num--;

                }

        }
}      

/*Input: 65
Output: 65 63 61 59 57 55 53 51 . . . .. 1
*/
