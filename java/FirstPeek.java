import java.util.Arrays;
public class FirstPeek
 {
    public static void main(String[] args) 
    {
        int[] sales={1,2,7,5,3,4,6,3,2};
        int n=sales.length;
        //for(int i=1;i<n-1;i++)
        int peak=firstPeak(sales);
        if(peak>0){
            System.out.print(peak+"\n");
        }
        //ascending data
        else{

            int[] dup=sales.clone();
            Arrays.sort(sales);
            if(Arrays.compare(sales,dup)==0)
            System.out.print(n);
        }
            else{
            int[] dup=sales.clone();
            for(int i=0;i<n;i++)
            sales[i] =-sales[i];

            Arrays.sort(sales);
             for(int i=0;i<n;i++)
            sales[i] =-sales[i];
        }

            if(Arrays.compare(dup,sales)==0)
            System.out.println(n);
        }

    }
    static boolean firstPeak(int []sales) {
        
        for(int i=1; i<n-1; i++){
            if(sales[i]>sales[i-1]&& sales[i]>sales[i+1])
            return i+1;
        }
        return -1;
    }

    
}
