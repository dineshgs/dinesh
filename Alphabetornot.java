package dinesh;
import java.util.Scanner;

public class Alphabetornot {

	public static void main(String[] args) {
		char ch;
        Scanner sc= new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = sc.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }


	}


