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
		System.out.println("������Ͷע��ʽ:");
		String text=so.nextLine();
		final style [] values=style.values();
		int k;
		for(k=0;k<8;k++)
			if(text.equals(values[k].toString()))
			break;
		if(k==8)
			{
			System.out.println("�������Ͷע��ʽ�����ڣ�����������");
			continue label1;
			}
		else
		{
		label2:
		switch(text)
		{
		case"single":  
			single p=new single(); 
			System.out.println("������0-999֮�������");
			int a=so.nextInt();
			p.getUserNunber(a);
			p.IFwin();
			break;
		case"group":
			group p1=new group(); 
			System.out.println("������0-999֮�������");
			int a1=so.nextInt();
			p1.getuserNumber(a1);
			System.out.println(p1.Wins());
			break;
		case"oned":
			oned p2=new oned();
			System.out.println("������ȷ��λ�õ�һ�����֣�����λ����*�����磬���ȷ����λ��Ϊ2��������**2");
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
			System.out.println("������0-9֮�������");
			int a3=so.nextInt();
			p3.getNumber(a3);
			System.out.println(p3.Wins());
			break;
		case"general":
			general p4=new general(); 
			System.out.println("������0-999֮�������");
			int a4=so.nextInt();
			p4.getuserNumber(a4);
			System.out.println(p4.Wins());
			break;
		case"sum":
			sum p5=new sum();
			System.out.println("������0-27֮�������");
			int a5=so.nextInt();
			p5.getNumber(a5);
			System.out.println(p5.Wins());
			break;
		case"Package":
			Package p6=new Package();
			System.out.println("������0-999֮�������");
			int a6=so.nextInt();
			p6.getuserNumber(a6);
			System.out.println(p6.Wins());
			break;
		case"tractor":
			tractor p7=new tractor();
			System.out.println(p7.Wins());
			break;
		}
		System.out.println("�Ƿ��˳����θ��ʣ�  �˳���Yeas ����No");
		end=so.next();
		if(end.equals("Yeas"))
			break ;
		}
	}
}
}