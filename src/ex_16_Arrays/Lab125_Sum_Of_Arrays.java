package ex_16_Arrays;

public class Lab125_Sum_Of_Arrays {
    public static void main(String[] args) {

        int num[] = {12,34,13};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum +num[i];
        }
        System.out.println("Sum of Arrays: " +sum);
    }
}
