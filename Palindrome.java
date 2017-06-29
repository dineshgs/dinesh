package example;
import java.util.*;
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev=new StringBuffer(str).reverse().toString();
		if(str.equals(rev))
	    	              {System.out.println("palindrome");}
		else
		    {System.out.println("Not palindrome");sc.close();}}}
