package ex_10_For_Loop;

public class Lab0082_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i ==5)
            {
                continue;
            }
            System.out.println(i);  //5 will not print, but wil get skipped due to continue statement
            //Continue basically means go back to the loop and skip the current iteration
        }
    }
}
