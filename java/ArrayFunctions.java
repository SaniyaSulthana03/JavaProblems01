public class ArrayFunctions
{
     static int getMax(int[] arr)
     {
        int max=0;
        int n=arr.length;
        for( int i=0;i<n;i++)
        {
            // if(arr[i]<=max) 
            // {
            //     max=arr[i];
            // }
            
            max=Math.max(arr[i],max);
        }
        return max;

     }
     //worst case maximu is zero
     //worst case minimum is infinity
     //best case maximum is infinity
     //best case minimum is zero
      static int getMin(int[] arr)
      {
        int min=Integer.MAX_VALUE;
        int n=arr.length;
         for( int i=0;i<n;i++)
         {
            min=Math.min(min,arr[i]);

         }
         return min;
        }
    public static void main(String[] args)
    {
        //int[] arr=new int[4];
        int arr[]={10,20,50,30};
        //ArrayFunction=new ArrayFunction
        int max=getMax(arr);
        int min=getMin(arr);
        System.out.printf("max=%d  min=%d",max,min);
    }

}
    

