import java.util.*;
public class Test1
{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Rows?");
        int rows = in.nextInt();
        int num = rows;
        int hollow = rows-2;
        
        for ( int i=0; i<rows; i++)
        {

            for( int k=0; k<num; k++)
            {
                System.out.print("@");
                if(i>0)
                {
                    for(int p=0 ; p< hollow; p++)
                    {	
                        System.out.print(" ");
                        k++;
                    }
                }
            }

            System.out.println();
            num--;
            hollow--;

        }

    }
}	    


