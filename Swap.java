package example;
import java.io.*;
import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
	int[] d=new int[100];
	int[] d1=new int[100];
	int m,last,b=1;
	System.out.println("100  limit two swap");
	Scanner sc=new Scanner(System.in);
	m=sc.nextInt();
	last=m;
for(int i=0;i<m;i++)
	d[i]=i+1;
for(int i=0;i<m;i++)
{if(i%2==0){
	d[i]=last;
	last--;
}else{
	d[i]=b;
b++;}
	
	}
for(int i=0;i<m;i++)
	System.out.print(d[i]+"  ");
	}}
