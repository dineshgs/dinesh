package example;
import java.io.*;
import java.util.*;
public class Print{
public static void main(String[] args) {
	String str;
    char d[],d1[];
    int b=0,j;
	Scanner obj=new Scanner(System.in);
	str=obj.nextLine();
	d=str.toCharArray();
	d1=str.toCharArray();
	for(int a=0;a<str.length();a++)
		if(d[a]==' ')
			{for(j=a+1;j<str.length();j++)
			{	d1[b]=d[j];
	b++;}         d1[b]=' ';

		for(j=0;d[j]!=' ';j++){
		d1[b+1]=d[j];
		b++;}
		
			}for(int i=0;i<str.length();i++)
				System.out.print(d1[i]);
}
}
