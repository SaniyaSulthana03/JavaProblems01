
public class BubbleSort 
{
    public static void main(String[] args)
    {
        int[] arr={2,9,11,158,16,17};
        // int start=0;
        // int end=arr.length-1;
        // int steps=0;
        // int n=arr.length;
        // for(int pass=1;pass<=n;pass++)
        // {
        //     for(int i=start;i<=end;i++)
        //     {
        //         if(arr[i]>arr[i+1])
        //         {
        //             int t=arr[i];
        //             arr[i]=arr[i+1];
        //             arr[i+1]=t;
        //         }
        //     }
        //     steps++;
        //     end=end-1;
        //     } 
        //     for(int number:arr)
        //     System.out.print(number+"");
        //     System.out.println("\n"+steps);
        int start=0;
        int end=arr.length-1;
        boolean sorted=false;
        int steps=0;
        while(!sorted){
            boolean swap=false;
            //if not swap it is already sorted
            for(int i=start; i<end; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    swap=true;

                }
            }
            steps++;
            if(!swap)sorted=true;
            end=end-1;

        }
        for(int num:arr)
        System.out.println(num+" ");
        System.out.println("\n"+steps);

         }
    
}
