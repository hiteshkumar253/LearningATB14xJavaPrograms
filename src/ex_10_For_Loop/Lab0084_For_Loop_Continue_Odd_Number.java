package ex_10_For_Loop;

public class Lab0084_For_Loop_Continue_Odd_Number {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i%2 ==0)
            {
                continue;
            }
            System.out.println(i);  //5 will not print, but wil get skipped due to continue statement
            //Continue basically means go back to the loop and skip the current iteration
        }
    }
}
