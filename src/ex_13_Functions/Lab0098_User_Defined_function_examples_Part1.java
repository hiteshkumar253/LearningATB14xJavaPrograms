package ex_13_Functions;

public class Lab0098_User_Defined_function_examples_Part1 {
    public static void main(String[] args) {

        //User Defined functions

        //1. Without Parameters and without Return Type
        //2. Without Parameters but with Return Type
        //3. With Parameters and without Return Type
        //4. With Parameters and with Return Type


        //1. Without Parameters and without Return Type
        wop_wor_greet();

        //2. Without Parameters but with Return Type
        String message = wop_wr_greet_2();
        System.out.println(message);

        //3. With Parameters and without Return Type
        greet_with_Details("Hitesh", 35, 400000);

        //4. With Parameters and with Return Type
        int sum1 = sum_of_two_numbers(20,40);
        System.out.println(sum1);

        int sum2 = sum_of_three_numbers(20,40, 32);
        System.out.println(sum2);

        float sum3 = sum_of_three_numbers_float(34232,4523,4123);
        System.out.println(sum3);


    }
     //1. Without Parameters and without Return Type
    static void wop_wor_greet(){
        System.out.println("Hi, Type 1 function!");
       }

    //2. Without Parameters but with Return Type
    static String wop_wr_greet_2(){
        System.out.println("Hi, Type 2 function!");
        return "how are you?";
    }
    //3. With Parameters and Without Return Type
    static void greet_with_Details(String name, int age, double salary){
        System.out.println("Hi, Type 3 function!");
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour Salary is " + salary);
    }
    //4. With Parameters and with Return Type
    static int sum_of_two_numbers(int a, int b){
        System.out.println("Hi, Type 4 function!");
        return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        System.out.println("Hi, Type 4 function!");
        return a+b+c;
    }
    static float sum_of_three_numbers_float(float a, float b, float c){
        System.out.println("Hi, Type 4 function!");
        return a+b+c;
    }
}
