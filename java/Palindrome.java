import java.util.*;
public class Palindrome {
    public static void main(String args)
    {
        Scanner sc=new Scanner(System.in);
        String[] word= sc.nextLine().split("");
        //int n=fun(words);
        int n=fun(word);
        System.out.print(n);
    }
    static int fun(String[] word)
    {
        int npalindrome = 0;
        for(String words : word)
        {
            if(is_palindrome(words.toLowerCase())==true){
                npalindrome++;

            }
        }
        return npalindrome;
    }
    static boolean is_palindrome(String word) 
    {
        int left=0;
        int right=word.length()  -1;
        while(left<right)
        {
            if(word.charAt(left)!=word.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
}

//print a 5*5 matrix as shown
// a b c d e
// p q r s f        
// o x y t g
// n w v u h
// m l k j i