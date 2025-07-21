public class MultiplicationchainDp {
    public static void main(String[] args)
    {
        int[][] m={{10,20},{20,30},{30,5}};
        System.out.println(fun(m));
    }
    static int fun(int[][] m){
        int n=m.length;   //n is number of matrices
        //create  a 2D matrix,dp of size n*n and i initialize every cell with zero
        int [][] dp=new int[n][n];
        for(int gap=1;gap<n;gap++)
        {
            for(int i=0;i<n-gap;i++)
            {
                int j=i+gap;
                if(gap==0)
                dp[i][j]=0;
                else if(gap==1)
                dp[i][j] =m[i][0]*m[i][1]*m[j][1];
                else{
                    int min=Integer.MAX_VALUE;
                    for(int k=i;k<j;k++)
                    {
                        int left=dp[i][k];
                        int right=dp[k+1][j];
                        int product=m[i][0]*m[k][1]*m[j][1];
                        int total=left+right+product;
                        if(total<min) min=total;
                    }
                    dp[i][j]=min;
                }
                
            }
            
        }
        return dp[0][n-1];
    }
}
// left=rows of i and columns of j
// right=rows of k+1 and columns of j
