package com.company;

import java.util.Arrays;
import java.util.Random;

public class Package {
	int[] userNumber;
	int[] winNumber;
	int choose;
	Package()
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
	        if(winNumber[0]==winNumber[1]||winNumber[1]==winNumber[2]||winNumber[0]==winNumber[2])
	        	choose=1;
	        else
	        	choose=2;
	}
	void getuserNumber(int line)
	{
		   userNumber[2]=line%10;
	       userNumber[1]=(line%100)/10;
	       userNumber[0]=(line%1000)/100;
	}
	int Wins()
	{
		int [] mobile=new int[3];
		for(int i=0;i<3;i++)
			mobile[i]=winNumber[i];
		 int [] usermobile=new int[3];
         for(int i=0;i<3;i++)
           usermobile[i]=userNumber[i];
               if(choose==1)
               {
                   int i=0;
                  for(;i<3;i++)
                    if(mobile[i]!=userNumber[i])
                break;
                      if(i==3)
                          return 693;
                     Arrays.sort(mobile);
                        Arrays.sort(usermobile);
                         for(i=0;i<3;i++)
                         if(mobile[i]!=usermobile[i])
                  break;
                       if(i==3)
                 return 173;
                          return 0;
                         }
                        else
                         {
                      int i=0;
                          for(;i<3;i++)
                          if(mobile[i]!=userNumber[i])
                             break;
                      if(i==3)
                        return 606;
                       Arrays.sort(mobile);
                      Arrays.sort(usermobile);
                       for(i=0;i<3;i++)
                       if(mobile[i]!=usermobile[i])
                            break;
                      if(i==3)
                             return 86;
                            return 0;
}
		
	}
}
