/*
 * Program 3: Write a Program that accepts an integer value from the user and
prints all even numbers from that number to 0 using a while loop. */

import java.util.Scanner;

class Reverse_Even_Numbers{
        
        public static void main(String[] args){
        
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number: ");
                int num = sc.nextInt();

                while(num>=0)
                {
                        if(num%2==0)
                                System.out.print(num+" ");

			num--;

                }

        }
}      

/*Input: 65
Output: 64 62 60 58 56 54 52 . . . .. 0
*/
