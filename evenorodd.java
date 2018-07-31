import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddOrEven
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println("You entered an even number.");
      else
      System.out.println("You entered an odd number.");
   }
}
