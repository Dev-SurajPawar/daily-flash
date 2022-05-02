/*
Program 1: Write a Program to check whether the Character is Alphabet or not.
*/

import java.util.*;

class character {

	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter character: ");
	
	char ch = sc.next().charAt(0);

        	if (ch>=65 && ch<=90 || ch>=97 && ch<=122 ){
         
	     		System.out.println(ch+ " is an Alphabet");

        	} else {

        	    	System.out.println(ch+ " is not an Alphabet");
        
		}
	}
}

/*
Input: v
Output: v is an Alphabet.
*/
