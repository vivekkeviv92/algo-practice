package test;
import java.util.*;

public class Remove_space {
	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		System.out.println("enter the string");
		String str = in.nextLine();
		System.out.println(str.length());
		String []al = str.split(" ");
		System.out.println(al.length);
		str = "";
		for(int i=0; i<al.length;i++)
			str = str + al[i] + "%20";
		System.out.println(str);
	}

}

/*		in = new Scanner(System.in);
		System.out.println("enter the string");
		String str = in.nextLine();
		ArrayList<String> al = new ArrayList<String>();
		int i = 0;
		for(i=0;i<str.length();i++)
		{
			al.add(Character.toString((str.charAt(i))));
		}
		for(i=0;i<al.size();i++)
		if(al.get(i).equals(" "))
			al.set(i, "%20");
		str = "";
		for (String s : al)
		{
		    str += s;
		}
		System.out.println(str);
*/

