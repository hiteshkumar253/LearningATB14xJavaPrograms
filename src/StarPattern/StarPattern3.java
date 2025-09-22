package StarPattern;

public class StarPattern3 {

    public static void main(String [] args)

    {
        int row, col;
        for(row=1; row<=5; row++)
        {
            for(col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        {
            for(row =1; row<=5;row++)
            {
                for(col=4; col>=row; col--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
