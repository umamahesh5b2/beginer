import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
