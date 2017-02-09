import java.util.*;

public class Hailstone

{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("n: ");
        int num = in.nextInt();
        int line = 0;

        while(num >1){
            if(line % 10 == 0)
            {
                System.out.println();
                line=0;
            }
            if(num % 2 == 1)
            {

                System.out.print(num + " ");
                num = num * 3 + 1;
                line++;

            }
            if(num % 2 == 0)
            {

                System.out.print(num + " ");
                num = num / 2;
                line++;

            }

            if (num == 1)
            {
                line = 0;
                System.out.println("n: ");
                num = in.nextInt();

            }
        }
    }
}