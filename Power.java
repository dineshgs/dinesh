package example;
import java.util.Scanner;
public class Power{
	public static void main(String[] args) 
	{         System.out.println("ENTER THE NUMBER:");
		      Scanner s=new Scanner(System.in);
		      int num=s.nextInt();
		      System.out.println("ENTER THE POWER:");
		      int pow=s.nextInt();
		      int out=1;
		      for(int i=0;i<pow;i++)
		      {out*=num;}
		      System.out.println("RESULT IS  :  "+out);s.close();}}
		       
