package chapter3;
import java.util.Scanner;

public class TheLargestNumber {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        int n1= scanner.nextInt();

        System.out.println("Enter second number");
        int n2 = scanner.nextInt();

        System.out.println("Enter third number");
        int n3= scanner.nextInt();

        scanner.close();

        int largest = n1;
        if (n2>largest){
            largest=n2;
        }
        if (n3>largest){
            largest=n3;
        }

        System.out.println("The largest number is "+ largest);
    }
}
