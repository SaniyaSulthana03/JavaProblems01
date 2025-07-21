public class Ways {
    public static void main(String[] args)
    {
        int T=4,p=14;
        System.out.println(ways(T,p));
    }
    static int ways(int T,int N)
    {
        int n2=N/T;
        int n1=n2+1;
        int t1=N%T;
        int t2=T-t1;
        int[] f=new int[N+1];
        f[0]=1; 
        f[1]=1;
        for(int i=2;i<=N;i++)
        {
            f[i]=i*f[i-1];
            int divide=f[N]/(int)(Math.pow(f[n1],t1))*(int)(Math.pow(f[n2],t2)*f[t1]*f[t2]);
            int arrange=1;
            if(n1>4)
            arrange=(int)Math.pow(f[n1-1]/2,t1)*(int)Math.pow(f[n2-1]/2,t2);
            int total_ways=divide*arrange;
            return total_ways;
        
        }

    }    
}
