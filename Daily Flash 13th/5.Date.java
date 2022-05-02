/*
Program 5: Write a Program which accepts date, month and year from
the user and checks for the validity of date according to month.
*/

import java.util.*;

class Day_Month_Year_Validity {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Day: ");
		int Day = sc.nextInt();

		System.out.println("Month: ");
		int Month= sc.nextInt();

		System.out.println("Year: ");
		int Year = sc.nextInt();
	
	if(Year>=1000 && Year<=9999){
	 
               if(Month>=1 && Month<=12){
			 
		       if((Day>=1 && Day<=31) && (Month==1 || Month ==3 || Month==5 || Month==7 || Month==8 || Month==10 || Month==12)){
				
					 System.out.println("Date Exit!..");
				
				} else if((Day>=1 && Day<=30) && (Month==4 || Month ==6|| Month==9 || Month==11)){
					 
					 System.out.println("Date Exit!!..");
			
			        } else if(Day==29 && Month ==2 &&(Year%4==0 || Year %100!=0)){
				
					 System.out.println("Date Exit!!..");
				
				}else{
					 System.out.println("Date doesn't  Exit!!..");
				   
				}
			 
			 }else{
			 
					System.out.println("Month is invalid plz try again");
			 
			 }

	 }else{
	 
		   System.out.println("Year is invalid plz try again");
	 
	 }

	}
}

/*
Day: 
28
Month: 
8
Year: 
1997
Date Exit!..

*/
