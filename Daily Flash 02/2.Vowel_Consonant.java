/*
Program 2: Write a Program to check whether the Character is Vowel or
Consonant.
*/

import java.util.*;

class VowelOrConsonant {

	public static void main(String[] args){
		
		System.out.println("Enter Character: ");
		Scanner sc = new Scanner(System.in);
		char var = sc.next().charAt(0);

        if(var=='A'||var=='E'||var=='I'||var=='O'||var=='U'||var=='a'||var=='e'||var=='i'||var=='o'||var=='u'){
            System.out.println(var+" Is a Vowel");
        } else {
            System.out.println(var+ "Is a consonant");
        }
	}
}
/*
Input: E
Output: E Is a Vowel
*/
