/*
Program 2: Write a Program to take a integer raging between 0 to 6 and print
corresponding weekday
*/

import java.util.*;

class Days {

	public static void main(String[] args){
	
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int day= sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;


		default : 
			  System.out.println("You Enter Wrong Number");
			  break;
	}
        }
}

/*
Input: 2
Output: Wednesday
*/
