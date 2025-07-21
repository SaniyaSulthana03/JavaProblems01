//indian team ha 16 players but only 11 can be played a game in how many different ways can be formed from 16
//ncr
//permutations for number of words for given characters
qq
import java.util.Scanner;

public class Cricket {
    public static void mainr(String[] args){         
    int n,r;

    Scanner scanner=new Scanner(System.in);
    n=scanner.nextInt();
    r=scanner.nextInt();
    System.out.println(n+r);
    long Words=noOfWords(n,r);
    System.out.println("number of words"+ Words);
}
    static long noOfWords(int n,int r){
        long res=f(n)/f(n-r);
        return res;
        

    }
    static long f(int n){
        long res=1;
        for(int i=2;i<n;i++){
            res=res*i;
            return res;
    }
}
}
// if it is not static
// main object=new main();
// object.println()

    

