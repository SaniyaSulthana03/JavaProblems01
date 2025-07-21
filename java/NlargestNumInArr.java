//to know the n largest element of an array
public class NlargestNumInArr
 {
    public static void main(String[] args){
        int[] arr={9,8,7,9,11,158,16,17};
        int start=0;
        int n=arr.length;
        int end=n-1;
        //boolean sorted=false;
        int steps=0;
        while(steps<=2){
            //boolean swap=false;
            //if not swap it is already sorted
            for(int i=start; i<end; i++)
            {
                if(arr[i]>arr[i+1]) // < for smallest number
                {
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    //swap=true;

                }
            }
            steps++;
           // if(!swap)sorted=true;
            end=end-1;

        }
        for(int num:arr)
        System.out.println(num+" ");
        System.out.println("\n"+arr[n-2]);

    }
}

    

