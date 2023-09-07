package chapter3;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer number");
        int num = scanner.nextInt();
        scanner.close();

        String revToString = new StringBuilder(Integer.toString(num)).reverse().toString();

        int rev = Integer.parseInt(revToString);

        System.out.println("The reversed number is " + rev);
    }
}
