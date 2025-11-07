package ex_25_ENUM;

public class Lab175_Congrats {
    public static void main(String[] args) {
        System.out.println(ENV.PROD.getUrl());
        System.out.println(ENV.STAGING.getUrl());
        System.out.println(ENV.DEV.getUrl());
    }
}
