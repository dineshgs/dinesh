package example;
import java.util.Scanner;
import java.lang.*;
public class Puzzle {
	public static void main(String[] args) 
    {
        System.out.println("Enter the no of switches:");
		int q=0;
		int count=2;
	Scanner s=new Scanner(System.in);
		q=s.nextInt();
		boolean switches[]=new boolean[q];
		for(int i=0;i<q;i++){
			switches[i]=true;
					}
	switches[q-1]=false;
		for(int j=q-1;j>1;j--){
			if(switches[j]==false){
				switches[j-1]=true;
				count++;
				switches[j-2]=false;
				count++;
				}
			else if(switches[j]==true){
				switches[j]=false;count++;
				switches[j-1]=true;count++;
				switches[j-2]=false;count++;
			}}
		for(int i=1;i<q-1;i++){
			switches[i+1]=true;count++;
			switches[i]=false;count++;
		}
		switches[q-1]=false;
	System.out.println("Minimum switchings required to switch off all switches:"+count);
	}}
