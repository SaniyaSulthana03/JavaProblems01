public class LongestPalindromeSubset {
    // longest palindrome substring by dynamic programming
    // length 1.g,e,e,k    len2:ge,ee,ek    len3:gee,eek     len4:geek
    //len of string is 4.
     public static void main(String args[])
     {
        String s="abcbcaacceecbcba";
        int length=fun(s);
        System.out.print(length);
     }
     static int fun(String s)
     {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int res=0;
        for (int gap=0; gap<n; gap++)
        {
            for(int i=0; i<n-gap; i++){
               int j=i+gap;
               if(gap==0)
                   dp[i][j] = true;
               else if(gap==1)
               {
                    if(s.charAt(i)==s.charAt(j))
                    dp[i][j] = true;
               }
               else{
                   if((s.charAt(i)==s.charAt(j)) && (dp[i+1][j-1]==true))
                      dp[i][j]=true;
               }
               if(dp[i][j]==true)
                    res=1+gap;
                 
            }
        }
        return res;
     }
}
