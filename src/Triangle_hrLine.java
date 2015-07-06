import java.util.Scanner;

/**
 * Created by lipikad on 7/6/15.
 */
public class Triangle_hrLine {
    public static void main(String args[])
    {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=in.nextInt();
        while(n!=0)
        {
            System.out.print("*");
            n--;
        }
    }
}
