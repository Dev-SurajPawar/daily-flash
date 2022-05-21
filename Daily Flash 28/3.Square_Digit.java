/*
Program 3: Write a Program that accepts an integer value from the user
and prints the Square of each digit.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Square_Digit{

	public static void main(String[] args) throws IOException{

		System.out.print("Enter Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String token= st.nextToken();
			int num= Integer.parseInt(token);
			System.out.println("The Square of "+num+" is "+(num*num));
		}

	}
}

/*
Enter Number: 1 2 3 4 
The Square of 1 is 1
The Square of 2 is 4
The Square of 3 is 9
The Square of 4 is 16

*/
