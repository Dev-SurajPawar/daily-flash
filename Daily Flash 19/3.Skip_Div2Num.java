/*
Program 3: Write a Program that skips the occurrence of numbers that are divisible by 2 using a continue statement. Print this sequence up to 100.
*/

import java.util.Scanner;

class Skip_Div2Numbers{
        
        public static void main(String[] args){
        
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number: ");
                int num = sc.nextInt();

                for(int i = 1; i<=num; i++)
                {
                        if(i%2!=0)
                                System.out.print(i+" ");

                }

        }
}      

/*
Output: 1 3 5 7 9 11 13 ….
*/  
