import java.io.*;
public class Middle 
{
    public static void main(String[] args)
    {
        int arr[]={0,1,2,0,0,1};
        int arr_size=arr.length;
        Sort012(arr, arr_size);
        printArray(arr, arr_size);
    }
    static void printArray(int[] arr, int arr_size)
    {
        int i;
        for(i=0; i<arr_size; i++)
        {
            System.out.println(arr[i]+" ");
        System.out.println(" ");

        }
    }

    static void Sort012(int a[],int arr_size)
    {
        int prev = 0;
        int next=arr_size;
        int middle=0,temp=0;
        while(middle <=next)
        {
            switch(a[middle])
            {
                case 0:
                {
                    temp=a[prev];
                    a[prev]=a[next];
                    a[next]=temp;
                    prev++;
                    middle++;
                    break;

                }
                case 1:
                {
                    middle++;
                    break;
                }
                case 2:
                {
                    temp=a[middle];
                    a[middle]=a[next];
                    a[next]=temp;
                    next--;
                    break;
                }
            }
        }
    
   }
}
