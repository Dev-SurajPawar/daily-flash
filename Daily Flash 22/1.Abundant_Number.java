/*
 * Program 1: Write a Program to check whether the entered number is an Abundant number or not.
{Note: a number can be termed as abundant if the sum of all of its perfect
divisors is greater than that number itself, e.g. 12: 1+2+3+4+6 = 16 > 12 so 12
is an abundant number.}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Abundant_Number {

        public static void main(String[]args)throws IOException{
	
		System.out.println("Enter Number: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        	int num = Integer.parseInt(br.readLine());

		int sum = 0;

	        for(int i=1; i<num; i++){
		
		      if(num % i==0){
		      
		        System.out.print(i+" ");
			sum = sum + i;

		      }

		}
			System.out.println(" = "+sum);
		 
	                   if(sum!=num){
			   
			     System.out.println("Abundant Number");
			   
			   }else{
			   
				   System.out.println("Not Abundant Number");
			   
			   }	
	}

}

/*
 * Enter Number:
18
1 2 3 6 9  = 21
Abundant Number
*/
