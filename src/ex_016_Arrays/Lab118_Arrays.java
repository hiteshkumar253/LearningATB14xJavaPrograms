package ex_016_Arrays;

public class Lab118_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int marks[] = {62,74,83,77,68,90};
        boolean is_married_people[] = {true,false,false,true};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[3]);
//        System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException

        String name = "hitesh";
        String[] name_each_element_char = name.split("");  // ["h","i","t","e","s","h"]
        for (String s: name_each_element_char){
            System.out.println(s);

        }
    }
}
