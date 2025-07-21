public class LongestIncreasingSubsequence
 {
    public static void main(String[] args)
    {
        int[] a={1,10,2,9,3,8,4,-1};
        int n=a.length;
        int prev=-Integer.MAX_VALUE;
        int ans1=fun1(a,0,prev,n);
        System.out.println("length of longest integer subsequence:"+ans1);
        int ans2=fun2(a,0,n);
        System.out.println("lenght of longest integer subsequence: "+ans2);
        int ans3=fun3(a);
        System.out.println("Length of longest increasing subsequence using dp: "+ans3);
    }
    private static int fun1(int[] a,int i, int prev,int n)
    {
        if (i==n) return 0;
        if(a[i]>prev)
        {
            int opt1=1+fun1(a,i+1,a[i],n);   //i+1=10  ,  a[i]=1
            int opt2=fun1(a,i+1,prev,n);
            return Math.max(opt1,opt2);
        }
        else
        return fun1(a,i+1,prev,n);
    }
    private static int fun2(int[] a,int i,int n)
    {
        int max_len=0;
        for(int j=i+1;j<n;j++){    //j next element  and i is prev elem
            if(a[j] > a[i])
                max_len=Math.max(max_len,1+fun2(a,j,n));
            // int length=1+fun2(a,j,n);
            // if(length>max_len)
            // max_len = length;
            
        }
        return  1+max_len;
     }
     public static int fun3(int a[]/){
         //dp[i] is the length of longest increaing subsequence up ti ith element of the array
         // dp[0]=1  {10}
         // dp[1]=1  {1,-1}
         // dp[2]=2  {1,-1,2}
         // dp[3]=2 {1,10,2,-1} 
         //i is next element and j is previous element
         int n=a.length;
         int[] dp=new int[n];
        dp[0]=1;
        for(int i=0;i<n;i++)
        {
            int max_len=0;
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i])
                {
                    if(dp[j]>max_len) 
                    max_len=dp[j]; 
                }
            }
            dp[i]=1+max_len;
        }
        // for(int i=0;i<n;i++){
        //     System.out.printf("%4d",a[i]);
        //     for(int i=)
        // }


    }
}


    

