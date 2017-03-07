import java.util.*;
public class printchart
{
    
    public static void main( String[] arg)
   
    {
      Scanner in = new Scanner(System.in);
      System.out.println(" values?: ");
      int val = in.nextInt();
      int rows = 0;
      int n=1;
      for(int i = 0; val>i; i++)
      {
         if(rows>=1)
         {  
             System.out.println();
             rows = rows - n - 1;
             n++;
            }
          System.out.print(i+1+" ");
        
        rows++;
        
        
        
          
        }
    }
}