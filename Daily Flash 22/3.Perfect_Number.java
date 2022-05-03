/*
Program 3: Write a Program that skips the occurrence of perfect numbers using a continue statement. Print this sequence up to 100.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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
	              if(temp!=i) 
			     System.out.print(i+" ");
		}
	
	}
}

/*
Enter Number Range
100 
1 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
*/
