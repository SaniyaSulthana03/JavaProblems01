public class imp3 
{
    static int ways(int n,int[] steps)
    {
        if(n<0) return 0;
        if(n==0)return 1;
        else
        {
            int total=0;
            for(int i=0;i<steps.length;i++)
                total= total + ways(n-steps[i],steps);
                return total;
            
        }
        
    }
    public static void main(String[] args){
        int n=2;
        int[] steps={1,2};
        int res=ways(n,steps);
        System.out.println(res);


    }
}
//f(n)=f(n-1)+f(n-2)+f(n-3)