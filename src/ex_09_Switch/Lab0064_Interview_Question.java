package ex_09_Switch;

public class Lab0064_Interview_Question {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65 -> System.out.println("Match ASCII");
//            case 'A' -> System.out.println("Match ASCII CODE");
            default -> System.out.println("No Match");
        }
    }
}
