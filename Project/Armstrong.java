import java.util.*;
public class Armstrong
{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("sumOdds?");
        int num = in.nextInt();
        int sum = 0;
        
        for (int i=0; i<=num; i++)
        {
            if(i%2==1)
            {
                sum = sum+ i;
                
            }
            
        }
        System.out.print(sum);
            
            
        
    }

            
    
        
        
}


