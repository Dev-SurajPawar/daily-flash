/*
Program 3: Write a Program to take the number of months and print the
number of days in that month.
*/

import java.util.*;

class NumberToMonthDays {

	public static void main(String[] args){
	
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int month= sc.nextInt();

        switch (month){
            case 1:
                System.out.println("Jan has a 31 Day's");
                break;
            case 2:
                System.out.println("Feb has 28 Day's");
                break;
            case 3:
                System.out.println("Martch has 31 Day's");
                break;
            case 4:
                System.out.println("April has 30 Day's");
                break;
            case 5:
                System.out.println("May has 31 Day's");
                break;
            case 6:
                System.out.println("Jun has a 30 Day's");
                break;
            case 7:
                System.out.println("July has 31 Day's");
                break;
            case 8:
                System.out.println("August has 31 Day's");
                break;
            case 9:
                System.out.println("Spetember has 30 Day's");
                break;
            case 10:
                System.out.println("October has 31 Day's");
                break;
            case 11:
                System.out.println("November has 30 Day's");
                break;
            case 12:
                System.out.println("December has 31 Day's");
                break;

	
		default : 
			  System.out.println("You Enter Wrong Number");
			  break;
        }
        }
}

/*
Input: 4
Output: April has 30 Day's
*/
