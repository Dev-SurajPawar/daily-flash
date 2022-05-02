/*
Program 1: Write a Program to determine whether a number entered by a user is a Prime Number or Not.
{Note: Prime Number is such a number, which is only divisible by 1 & that number itself}
*/

import java.util.Scanner;

class Prime_Number{    
	
	public static void main(String[] args){    
    
  
		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
  
		int num1 = num/2;
	  	int flag = 0;	
 
	       	if(num==0||num==1){  
   
			System.out.println(num+" is not prime number");      
 
	       	}else{  
  
		       	for(int i=2;i<=num1;i++){      
    
				if(num%i==0){      
     
					System.out.println(num+" is not prime number");      
     
					flag=1;      
     
					break;      
    
				}      
   
			}      
   
			if(flag==0)  { System.out.println(num+" is prime number"); 
			
			}  
 
	       	}

	}    
} 

/*
Input: 5
Output: 5 is a Prime Number.
*/
