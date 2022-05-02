/*
Program 1: Write a Program that prints the series which increases with the number entered by the user.
*/

import java.io.*;

class Increment{

        public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number");

		 int num = Integer.parseInt(br.readLine());

		 for(int i=1;i<100;i++){
		  
			  System.out.print(i+num+" ");
			  
		 }
                 
	}
}

/*
Input: 15
Output: 16 31 46 . . ..
*/
