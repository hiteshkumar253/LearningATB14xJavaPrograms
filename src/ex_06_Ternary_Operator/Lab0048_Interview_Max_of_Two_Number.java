package ex_06_Ternary_Operator;

public class Lab0048_Interview_Max_of_Two_Number{

    public static void main (String [] args) {

        int x = 20;
        int y = 40;

        //System.out.println(Math.max(x, y));

        //using ternary operator

        int max = x > y ? x : y;
        System.out.println(max);
    }
    }

