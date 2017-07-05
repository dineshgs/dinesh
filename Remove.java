package example;
import java.io.*;
import java.util.Scanner;
public class Remove {
	void removerepeated(String a){
		char d[],d1[]={'c','d'};
		int flag=0,k=0;
		d=a.toCharArray();
		d1=a.toCharArray();
		for(int i=0;i<a.length();i++){
			for(int j=0;j<a.length();j++)
		{if(i!=j)
				if(d[i]==d[j])
					flag=1;}
				
			if(flag<1)
				{d1[k]=d[i];k++;
				}
		flag=0;}
		if(a.length()!=k)
		for(int l=0;l<k;l++)
			System.out.print(d1[l]);
		else
			System.out.println("there is no reapeated letters");
	}
public static void main(String[] args) {
	String str;
	System.out.println("Enter the string to remove reapeated letters");
	Scanner sc=new Scanner(System.in);
	str=sc.next();
	 Remove s=new  Remove();
	s.removerepeated(str);
}}
