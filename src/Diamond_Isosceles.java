import java.util.Scanner;

/**
 * Created by lipikad on 7/6/15.
 */
public class Diamond_Isosceles {
    public static void main(String args[])
    {
        int n;
        Scanner in =new Scanner(System.in);
        Loop l=new Loop();
        System.out.print("Enter a number: ");
        n=in.nextInt();

        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            l.inner(i);
            l.inner(i-1);
            System.out.println("");
        }
    }
}

class Loop
{
    public void inner(int num)
    {
        for(int j=0;j<=num;j++)
        {
            System.out.print("*");
        }
    }
}


