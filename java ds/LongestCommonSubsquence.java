import java.lang.StringBuilder;
public class LongestCommonSubsquence {
    //subsequence of saniya
    //madan mohan 
    // m is same,a is same ,n is same  the longest subsequent is 3
    public static void main(String[] args){
        String s1,s2;
        s1="madan";
        s2="mohan";
        int m=s1.length();
        int n=s2.length();
        int length1=fun1(s1,s2,m,n);
        int length2=fun2(s1,s2,0,0);
        int length3=fun3(s1,s2);
        int length4=fun4(s1,s2);
        System.out.println(length1);
        System.out.println(length2);
        System.out.println(length3);
        System.out.println("super sequence:"+length4);
        String str="13215";
        StringBuilder sb = new StringBuilder(str);
        String str1=sb.reverse().toString();
        System.out.println("LPSS="+fun3(str,str1));

        
    }
    //topdown approach  -->last to first  -->tabulation approach
    static int fun1(String s1, String s2,int m,int n)
    {
         if(m==0 || n==0) return 0;
         if(s1.charAt(m-1)==s2.charAt(n-1)) return 1+fun1(s1,s2,m-1,n-1);
         else{
            int opt1=fun1(s1,s2,m,n-1);
            int opt2=fun1(s1,s2,m-1,n);
            return Math.max(opt1,opt2);
         }
    }
    //bottomup approach --> first To last  -->memoization
    static int fun2(String s1, String s2,int i,int j)
    {
        int m=s1.length();
        int n=s2.length();
        if(i==m || j==n) return 0;   //if i reaches m and j reaches n then the string is over
        if(s1.charAt(i)==s2.charAt(j))  return 1+fun2(s1,s2,i+1,j+1);
        else
            return Math.max(fun2(s1,s2,i,j+1),fun2(s1,s2,i+1,j));  
    }
    //using dynamic approach
    static int fun3(String s1,String s2)
    {
        int m,n;
        m=s1.length();
        n=s2.length();
        int[][]dp=new int[m+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1 ]);

            }
        }
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.printf("%4d",dp[i][j]);
            }
            System.out.println();
        }
        return dp[m][n];

    }
    //function for length of smallest common super sequence
    static int fun4(String s1,String s2)
    {
        return s1.length()+s2.length()-fun3(s1,s2);
    }

}

