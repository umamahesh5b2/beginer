import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0)
		 {
			System.out.println("Leap year");
		 }
		 else
		 System.out.println("Not a leap year");
	}
}
