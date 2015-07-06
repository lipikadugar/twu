import java.util.Scanner;

/**
 * Created by lipikad on 7/6/15.
 */
public class Triangle_Right {
    public static void main(String args[])
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
