public class imp4 {
    public static void main(String[] args){
        int[] a={2,3,4,5,1};
        int x=2;
        int sum=0;
        int mul=0;
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        {
            int term=1;
            for(int j=i;j>=0;j--){
                term=term*x;
                mul++;
                
            }
            sum=sum+a[i]*term;
            if(j!=0)mul++;


         
    }
    System.out.println(mul);
}
}

//fundamentals of algorithm by rajasekaran

