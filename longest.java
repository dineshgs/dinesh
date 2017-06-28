import java.util.*;
public class longest
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String x[]=new String[100];
for(int i=0;i<n;i++)
{
x[i]=sc.next();
}
String long,check;
if(x.length>0)
long=x[0];
for(int i=1;i<x.length;i++)
{
check=x[i];
for(j=0;j<Math.min(long.length(),x[i].length());j++)
{
if(long.charAt(j)!=check.charAt(j))
break;
}
long=x[i].subString(0,j);
}
System.out.println("longest prefix is:"+long);
}
}
