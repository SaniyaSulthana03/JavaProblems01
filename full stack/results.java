
import java.util.Scanner;
public class results {
    private cut_off=70;
    public boolean evaluate(int q,int v,int c)
    {
        if(q<cut_off&&v<cut_off&&c<cut_off)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        int quant=75;
        int verbal=65;
        int coding=55;
        results r=new results();
        System.out.println(r.evaluate(quant,verbal,coding));
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int v=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(r.evaluate(q,v,c));
        sc.close();
    }
   
}