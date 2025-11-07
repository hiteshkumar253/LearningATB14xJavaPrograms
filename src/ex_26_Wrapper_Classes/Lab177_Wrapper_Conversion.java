package ex_26_Wrapper_Classes;

public class Lab177_Wrapper_Conversion {
    public static void main(String[] args) {

        int a  = 10;
//        a.     // no attribute;
//        a.len();   // no method

        Integer a1 = 10;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(a1.MAX_VALUE);    // this is also valid
        System.out.println(Integer.valueOf(a1));
    }
}
