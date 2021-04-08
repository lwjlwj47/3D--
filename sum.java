package com.company;

import java.util.Random;

public class sum {
      int []winNumber;
      int number;
      sum()
      {
    	  winNumber=new int[3];
    	  Random random=new Random();
	       System.out.print("ÖĞ½±ºÅ:");
	        for(int i=0;i<3;i++)
	        {
	        	 if(i==0)
	        		 winNumber[i]=Math.abs(random.nextInt()%9)+1;
	        	 else
	              winNumber[i]=Math.abs(random.nextInt()%10);
	                System.out.print(winNumber[i]+" ");	
	       }
	        System.out.println();
      }
      void getNumber(int NUMBER)
      {
    	  number=NUMBER;
      }
      int Wins()
      {
    	  int all=0;
    	  for(int i=0;i<3;i++)
    		  all+=winNumber[i];
    	  if(all==number)
    		  return 14;
    	  return 0;
      }
      
}
