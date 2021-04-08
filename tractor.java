package com.company;

import java.util.Random;

public class tractor {
    int []winNumber;  
	tractor()
      {
		 winNumber=new int[3];
		  Random random=new Random();
	       System.out.print("ÖÐ½±ºÅ:");
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
	int Wins()
	{
		int i=0;
		for(;i<2;i++)
			{
			if(winNumber[i]+1!=winNumber[i+1])
				break;
			}
		if(i==2)
			return 65;
		for(i=0;i<2;i++)
		{
		if(winNumber[i]-1!=winNumber[i+1])
			break;
		}
	        if(i==2)
		return 65;
	        return 0;
	}
}
