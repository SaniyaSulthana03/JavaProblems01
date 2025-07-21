// public class BoatsProblem{
//     public static void main(String[] args)
//     {
//         int n=5;
//         int k=2;
//         int[]t={9,3,10,24,2};
//         int res=fun_rec(t,n,k);
//         System.out.println("minimum time required to paint"+n+"boars by"+k+"painters is"+res);   
//     }
//     static int fun_rec(int[] t, int n, int k)
//     {
//         if(n==1)
//         return t[0];
//         if(k==1)
//         return sum(t,0,n-1);
//         int min=Integer.MAX_VALUE;
//         for(int i=1;i<=n;i++)
//         min=Math.max(min,(fun_rec(t,i,k-1),sum(t,i,n-1)));
//     }
//     static int sum(int[] t,int from,int to){
//         int total=0;
//         for(int i=0;i<=n;i++){

//         }
        

//     }
    
    
// }