package dinesh;
import java.util.Scanner;
public class Naturalnumber {
public static void main(String[] args) {
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
{sum = sum +i;i++;}s.close();
System.out.println("Sum of "+x+" numbers is :"+sum);} }