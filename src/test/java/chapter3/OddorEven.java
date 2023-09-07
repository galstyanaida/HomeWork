package chapter3;

import java.util.Scanner;

public class OddorEven{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        scanner.close();

        if (num%2==0){
          System.out.println("That number is even");
        }
        else{
            System.out.println("That number is odd");
        }
    }

}
