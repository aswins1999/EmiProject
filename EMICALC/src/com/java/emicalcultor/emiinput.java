package com.java.emicalcultor;

import java.util.Scanner;

public class emiinput
{

public static void main(String[] args) 
  {
			
            int name=0;
			
			System.out.println("Greetings.......!!!!!!!!!!!!");
			
			
			Scanner in= new Scanner(System.in);

			System.out.println("Enter your choice 1.CAR loan 2.HOME loan 3.PERSONAL loan");

		    name=in.nextInt();

			switch (name)
			{
			case 1: System.out.println("CAR loan:");
			
			        Emi a=new Emi();
			        
			        int principle=a.principle();
			        
			         int month= a.month();
			         
			         float rateofinterest= a.rateOfInterest();
			         
			         a.emiCalculator(principle,rateofinterest,month);
			    
			          break;
			           
			case 2: System.out.print("HOME loan:");
			     
			        Emi b=new Emi();
	        
	                int bprinciple=b.principle();
	        
	                int bmonth= b.month();
	                
	                float brateofinterest= b.rateOfInterest();
	                
	                b.emiCalculator(bprinciple,brateofinterest,bmonth);

			         break; 
			                
			case 3: System.out.print("PERSONAL loan");
			
			        Emi c=new Emi();
	        
	                int cprinciple=c.principle();
	        
	                 int cmonth= c.month();
	                
	                 float crateofinterest= c.rateOfInterest();
	                 
	                 c.emiCalculator(cprinciple,crateofinterest,cmonth);

			        break;   
			       
			       default :System.out.println("Please Enter The Valid Number 1 or 2 or 3");
                 
			}
			 			

			
		}

}
