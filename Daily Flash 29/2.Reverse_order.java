/*
Write a Program to display a number in reverse order.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Reverse_Order{

	public static void main(String[] args) throws IOException{

		System.out.print("Enter Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String token= st.nextToken();
			int num= Integer.parseInt(token);
		
			 int rev=0;

			 while (num>0)
			 {

				int rem= num % 10;

				rev= rev * 10 + rem;
				num= num/10;
			 }

			 System.out.println(rev);
		}

	}

}

/*
Input: 123456
Output: 654321
*/
