package example;
import java.util.*;
public class Intervals
{
public static void main(String args[])
{
int t1,t2,i=0;
System.out.println("Enter the intervals:");
Scanner s=new Scanner(System.in);
t1=s.nextInt();
t2=s.nextInt();
for(i=t1;i<=t2;i++)
{
if(i%2==0){ 
           System.out.println(" ");      }
else{
     System.out.println(+i);s.close();  }}}}
