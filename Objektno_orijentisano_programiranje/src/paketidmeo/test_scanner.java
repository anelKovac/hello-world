package paketidmeo;
import java.util.Scanner;

public class test_scanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        String userName = scanner.nextLine();
        System.out.println("hello " + userName);
    }
}
