import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int res=1;
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int e=sc.nextInt();
		for(int i=1;i<=e;i++)
		{
			res=res*b;
		}
		
		System.out.println(res);
	}
}
