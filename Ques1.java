package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques1 {

	private static Scanner in;

	public Ques1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Number;
		in = new Scanner(System.in);
		System.out.println("Enter number to be spelled");
		Number = in.nextLine();
		int Num = Integer.valueOf(Number);
		System.out.println("Number is " + Num);
		
		ArrayList<String> al=new ArrayList<String>(1338);//creating arraylist  
		for(int i=1;i<=1337;i++)
			al.add(Integer.toString(i));
		int count = 1;
		int flag = 0;
		int looper = 1;
		while(count < Num)
		{
			if(al.get(count).contains("7") || Integer.valueOf(al.get(count))%7 == 0)
			{
				if(flag==0)
					{flag=1;looper=looper+2;}
				else
					{flag=0;looper=looper-2;}
			}
			
			if(flag==0)
				looper++;
			else
				looper--;
			if(looper < 1)
				looper = looper+1337;
			if(looper>1337)
				looper = looper-1337;
			count++;
			
		}
		System.out.println("Count is " + count);
		System.out.println("Position is " + looper);

	}

}
