/*
Program 1: Write a program that accepts an integer from the user and print
it. Using BufferedReader class
*/

import java.io.*;

class Buffered_Reader {


	public static void main(String[] args) throws IOException {

		System.out.println("Enter Integer: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		System.out.println(num);
	}
}

/*
Input: 11
Output: 11
*/
