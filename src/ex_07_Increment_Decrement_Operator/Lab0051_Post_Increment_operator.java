package ex_07_Increment_Decrement_Operator;

public class Lab0051_Post_Increment_operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); //10
        int b = a++;   // first assign the value then increment the value

        System.out.println(a); // 11
        System.out.println(b);  // 10
    }
}
