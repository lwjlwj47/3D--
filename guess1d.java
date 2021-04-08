package com.company;

import java.util.Random;

public class guess1d {
	int number;
	int [] winNumber;
	guess1d()
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
	void getNumber(int Number)
	{
		number=Number;
	}
	int Wins()
	{
		int times=0;
		for(int i=0;i<3;i++)
			if(winNumber[i]==number)
				times++;
		if(times==1)
			return 2;
		if(times==2)
			return 12;
		if(times==3)
			return 230;
		return 0;
	}
}
