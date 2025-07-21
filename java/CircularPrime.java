public class CircularPrime {
    public static void main(String[] args)
    {
        //number=1234==>rotations are 1432,1324,4123,4321 etc
        //convert number into string
        //programmingbydoing.com
        int number=19;
        //if(isCircularPrime(number)==true)
        //System.out.print("\n"+"is circular prime");
        //else
        //System.out.print("\n"+"not a circular prime");
         int np=nearestPrime(number);
         System.out.print(np);
    }
    static boolean isCircularPrime(int number){
        String str=String.valueOf(number);
        int n=str.length();
        for(int i=0; i<n-1; i++){
            String rotation=
            str.substring(i,n)+str.substring(0,i);
            int num=Integer.parseInt(rotation);
            if(is_prime(num)==false) return false;
        }  
        return true;  
    }
    static boolean is_prime(int n){
        if(n<2)return false;
        int seed=2;
        while(seed<=(int)Math.sqrt(n))
        {
            if(n%seed==0) return false;
            seed++;
        }
        return true;

    }
    static int nearestPrime(int n)
    {
        if(n<=1) return 2;
        else if(n==2) return 3;
        else{
            //going left
            //going right
            int i=1;
            while(true)
            {
                if(is_prime(n-i)==true)
                break;
                i++;
            }
            int j=i;
            while(true){
                if(is_prime(n+j)==true)
                break;
                j++;
            }
            if(i<=j)
            return n-i;
            return n+j;
        }

    }
}
