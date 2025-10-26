package ex_16_Arrays;

import java.util.Arrays;

public class Lab126_Second_Highest_From_Array {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 2, 3, 32,200,201};
        Arrays.sort(numbers);
        System.out.println("Second largest salary from given array is: " + numbers[numbers.length-2]);

    }
}
