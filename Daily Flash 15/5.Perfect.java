/*
Program 5: Write a Program that prints a series of perfect numbers up to the entered limiting number.
*/

import java.io.*;

class Perfect_Number{

        public static void main(String[]args)throws IOException{
	
	System.out.println("Enter Number Range");

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        	int num = Integer.parseInt(br.readLine());

		for(int i=1; i<=num;i++){

		int temp=0;

	        for(int j=1;j<i;j++){
		
		      if(i%j==0){
		      
		        temp=temp+j;
		     }
		}
	              if(temp==i) 
			     System.out.print(i+" ");
		}
	
	}
}

/*
Input: 100
Output: The Series of all perfect number from 1 to 10 is
:wq
6, 28
*/
