package ex_25_ENUM;

public class Lab173_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_COLORs.RED);
        System.out.println(HEX_COLORs.RED.getHexCode());
        System.out.println(HEX_COLORs.GREEN);
        System.out.println(HEX_COLORs.GREEN.getHexCode());
        System.out.println(HEX_COLORs.BLUE);
        System.out.println(HEX_COLORs.BLUE.getHexCode());
        System.out.println(HEX_COLORs.YELLOW);
        System.out.println(HEX_COLORs.YELLOW.getHexCode());
    }
}

enum HEX_COLORs{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    HEX_COLORs(String hexCode){     //constructor of enum
        this.hexCode = hexCode;     // this.hexCode refers to the instance variable hexCode
    }
    String getHexCode(){                // getter method to get the hex code
        return this.hexCode;            // return the hex code
    }
}
