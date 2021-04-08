package com.company;


import java.util.Scanner;
import java.util.*;
public class single{

	  int[] userNumber;
      int [] winNumber;
      boolean IF;
      single()
      {
         winNumber=new int[3];
         userNumber=new int[3];
         Random random=new Random();
        System.out.print("中奖号:");
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
      boolean getWin()
        {
                 for(int i=0;i<3;i++)
                   if(userNumber[i]!=winNumber[i])
                           return false;
                         return true;
           }
      void getUserNunber(int line)
        {
    	  userNumber[2]=line%10;
          userNumber[1]=(line%100)/10;
          userNumber[0]=(line%1000)/100;
         }
     // void setNumber();
         void  IFwin()
       {
           System.out.print("您获得的奖金为");
            if(getWin())
            	System.out.println("1040");
                 else
                	 System.out.println("0");
        }
}