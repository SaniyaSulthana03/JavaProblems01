public class Emi{
    public static void main(String args[])
    {
        int p=1470;
        double r=12;
        r=r/100;
        int emi=500;
        int n=0;
        while(true)
        {
            if(p<=Math.abs(1)) break;
            p=(int)(p*(1+r/12))-emi;
            n=n+1;
        }
        System.out.println(n);
    }
}