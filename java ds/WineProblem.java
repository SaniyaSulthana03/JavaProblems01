public class WineProblem {
    public static void main(String[] args){
        int[] price={2,4,6,5};
        int left=0,right=price.length-1,year=1;
        int profit=fun(price,left,right,year);
        System.out.println(profit);
    }
    private static int fun(int[] price,int left,int right,int year){
        if(left==right) return year*price[left];
        int opt1=year*price[left]+fun(price,left+1,right,year+1);
        int opt2=year*price[right]+fun(price,left,right-1,year+1);
        return Math.max(opt1,opt2);
    }
    
}
