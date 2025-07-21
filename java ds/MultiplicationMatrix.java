public class MultiplicationMatrix {
    public static void main(String[] args)
    {
        int[][] m=
        {{10,20},{20,30},{30,5}};
        System.out.println(m[0][0]);
        int n=m.length;
        int min=fun(m,0,n-1);
        System.out.println(min);

    }
    static int fun(int[][] m,int i,int j) 
    {
        if(i==j) return 0;   //for one matrix
        if(j-1==1)           //for two matrices
        return m[i][0]*m[i][1]*m[j][1];
        else
        {
            int min=Integer.MAX_VALUE;
             for(int k=i;k<j;k++)
             {
                //number of multiplications
                //matrix[i] to matrix[k]
                int left=fun(m,i,k);
                //multiplications to multiply
                //matrix[k+1] to matrix[j]
                int right=fun(m,k+1,j);
                int left_right=m[i][0]*m[k][1]*m[j][1];
                int total=left+right+left_right;
                min=Math.min(min,total);
                // min=if(total<min) min=total;
        
             }
             return min;
            }
        
    }

}
