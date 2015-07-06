import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lipikad on 7/7/15.
 */
public class PrimeFactor {
    public static void main(String args[])
    {
        int n,j=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        Generate f=new Generate();
        ArrayList a=new ArrayList();
        a = f.prime(n);
        for(j=0;j<a.size();j++)
        System.out.print(a.get(j) +"  ");

    }
}

class Generate
{
    public ArrayList<Integer> prime(int n)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                numbers.add(i);
                n=n/i;
                i=1;
            }
        }
        return (numbers);
    }
}



