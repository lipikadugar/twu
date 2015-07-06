import java.util.Scanner;

/**
 * Created by lipikad on 7/6/15.
 */
public class Diamond {
    public static void main(String args[])
    {
        int n;
        Scanner in =new Scanner(System.in);
        Loop l=new Loop();
        System.out.print("Enter a number: ");
        n=in.nextInt();

        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            l.inner(i);
            l.inner(i-1);
            System.out.println("");
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            l.inner(i-1);
            l.inner(i-2);
            System.out.println("");

        }
    }
}



