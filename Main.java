package com.company;

import java.util.Scanner;

enum style
{
	  single,group,oned,general,guess1d,Package,sum,tractor
}
public class Main
{
private static final Object[] Integer = null;
public static void main(String []arge)
{
	Scanner so=new Scanner(System.in);
    String end=new String();
	label1:
	while(true)
	{
		System.out.println("请输入投注方式:");
		String text=so.nextLine();
		final style [] values=style.values();
		int k;
		for(k=0;k<8;k++)
			if(text.equals(values[k].toString()))
			break;
		if(k==8)
			{
			System.out.println("您输入的投注方式不存在，请重新输入");
			continue label1;
			}
		else
		{
		label2:
		switch(text)
		{
		case"single":  
			single p=new single(); 
			System.out.println("请输入0-999之间的整数");
			int a=so.nextInt();
			p.getUserNunber(a);
			p.IFwin();
			break;
		case"group":
			group p1=new group(); 
			System.out.println("请输入0-999之间的整数");
			int a1=so.nextInt();
			p1.getuserNumber(a1);
			System.out.println(p1.Wins());
			break;
		case"oned":
			oned p2=new oned();
			System.out.println("请输入确定位置的一个数字，其他位输入*，例如，如果确定个位数为2，请输入**2");
			String str=so.next();
			int a2=0;
			int position=0;
			for(int i=0;i<3;i++)
				if(str.charAt(i)!='*')
				{
					a2=str.charAt(i)-'0';
					position=i;
				}
			p2.getNumber(a2, position);
			System.out.println(p2.Wins());
			break;
		case"guess1d":
			guess1d p3=new guess1d();
			System.out.println("请输入0-9之间的整数");
			int a3=so.nextInt();
			p3.getNumber(a3);
			System.out.println(p3.Wins());
			break;
		case"general":
			general p4=new general(); 
			System.out.println("请输入0-999之间的整数");
			int a4=so.nextInt();
			p4.getuserNumber(a4);
			System.out.println(p4.Wins());
			break;
		case"sum":
			sum p5=new sum();
			System.out.println("请输入0-27之间的整数");
			int a5=so.nextInt();
			p5.getNumber(a5);
			System.out.println(p5.Wins());
			break;
		case"Package":
			Package p6=new Package();
			System.out.println("请输入0-999之间的整数");
			int a6=so.nextInt();
			p6.getuserNumber(a6);
			System.out.println(p6.Wins());
			break;
		case"tractor":
			tractor p7=new tractor();
			System.out.println(p7.Wins());
			break;
		}
		System.out.println("是否退出本次福彩：  退出：Yeas 续：No");
		end=so.next();
		if(end.equals("Yeas"))
			break ;
		}
	}
}
}