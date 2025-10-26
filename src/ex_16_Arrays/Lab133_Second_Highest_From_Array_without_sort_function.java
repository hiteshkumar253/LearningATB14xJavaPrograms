package ex_16_Arrays;

public class Lab133_Second_Highest_From_Array_without_sort_function {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 2, 3, 32, 200, 199};
//        Arrays.sort(numbers);
//        System.out.println("Second largest salary from given array is: " + numbers[numbers.length-2]);

        int firstHighest = 0;
        int secondHighest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = numbers[i];
            } else if (numbers[i] > secondHighest && numbers[i] != firstHighest) {
                secondHighest = numbers[i];
            }
            System.out.println("First Largest salary is: " + firstHighest);
            System.out.println("Second Largest salary is: " + secondHighest);
        }
    }
}
