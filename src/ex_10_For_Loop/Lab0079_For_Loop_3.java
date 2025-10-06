package ex_10_For_Loop;

public class Lab0079_For_Loop_3 {
    public static void main(String[] args) {
        for (int i = -1 ; i > -10; i--) {
            System.out.println(i);
        }
// below one is also a valid for loop syntax. Initialsed the value of i outside for loop not inside the for loop
        int i = 10;
        for (; i>0;i--){
            System.out.println(i);
        }
    }
}
