public class Zigzag 
{
    public static void main(String[] args)
    {
        static int arr[]={0,2,1,0,0,1,1,2,0,0,1,2,1,2};
        f(arr);
        for(int i:arr)
        {
            System.out.println("%d: " + i);

        }
    }

    static int f(int[] a){
       int left=0,mid=0,right=a.length-1;
        while(mid<=right)
        {
            if(a[mid]==0)
            {
                int t=a[left];
                a[left]=a[right];
                a[right]=t;
                left++;mid++;
            }
            else if(a[mid]==1)
                mid++;
            else{
                int p=a[mid];
            }     
        }
    }
}
