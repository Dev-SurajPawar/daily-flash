/*
Program 2: Write a Program that takes rupees as input from the user and convert them into dollars.
*/

import java.io.*;

class Currency_Converter{

      public static void main(String[]args)throws IOException{
      
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
	  float Dollers=0;
	  System.out.println("Enter Rupees");

              float rupees=Float.parseFloat(br.readLine()); 
	      System.out.println(rupees+" Rupees convert in Dollers");

	              Dollers=rupees/72;

	               System.out.println("Dollers = "+Dollers+"$") ;	      
      }
}
