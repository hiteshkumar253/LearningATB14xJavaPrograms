package ex_06_Ternary_Operator;

public class Task_TernaryOperator_Odd_or_Even {

    public static void main(String [] args)
    {
        int number  = 11;
        String result = (number % 2 ==0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
