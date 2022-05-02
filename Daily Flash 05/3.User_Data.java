/*
Program 3: Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and
then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work
in anywhere
if employee is male and age is in between 40 t0 60 then he will work in
urban areas only.And any other input of age should print "ERROR".
*/

import java.util.*;

class User_Data {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age: ");
		int age = sc.nextInt();                  

		System.out.println("Enter sex in M or F: ");
		char sex = sc.next().charAt(0);

		System.out.println("Enter Marital Status in Y or N: ");
		char status = sc.next().charAt(0);

			if(sex=='F'|| sex=='f'){

				System.out.println("She will work only in urban area");
				

			}else if(sex=='M'||sex=='m' && age<20 && age>=40){

				System.out.println("He may Work in Anywhere");
				

			}else if(sex=='M'||sex=='m' && age<40 && age>=60) {
				System.out.println("He will Work in urban area only");
				

			}else {
				System.out.println("Error");
				
			}

	}
	
}	

/*
Enter Age: 
29
Enter sex in M or F: 
M
Enter Marital Status in Y or N: 
N
He may Work in Anywhere
*/
