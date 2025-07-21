// push all odd numbers to left and all even numbers to right
// non zero on the left hand and zeros on right side
// negative numbers on left and positive on right side
// import java.util.*;
// public class Swap
// {
//     public static void main(String[] args)
//     {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         int left=0,right=arr.length-1;
//         while(left<right) //atleast 2 numbers
//         {
//             if(arr[left] % 2==0)
//             {
//                 if(arr[right] % 2==0)
//                 {
//                     //swapping
//                     int t=arr[left];arr[left]=arr[right];
//                     arr[right]=t;
//                 }
//                 else
//                     right=right-1;
//             }
//             else
//             left=left+1;
//         }
//         for(int elem:arr)
//         System.out.println(elem + " " );

//         }

//     }



public class Swap
{
    public static void main(String[] args)
    {
        int[] arr = {1,0,3,0,5,0,7,0,9};
        int left=0,right=arr.length-1;
        while(left<right) //atleast 2 numbers
        {
            if(arr[left] ==0)
            {
                if(arr[right] !=0)
                {
                    //swapping
                    int t=arr[left];arr[left]=arr[right];
                    arr[right]=t;
                }
                else
                    right=right-1;
            }
            else
            left=left+1;
        }
        for(int elem:arr)
        System.out.println(elem + " " );

        }

    }

    
        


