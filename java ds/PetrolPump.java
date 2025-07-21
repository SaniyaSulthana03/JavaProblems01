public class PetrolPump {
    public static void main(String[] args)
    {
        int[] arr={2,3,5,6,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
           sum+=arr[i];
        boolean[][]dp=new boolean [n+1][sum+1];
        for(int i=0;i<n;i++)
            dp[i][0]=true;
        for(int j=1;j<=sum;j++)
            dp[0][j]=false;
            for(int i=1;i<=sum;i++){
                for(int j=1;j<=sum;j++)
                {
                    dp[i][j]=dp[i-1][j];
                    if(arr[i-1]<=j)
                         dp[i][j]=dp[i][j]|| dp[i-1][j-arr[i-1]];
                }
            }
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=sum;j++)
                    System.out.println(dp[i][j]+ " ");
                System.out.println();
            }

    }
}
