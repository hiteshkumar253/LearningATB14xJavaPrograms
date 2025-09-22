package ex_05_TypeCasting;

public class Lab0044_TypeCasting_Narrowing {

    public static void main(String[] args){

        int val = 300;
        //3000 would be converted into its binary equivalent and stored as a sequence of 1s and 0s in a specific memory location
        // 00000000 00000000 00000001 00101100

//        byte b = val; // Narrowing  - Implicit Casting - Valid?, No
        byte b =  (byte) val; // Narrowing - Explicit Casting - Valid  but data loss will be there
        System.out.println(b);
        //only 8 bit supported hence 00101100
        //0+0+32+0+8+4+0+0 = 44
        //0*2 the power 7+ 0*2 the power6 + 1*2 the power 5 and so on
    }
}
