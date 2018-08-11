import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		ch=scan.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z'))
		{
			System.out.println(ch+"is an alphabet");
		}
		else
		{
			System.out.println(ch+"is not an alphabet");
		}
	}
}
