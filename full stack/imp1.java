public class imp1 {
    static int maxPrices(int[] prices,int left,int right,int year) {
        if(left==right)
          return year*prices[left];

        int opt_left = year*prices[left]+maxPrices(prices,left+1,right,year+1);
        int opt_right = year*prices[right]+maxPrices(prices,left,right-1,year+1);
        return Math.max(opt_left, opt_right);
    }
    public static void main(String[] args){
       int prices[]={2,4,6,2,5};
       int  left=0;
       int right=prices.length -1;
        int year=1;
        int max=maxPrices(prices,left,right,year);
        System.out.println(max);
    }
}
