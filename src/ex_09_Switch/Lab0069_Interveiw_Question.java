package ex_09_Switch;

public class Lab0069_Interveiw_Question {
    public static void main(String[] args) {
        int a = 11;  // Just to confuse
        switch(-1){
            default -> System.out.println("default");
            case -1 -> System.out.println("10");   // -1  wil match the -1 and will get print 10 only
            case 9 -> System.out.println("9");
        }
    }
}
