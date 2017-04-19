package dinesh;
import java.util.Scanner;

public class Oddoreven {
	public static void main(String args[])
	  {
	    int num;
	    System.out.println("Integer number:");
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    if ( num % 2 == 0 )
	        System.out.println("Entered  even");
	     else
	        System.out.println("Entered odd");
	  }
	}