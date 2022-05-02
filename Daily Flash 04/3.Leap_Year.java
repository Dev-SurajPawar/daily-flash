/*
Program 3: Write a Program to check if a year is leap year or not.
{Note: If a year is divisible by 4 then it is leap year but if the year is century
year like 2000, 1900, 2100 then it must be divisible by 400}
*/
import java.util.*;

class Leap_year {

	public static void main(String[] args){

		System.out.println("Enter Year: ");

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if(year%4==0){

			if(year%100==0){

				if(year%400==0){
					
					System.out.println(year+" is leap year");

				} else
					
					System.out.println(year+" is not leap year");

			} else

				System.out.println(year+" is leap year");
			
		} else 

			System.out.println(year+" is not leap year");
		

	}
}

/*
Enter Year: 
2202
2202 is not leap year

Enter Year: 
2024
2024 is leap year
*/
