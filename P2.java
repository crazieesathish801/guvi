package pro2;
import java.util.Scanner;
public class P2 {
public static void main(String[]args)
{
	char ch;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character tobe checked");
	ch=s.next().charAt(0) ;
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

