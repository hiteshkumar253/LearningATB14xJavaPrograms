package ex_Problem_Statement;

public class Second_Highest_From_Array_without_sort_function {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 2, 3, 32,200,201};
//        Arrays.sort(numbers);
//        System.out.println("Second largest salary from given array is: " + numbers[numbers.length-2]);

        int firstLargest = 0;
        int secondLargest = 0;
        for (int i = 0; i < numbers.length; i++)
            {
                if (numbers[i] > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = numbers[i];
                }
            }
            System.out.println("First Largest salary is: " +firstLargest);
            System.out.println("Second Largest salary is: " +secondLargest);
    }
}
