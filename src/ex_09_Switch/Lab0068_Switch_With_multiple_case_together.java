package ex_09_Switch;

public class Lab0068_Switch_With_multiple_case_together {
    public static void main(String[] args) {
     // JDK version > 13 only, no break is required in case statement and also can use multiple case together
        int itemcode =  006;
        switch(itemcode){
            case 001,002,005 -> System.out.println("All of them are electronic gadget");
            case 004,006,007 -> System.out.println("This is Mech");
            default -> System.out.println("None");
        }
    }
}
