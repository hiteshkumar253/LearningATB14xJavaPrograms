package ex_06_Ternary_Operator;

public class Task_TernaryOperator_Age_Classification {

    public static void main(String[] args) {
        //int int_Age = 60;

        String user_input = args[0];  //59, check edit configuration
        System.out.println(user_input);  // 59
        System.out.println(user_input instanceof String); //true
        int int_Age = Integer.parseInt(user_input); // string to integer conversion using Integer.parseInt method
        String result = (int_Age) <= 0 ? "Invalid age" : (int_Age >0 && int_Age < 18) ? "Minor" : (int_Age >=18 && int_Age < 60 ? "Adult" : "Senior Citizen");
        System.out.println(result);

    }
}
