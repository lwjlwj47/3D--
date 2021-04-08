package com.company;

import java.util.Random;
import java.util.*;

public class group  {
	int[] userNumber;
	int[] winNumber;
   group()
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
        if(winNumber[0]==winNumber[1]&&winNumber[1]==winNumber[2])
        	IF=false;
        else
        	IF=true;
        if(winNumber[0]==winNumber[1]||winNumber[1]==winNumber[2]||winNumber[0]==winNumber[2])
        	choose=1;
        else
        	choose=2;
   };
   boolean IF;
   int choose;
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
    	boolean right=true;
    	Arrays.sort(userNumber);
    	Arrays.sort(winNumber);
    	for(int i=0;i<3;i++)
    		if(userNumber[i]!=winNumber[i])
    			right=false;
    	if(right)
    	{
    		if(choose==1)
    			return 346;
    		else
    			return 173;
    	}
    	else
    	  return 0;
    		
    }
    else return 0;
    	
   }
   
}
