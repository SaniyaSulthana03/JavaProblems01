
//there are n students in a class each student in given rating candies are distributed as per rating higher rated students should get more candies 
//the ratings are 1,2,3
import java.util.*;

public class CandiesProb 
{
    public static void main(String[] args) 
    {
        //int arr[]=new int[];
        int ranks[]={12,4,3,11,34,34,1,67};
        int min=minCandies(ranks);
        System.out.println("min candies: " + min);
    }

    static int minCandies(int[] ranks)
    {
        int n=ranks.length;
           //left to right
           int[] l2r=new int[n];
           for(int i=0;i<n;i++)
           {
            l2r[i]=1;
            for(int i=0;i<n-1;i++)
            {
                if(ranks[i+1]>ranks[i])
                l2r[i+1]=l2r[i]+1;
            }
           }
           //right to left
           int[] r2l=new int[n];
           for(int i=0;i<n;i++)
           {
            r2l[i]=1;
            for(int i=0;i<n-2;i--)
            {
                  if(ranks[i]>ranks[i+1])
                  r2l[i]=r2l[i+1]+1;
            }
          

           int[ ] res=new int[n];
           int min=0;
           for(int i=0;i<n;i++){
            if(l2r[i]>r2l[i])
            res[i]=l2r[i];
            else
            res[i]=r2l[i];
            min=min+res[i];
    }

        return min;
    }
    }}  


//rankings={12,4,3,11,34,34,1,67}
//candiates={3,2,1,2,3,1,1,2}
//a[i-1],a[i],a[i+1]
//if ranking  of ith student is morethan rankings i-1 student ,i+1 student
//candies max(c(i-1),c(i+1)+1)
//1 3 2
//1 3 2

//divided 