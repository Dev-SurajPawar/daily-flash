/*
Program 1: Write a Program to check whether the Character is Uppercase or
Lowercase Character.
*/

import java.util.*;

class UpperCase {

	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter character: ");
	
	char ch = sc.next().charAt(0);

        	if (ch>=65 && ch<=90 ){
         
	     		System.out.println("letter " +ch+ " is in Uppercase");

        	} else if (ch>=97 && ch<=122) {

        	    	System.out.println("letter " +ch+ " is in lowercase");
        
		}
	}
}

/*
Input: v
Output: letter v is in lowercase
*/
