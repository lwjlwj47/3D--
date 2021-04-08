package com.company;

import java.util.Random;

public class oned {
	int number;
	int [] winNumber;
	int position;
	oned()
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
	void getNumber(int Number,int Position)
	{
		number=Number;
		position=Position;
	}
	int Wins()
	{
		if(number==winNumber[position])
			return 10;
		else
			return 0;
	}
}