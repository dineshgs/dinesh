import java.io.*;
import java.util.Scanner;
public class Primeinterval {
	public static void main(String arg[])
	{
		int prime,p=0,inte;
		System.out.println("Enter the number to find prime or not");
		Scanner s=new Scanner(System.in);
		prime=s.nextInt();
		inte=s.nextInt();
		while(prime<=inte){
		for(int i=2;i<prime;i++){
			if(prime%i==0){
				p=1;
			}}
      if(p==0)
			System.out.println(prime+"it is prime");
		else 
			System.out.println(prime+"it is not prime");
prime++;
p=0; }}}
