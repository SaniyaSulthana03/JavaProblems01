import java.util.*;
public class CircularLink {
    public static void main(String[] args) {
        //minimum number of steps required to reach the destination
        String[] cards={"white","black","blue","green","yellow","violet"};
        int start=1;
        String card="yellow";
        int min_steps=shift(cards,start,card);
        System.out.println(min_steps);
    }
    static int shift(String[]cards,int start,String card)
    {
        List<String> colors=new ArrayList<>();   //converting array to the list
        System.out.println(colors);
        Collections.addAll(colors,cards);
        // System.out.println(colors);
        int end=colors.indexOf(card);
        System.out.println(end);
        int n=colors.size();

        if (start==end) return 0;
        if(Math.abs(start-end)==1)return 1;

        //forward direction
        if(Math.abs(start-end)==1)return 1;
        int d1=end>start ?(start+1+n-1-end) :(start-end);
        int d2=end>start ? end-start :n-1-end+1+start;
        int dst=Math.min(Math.abs(start-end),(n-1-end+1+start));
        // return Math.min(d1,d2);
        return dst;
        //Backward direction
    }
    static int min(int a,int b,int c)
    {
        if(a<b)
        if(a<c) return a;else return c;
        else if(b<c) return b;
        else return c;
    }
}
