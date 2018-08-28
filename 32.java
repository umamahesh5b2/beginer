/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int word=1;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		str=sc.nextLine();
		for(int i=1;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i-1)!=' '))
			word++;
		}
		System.out.println(word);
	}
}
