/*
Program 5: Write a Program to take marks of five subjects Physics, Chemistry,
Biology, Mathematics and Computer. Calculate percentage and grade
according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/

import java.util.*;

class Percentage_Grade {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Physics: ");
		int ph = sc.nextInt();                  // physics marks

		System.out.println("Chemistry: ");
		int ch = sc.nextInt();			// chemistry marks

		System.out.println("Biology: ");
		int bi = sc.nextInt();			// biology marks

		System.out.println("Mathematics: ");
		int ma = sc.nextInt();			// mathematics marks
		
		System.out.println("Computer: ");
		int co = sc.nextInt();			// computer marks
		
		int total= ((ph+ch+bi+ma+co)/5);	// (physics + chemistry + biology + maths + computer ) / 5

			if(total>=90){
				System.out.println("Grade A");
				

			}else if(total<90 && total>=80){
				System.out.println("Grade B");
				

			}else if(total<80 && total>=70){
				System.out.println("Grade C");
				

			}else if(total<70 && total>=60){
				System.out.println("Grade D");
				

			}else if(total<60 && total>=40){
				System.out.println("Grade E");
				

			}else if(total<40){
				System.out.println("Grade F");
				
			}

	}
	
}

/*
Physics: 
85
Chemistry: 
79
Biology: 
93
Mathematics: 
98
Computer: 
99
Grade A

*/
