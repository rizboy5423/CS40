import java.util.*;

public class demo
{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Start: ");
        int n = in.nextInt();
        System.out.println("How many days in the month?");
        int d = in.nextInt();
        System.out.println(" Su Mo Tu We Th Fr Sa");
        int space = n;

        for(int k=1; k<n; k++) {
            System.out.print("   ");

        }

        for(int i=1; i<=d; i++)
        { 

            if(i < 10) {
                System.out.print("  " + i);
                space++;
            }
            else
            { 
                System.out.print(" " + i);
                space++;
            }
            if( space % 8 == 0)
            { System.out.println();
                space = 1;
            }

        }

    }
}