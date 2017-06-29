package example;
import java.util.Scanner;
public class Even2 {
public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int a=sc.nextInt(); 
        System.out.println("Enter the number");sc.close();
        int b=sc.nextInt();
        for(i=a;i<=b;i++){
        	if(i%2==0){
        	 System.out.println("Even number: "+i);  }}}}
