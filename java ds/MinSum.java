import java.util.*;
public class MinSum {
    public static void main(String[] args)
    {
        int arr[]={7,20,5,4};
        int k=3;
        ArrayList<Integer> list=new ArrayList<> ();
        // List<Integer> list=new ArrayList<>();
        System.out.println(list);
        for(int step=1;step<k;step++)
        {
            int replacement=list.get(step)/2;
            list.set(step,replacement);
            if(list.get(step)<list.get(step+1))
                step=step+1;
        }
        System.out.println(list);
        Integer res=list.stream().reduce(0,Integer::sum);
        System.out.println(res);

        


        

        
         
    }
    
}
