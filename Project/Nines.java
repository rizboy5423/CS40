import java.util.*;

public class Nines

{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1 for yes, 2 for no ");

        int score = 0;
        int rolls = 0;
        int num = (int)(Math.random()*6) + 1;
        while(rolls<2)
        {

            System.out.print(" your roll was: " + num);
            score = score + num;
            if(score>9)
            {
              score = score - 9;
            }
            System.out.print(" your score is: " + score);
            num = (int)(Math.random()*6) + 1;
            rolls++;

              
        }


    }
}