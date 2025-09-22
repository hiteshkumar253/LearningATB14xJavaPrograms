package ex_06_Ternary_Operator;

public class Task_TernaryOperator_Largest_Of_Three_Numbers {

    public static void main(String[] args) {
        int n1 = 1, n2 = 3, n3 = -1;
        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.printf("max is %d", max);
    }
}
