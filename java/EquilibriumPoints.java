public class EquilibriumPoints {
    public static void main(String[] args){
        int arr[]={1,2,3,100,5,1};
        int pos=fun(arr);
        if(pos==-1)
        System.out.println("no pivot");
        else
        System.out.println("pivot position"+pos);

    }
    static int fun(int[] arr){
        int n=arr.length;
        for(int i=1;i<n-1;i++)
        {
           int left_sum=0,right_sum=0;
           for(int j=0;j<i;j++)
           left_sum+=arr[j];
           //left sum
           //right sum
           for(int j=i+1;j<n;j++)
           right_sum+=arr[j];
           System.out.println(left_sum+" "+right_sum);
           if(left_sum==right_sum) return i;
           
        }
        return -1;

    }
    
}
