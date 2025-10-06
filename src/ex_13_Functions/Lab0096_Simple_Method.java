package ex_13_Functions;

public class Lab0096_Simple_Method {
    public static void main(String[] args) {

            no_return_type_function();

            String name = return_string_type_function();
            System.out.println(name);

            Integer number = return_integer_type_function();
            System.out.println(number);

            float fnumber = return_float_type_function();
            System.out.println(fnumber);

            byte bt = return_byte_type_function();
            System.out.println(bt);

            boolean b = return_boolean();
            System.out.println(b);

    }

    static void no_return_type_function(){
        System.out.println("Hi, there, No Return function");

    }

    static String return_string_type_function(){
        System.out.println("I will return a string");
        return "Pramod";
    }
    static Integer return_integer_type_function(){
        System.out.println("I will return an integer");
        return 1000;
    }

    static boolean return_boolean(){
        System.out.println("I will return a boolean");
        return true;
    }
    static float return_float_type_function() {
        System.out.println("I will return a float");
        return 3.14f;
    }
    static byte return_byte_type_function(){
        System.out.println("I will return a byte");
        return 100;}
}
