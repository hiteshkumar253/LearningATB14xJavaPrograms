package ex_06_Ternary_Operator;

public class Lab0046_TernaryOperator {

    public static void main(String [] args){

        int age = 18;
        String canIGotoGoa = age > 18 ? "Yes" : "No";
        System.out.println(canIGotoGoa);

        int age1 = 19;
        String canIGotoGoa1 = age1 > 18 ? "Yes" : "No";
        System.out.println(canIGotoGoa1);

        int number = 5;
        String result = number>0 ? "+ve" : "-ve";
        System.out.println(result);
    }
}
