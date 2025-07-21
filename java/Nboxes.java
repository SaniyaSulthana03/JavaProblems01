public class Nboxes {
    // public static void main(String[] args)
    // {
    //     int cartons[]={2,3,4,-0,3,0,4,5,0,0};
    //     pushZeros(cartons);
    //     for(int candies:cartons)
    //     System.out.print(candies+" ");
    // }
    // static void pushZeros(int[] a)
    // {
    //     int n=a.length;
    //     int left=0,right=n-1;
    //     while(left<right){
    //         if(a[left]==0){
    //             if(a[right]==0) right--;
    //             else{
    //                 int t=a[left];
    //                 a[left] = a[right];
    //                 a[right] =t;
    //                 left++; right--;
    //             }
    //         }
    //         else left++;
    //     }
    //     return;
    // }

    //for keeping the negative numbers at the right
    public static void main(String[] args)
    {
        int cartons[]={2,3,4,-4,3,-3,4,5,-8,-9};
        pushNegative(cartons);
        for(int candies:cartons)
        System.out.print(candies+" ");
    }
    static void pushNegative(int[] a)
    {
        int n=a.length;
        int left=0,right=n-1;
        while(left<right){
            if(a[left]<0){
                if(a[right]<0) right--;
                else{
                    int t=a[left];
                    a[left] = a[right];
                    a[right] =t;
                    left++; right--;
                }
            }
            else left++;
        }
        return;
    }
}
//help store manager to push all empty cartans to right side
//rule1 if l!=0 and r==0
//rule2 if l!=0 and r!=0(swap)
//rule3 if l==0 and r!=0
//rule4 if l==0 and r==0 

