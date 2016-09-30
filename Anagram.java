package test;

import java.util.*;

public class Anagram {
	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		System.out.println("enter string 1");
		char str1[] = in.nextLine().toCharArray();
		System.out.println("enter string 2");
		char str2[] = in.nextLine().toCharArray();
		if(str1.length != str2.length){
			System.out.println("not anagrams len");
			return;
		}		
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<str1.length;i++)
			if(str1[i] != str2[i]){
				System.out.println("not anagrams");
				return;
			}
		System.out.println("anagrams");
	}

}
