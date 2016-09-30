package test;

import java.util.*;
public class RemoveDuplicate1 {
	private static Scanner in;
	private static char temp;
	private static int last;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[] = new char[100];
		System.out.println("enter string");
		in = new Scanner(System.in);
		str = in.nextLine().toCharArray();
		int len = str.length;
		last = len;
		for (int i = 0; i < last-1; i++) {
			for (int j = last - 1; j > i; j--) {
				if (str[i] == str[j]) {
					temp = str[last-1];
					str[last-1]=str[j];
					str[j]=temp;
						last--;
				}
			}
		}
		for(int i=0;i<last;i++)
		System.out.print(str[i]);
	}
}
