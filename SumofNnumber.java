package dinesh;
import java.util.Scanner;
public class SumofNnumber {
public static void main(String[] args) {
		int a,sum=0;
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);	
		a=s.nextInt();
		for(int num=1;num<=a;num++)
		{sum=num+sum;}
		System.out.println(sum);}}