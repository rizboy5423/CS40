import java.util.*;
public class StarPyramid
{
    public static void main(String[] arg)
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = in.nextInt();
        int num = 0;
        int space = rows;
        for(int i = 0; rows>i; i++)
        {
            for(int n = 0; space>n; n++)
            {
                System.out.print("  ");
                
            }
            for(int k = 0; num*2+1>k; k++)
            {
                System.out.print("* ");               
            }
            System.out.println();
            space--;
            num++;
        }
        
        
        
        
    }
}
