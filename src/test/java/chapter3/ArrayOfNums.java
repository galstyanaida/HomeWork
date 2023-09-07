package chapter3;
import java.util.Arrays;
public class ArrayOfNums {
    public static void main(String[] args){
        int[] listOfNums = {12,435,31,7,43,78,231};
         int sum = 0;
         for (int num : listOfNums){
             sum+=num;
         }
         System.out.println("Sum of numbers = " +sum);

         int max = Arrays.stream(listOfNums).max().getAsInt();
         int min = Arrays.stream(listOfNums).min().getAsInt();
         System.out.println("The max number = " + max);
         System.out.println("The min number = " + min);

         Arrays.sort(listOfNums);
         System.out.println("The ascending order = " + Arrays.toString(listOfNums));
    }
}
