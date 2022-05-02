/*
Program 3: Write a Program to Find whether the character is an alphabet, a
digit or a special character
*/

import java.util.*;

class SpecialCharacters {

	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter character: ");
	
	char sp = sc.next().charAt(0);

        	if (sp>=32 && sp<=47 || sp<=58 && sp>=64 ||sp<=91 && sp>=96 || sp<=123 && sp>=126 ){
         
	     		System.out.println( sp+ " is a Special character");

        	} else {

        	    	System.out.println(sp+ " is not a Special character");
        
		}
	}
}

/*
Input: *
Output: * is a Special character
*/:
