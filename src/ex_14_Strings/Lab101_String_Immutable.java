package ex_14_Strings;

public class Lab101_String_Immutable {
    public static void main(String[] args) {

        String name = "Hitesh";
        name.toUpperCase();
        System.out.println(name); // which one this print Hitesh or HITESH? Ans is Hitesh
//        System.out.println(name.toUpperCase()); //HITESH
    }
}
