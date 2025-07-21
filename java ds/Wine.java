public class Wine {
    static int[] price={1,4,6,5,2};
    static int n=price.length;
    static int[][] dp=new int[n][n];
    static int[][] dp1=new int[n][n];

    public static void main(String[] args)
    {
        int start=0,end=n-1;
        int profit=f(start,end,day);
        System.out.println(profit);
        while(start<=end)
        {
            if(dp1[start][end]==0){
            System.out.print("buy on"+start);
            start=start+1;
            }
            if(dp1[start][end]==1){
                System.out.print("sell on"+end);
                end=end-1;
            }
            System.out.println();
        }
    }

    private static int f(int start,int end,int day)
    {
        if(dp[start][end]!=0)
        {
            return dp[start][end];
            if(start==end)
            return day*price[start];
            int leftProfit=day*price[start]+f(start+1,end,day+1);
            int rightProfit=day*price[end]+f(start,end-1,day+1);
            dp[start][end]=Math.max(leftProfit,rightProfit);

            if(leftProfit>=rightProfit)
            dp1[start][end]=0;
            else
            dp1[start][end]=1;
            return dp[start][end];
    }
    }
}

