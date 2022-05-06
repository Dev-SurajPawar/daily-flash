/*
Program 5: Write a Program that takes an array as input from the user and prints the array in reverse order.
*/

import java.util.Scanner;

class Reverse_Array {

    public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter size: ");
	    int n = sc.nextInt();
	    System.out.println("Enter Elements: ");
	    int [] arr = new int [n];

		for (int i=0; i<n; i++){

			arr[i]= sc.nextInt();

		}

		System.out.print("Reversed array is: ");
       
	       	for (int i = n-1 ; i >= 0; i--) {
            
			System.out.print(arr[i]+" ");

		}
    }
}

/*
Input: 1 2 3 4 5 6 7 8
Output: 8 7 6 5 4 3 2 1
*/
