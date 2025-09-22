package ex_05_TypeCasting;

public class Lab0045_TypeCasting_Used {
    public static void main(String [] args)
    {
        int course = 100;
        float GST = 18.50f;

//        int total = course+GST; //Narrowing - Implicit
        int total1 = course+(int)GST; //Narrowing - Explicit
        System.out.println(total1);

        float total2 = course+GST; //widening  -auto - implicit
//        float total3 = (float)course+GST; //widening - Explicit
        System.out.println(total2);

    }
}
