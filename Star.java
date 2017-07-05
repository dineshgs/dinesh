package example;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        int j = 0;
        Scanner s = new Scanner(System.in);
        for(int a = s.nextInt();a > 0;a--){
            j = 1;
            while(j <= a){
                System.out.print("*");
                ++j;
            }
            System.out.print(" ");
            while(j > 1){
                System.out.print("*");
                --j;
            }
            System.out.println("");}}}
