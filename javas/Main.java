//write a code to given 26 characters how many words of size 5 can be formed
//npr3
import java.util.Scanner;
// import java.io.*;

public class Main{
public static void main(String[] args){
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