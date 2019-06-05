package com.java.emicalcultor;


	import java.util.Scanner;


	public class Emi{


	public float rateOfInterest;

	public int principle;

	
	public int month;

	public  float emi;




	public int principle() 

	{

	Scanner in = new Scanner(System.in);

	System.out.print("\n Enter the total amount :");

	principle =in.nextInt();
	if(principle<=0)
	{
		System.out.println("Please Enter The Valid Number:");
		principle();
	}
	
	return principle;


	}

	public float rateOfInterest() 
	{

	      float a;
	           	
	     System.out.print("\n Enter the percentage of Rate Of Interest in year :");

	     Scanner in = new Scanner(System.in);

	     a = in.nextFloat();
	     if(a>=0   &&a<=100)
	     {
	    	    rateOfInterest = a/1200;
	     
	     }
	     
	     else 
	     {
	    	 System.out.println("Please Enter The Valid Number:");
	    	 rateOfInterest();
	     }
	     return rateOfInterest;

	}

	public int month() 
	{

	   	
	     System.out.print("\n Enter the Number of Months :");

	      Scanner in=new Scanner(System.in);
        
	      month=in.nextInt();
	      if(month<=0)
	      {
	   System.out.println("Please Enter The Valid Number:");
	   month();
	      }
	     
	      
	      return month;


	}


	public void emiCalculator(int x,float y,int z)
	{
		
		
		
      emi = (x * y * (float)Math.pow((1 + y), month))  
              / (float)(Math.pow(1 + y, month) - 1); 
      
     System.out.println("\n Emi Amount:"+emi+"\n Thank you............");
	}
	}

