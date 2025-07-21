import java.io.*;
import java.util.*;
public class CostofJourney{
    public static void main(String[] args){
        //recursive algorithm
        int[] days={1,3,8,9,10,21,23,27,31};
        int[] costs={4,10,25};
        int n=32;
        System.out.println(fun_dp(days,costs,n));
    

    }
    static int fun_dp(int[] days,int[] costs,int n)
    {
        int[] dp=new int[n];
        //array into arrayList
        List travel_days=Arrays.asList(days);
        for(int i=0;i<n;i++)
        {
            if(travel_days.contains(i))
                dp[i]=((i-1)>=0) ? dp[i-1]:0;
            else{
                int daily=0,weekly=0,monthly=0;
                if((i-1)>=0)
                daily=costs[0]+dp[i-1];
                else
                daily=costs[0];
                if((i-7)>=0)
                weekly=costs[1]+dp[i-7];
                else
                weekly=costs[1];
                if((i-30)>=0)
                monthly=costs[2]+dp[i-30];
                else
                monthly=costs[2];

            }
            return dp[n-1];
            
        }
        
    }
    static int min(int a,int b,int c)
    {
        if(a<b)


    }
    
}
