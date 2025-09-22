package ex_06_Ternary_Operator;

public class Lab0047_TernaryOperator1 {

    public static void main(String[] args){

        int age = 21;
        //Nested  Ternary

        // result = condition1 ? expression : (condition2 ? expression2 : expression3

        String result = (age > 18) ? (age > 25 ? "You can drink" : " You can go to Goa, but You can't drink") : " No";
        System.out.println(result);
    }
}
