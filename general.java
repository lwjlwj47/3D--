package com.company;

import java.util.Random;

public class general {
	int[] userNumber;
	int[] winNumber;
	boolean IF;
	general()
	{
		 winNumber=new int[3];
         userNumber=new int[3];
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
	        if(winNumber[0]!=winNumber[1]&&winNumber[1]!=winNumber[2]&&winNumber[0]!=winNumber[2])
	        	IF=true;
	        else
	        	IF=false;
	}
	 void getuserNumber(int  line)
	   {
		   userNumber[2]=line%10;
	       userNumber[1]=(line%100)/10;
	       userNumber[0]=(line%1000)/100;
	   }
	 int Wins()
	 {
		 if(IF)
		 {
		 int times=0;
		 for(int i=0;i<3;i++)
			 if(userNumber[i]==winNumber[i])
				 times++;
		 if(times==2)
			 return 21;
		 if(times==3)
			 return 470;
		 return 0;
		 }
		 else
			 return 0;
	 }
}
