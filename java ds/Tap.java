public class Tap {
    public static void main(String[] args)
    {
        int n=5;
        int[] ranges={3,4,1,1,0,0};
        int res=minTaps(n,ranges);
        System.out.println(res);
    }
    static int minTaps(int n, int[] ranges)
    {
        //creating a 1d array shows min number of taps to open to water upto ith point
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++)
        dp[i] =Integer.MAX_VALUE;
        dp[0]=0;
        for(int i=0;i<=n;i++)
        {
            int left=Math.max(0,i-ranges[i]);
            int right=Math.min(n,i+ranges[i]);
            System.out.println(i+" "+left+" "+right);
            for(int j=left;j<=right;j++)
            {
                int nTaps=dp[left]+1;
                if(nTaps<dp[j])
                dp[j]=nTaps;
                
            }
        }
        for(int x:dp)
        System.out.println(x+"");
        System.out.println();
        if(dp[n]<Integer.MAX_VALUE && dp[n]>-Integer.MAX_VALUE)
        return dp[n];
        else
        return -1;

    }
    
}
