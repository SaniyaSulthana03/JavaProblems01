public class Primes {
    public static void main(String[] args){
        // if(is_prime(11)==true)
        // System.out.print("\n"+"yes");
        // else
        // System.out.println("\n"+"no");
        int nprimes=0;
        for(int number=1;number<=100;number++)
        {
            if(is_prime(number)==true){
             System.out.println(number+" \n");
            
            nprimes++;
            }
           
        }
         System.out.println("\n"+nprimes);

    }
    static boolean is_prime(int n)
    {
        if(n<=1)return false;
        int seed=2;
        while(seed<=n/2)
        {
            if((n%seed)==0)return false;
            seed++;
        }
        return true;

    }
    
}
