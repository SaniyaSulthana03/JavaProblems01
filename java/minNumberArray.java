import java.util.Scanner;
public class minNumberArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter five numbers");
        for(int i = 0; i < 5; i++){
            int[] num=new int[5];
            System.out.println(sc.num[i]);
        }
        int[] num=new int[5];
        int min=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(min > num[i])
            {
                min=num[i];
                System.out.println(min);
            }
            // System.out.println(min);
        }

    }

    
}
