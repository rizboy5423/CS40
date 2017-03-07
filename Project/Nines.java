import java.util.*;

public class Nines

{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("2 for yes, 1 for no ");
        int comp = 0;
        int score = 0;
        int rolls = 0;  
        int time = 0;
        int num = (int)(Math.random()*6) + 1;
        while(rolls<2)
        {

            System.out.print(" your roll was: " + num);
            score = score + num;
            if(score>9)
            {
                score = score - 9;
            }
            System.out.println(" your score is: " + score);
            num = (int)(Math.random()*6) + 1;
            rolls++;

        }
        for(int i=2; i>=rolls; i++)
        {
            
            System.out.println(" Do you want to roll");
            int poss = in.nextInt();
            if(poss>1)
            {
                num = (int)(Math.random()*6) + 1;
                System.out.print(" your roll was: " + num);
                score = score + num;
                if(score>9)
                {
                    score = score - 9;
                }
                System.out.println(" your score is: " + score);
                
                rolls++;
                time++;

            }else{
                
                rolls++;
                rolls++;
                
            }
            if(time==5)
            {
                rolls++;
                rolls++;
                
            }
        }
        for(int k=-2; time>k; k++)
        {
                num = (int)(Math.random()*6) + 1;
                System.out.print(" the computer's roll was: " + num);
                comp = comp + num;
                if(comp>9)
                {
                    comp = comp - 9;
                }
                System.out.println(" the computer's score is: " + comp);
                if(comp>score)
                {
                    k++;
                    k++;
                    k++;
                    k++;
                    k++;
                    k++;
                    k++;
                    
                }
                
        }

    }
}