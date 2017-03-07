import java.text.DecimalFormat;
import java.util.*;
/**
 * William Kong
 */
public class lab
{

    
    public void lab1(String q, String b, String c, String d, String e)
    {
        String[] hold = { q, b, c, d,e};

        for(int i = 0; i<hold.length; i++)
        {
            hold[0].toUpperCase();
            System.out.print(hold[i].toUpperCase());
        }

    }

    public void lab2(boolean q, boolean b, boolean c)
    {
        boolean[] hold = { q, b, c};
        int n=0;
        for(int i = 0; i<hold.length;i++)

        {
            if(hold[i] == true)
            {
                n++;
            }

        }
        if( n == 3)
        {
            System.out.print("YES");
        }
        else
        {System.out.print("NO");
        }

    }

    public void lab3()
    {
        String[] hold = {"firetruck", "firedrill", "firehydrant","firefighter", "fireproof",
                "firestation","firehose"};
        for(int i = 0; i<hold.length;i++)
        {
            System.out.print(hold[i].substring(4));
            System.out.print(" ");
        }

    }

    public void lab4(double a, double b, double c, double d)
    {
        double[] hold = {a,b,c,d};
        double n = 0;
        for(int i = 0; i<hold.length;i++)
        {
            n += hold[i];
        }
        DecimalFormat currency = new DecimalFormat("0.00");
        System.out.print(currency.format(n));
    }

    public void lab5()
    {
        Random rand = new Random();
        double num[] = new double[5]; 
        for(int i = 0; i<num.length; i++)
        {
            double n = rand.nextInt(10)+1;
            num[i] = n;
        }
        for(int k =0; k<num.length; k++)
        {
            System.out.print( Math.pow((num[k]),2));
            System.out.println();
        }
    }

    public void lab6()
    {
        double num[] = new double[5000];
        double k = 0;
        for(int i = 0; i<num.length; i++)
        {
            num[i] = Math.random();
            k += num[i];
        }
        System.out.print(k/5000);

    }
}
