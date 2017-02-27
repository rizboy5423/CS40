
/**
 * William Kong
 */
public class Square
{
    private int r;
    private int c;
    private int n;
    String algorithm;
    public Square(String alg)
    {
        algorithm = alg;
    }

    public void decode()
    { 
        int l = algorithm.length();
        int sqr = (int)Math.sqrt(l);
        if(sqr*sqr == l)
        {

            for(int w = 0; w<sqr; w++)
            {
                for(int e = 0; e<algorithm.length(); e +=sqr)
                {
                    System.out.print(algorithm.charAt(e+n));
                }
                n++;
            }
        }

       
    }

    public void other()
    {
        int sqr=1;
        int[][] myTable = new int[sqr][sqr];
        for (int r=0; r<myTable.length; r++) {
            for (int c=0; c<myTable.length; c++) { 
                System.out.print( algorithm.charAt(n));
                n++;
            }
            System.out.println();
        }

    }

}
