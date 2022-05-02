/*
Program 1: Write a Program that prints a series of Prime numbers ranging between 1 to 100.
*/

import java.util.*;

class PrimeNo {
	 public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);

                
                System.out.println("Lower limit:  ");
			
		int x= sc.nextInt();
    
                System.out.println("Upper limit:  ");
			
		int y= sc.nextInt(); 
        
        
        for (int i=x; i<=y; i++)
	{
        
         int Prime= 0;
        
                for (int j=2; j<=i; j++)
		{

                    if(i%j==0)
		    {
                            Prime++;
                    } 
                }
                    if(Prime==1 && i!=1)
		    {
                        System.out.print(i+" ");
                    }
	}
     }
}

/*
Output: 1 2 3 5 . . .
*/
