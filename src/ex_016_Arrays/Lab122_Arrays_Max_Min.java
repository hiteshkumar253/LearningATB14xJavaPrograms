package ex_016_Arrays;

public class Lab122_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // logic

//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);
        System.out.println("-----------Maximum----------");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
                if(array[i] > max){
                    max = array[i];
                }
        }
        System.out.println(max);

        System.out.println("-----------Minimum----------");

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
