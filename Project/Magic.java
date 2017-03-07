
/**
 * William
 */
public class Magic
{
    
    private int n;
    public Magic(int k)
    {
        n=k;
    }

    public void  square()
    {
        
        if(n %2==1 && n<20 && 2<n)
        {
            int[][] sq = new int[n][n];
        int r=0;
        int c=n/2;
        for(int i=0;i<n*n;i++) 
        {
            sq[r][c] = i+1;
            int saveR=r;
            int saveC=c;
            
            if(r<0) {
                r=n-1;
            }
            c++;
            if(c==n) {
                c=0;
            }
            if(sq[r][c]!=0) {
                r = saveR+1;
                c = saveC;
            }
            System.out.print(sq[r][c]);
        }
        
        }
        

    }

}
