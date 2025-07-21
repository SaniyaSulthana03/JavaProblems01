public class MoneyDeposit {
    public static void main(String args[])
    {
        // lazy propogation algorithm
        // p=1470
        // emi=500
        // n=? 3
        // installment=20;
        // laptop=40000;
        // annual rate=12%;
        // 1470(1+0.01)=1485;
        // 985(1+0.01)=995;
        // 495(1+0.01)=500-500=0;
        // x(1+r/12)-emi=remaining
        int emi=500;
        int n=3;
        double r=12;
        r=r/100;
        int rem=0;
        while(n>0) 
        {
            int x=(int)((rem+emi)/(1+r/12));
            rem = x;
            n=n-1;
        }
        int available=1470;emi=500;r=0.12;
        System.out.println(rem);
        System.out.println(getNoOfMonths(available,emi,r));
    }
    static int getNoOfMonths(int available,int emi,double r)
    {
        int n=0;
        while(true)
        {
            if(available<=Math.abs(1)) break;
            available=(int)(available*(1+r/12)-emi);
            n++;
        }
        return n;
    }
    
}
