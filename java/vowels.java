
// import java.util.*;
// public class vowels 
// {
// public static void main(String[] args){
//     Scanner reader = new Scanner(System.in);
//     String word=reader.next();
//     int n=fun(word);
//     System.out.println(n);
// }
// static int fun(String word)
// {
//     int nVowels=0;
//     char[] characters=word.toCharArray();
//     for(char ch:characters){
//         if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') )
//         {
//             nVowels++;
//         }
//     }
//     return nVowels;
// }
import java.util.*;

public class vowels 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String word=reader.next();
    }

    static int fun(String word)
     {
        int nVowels = 0;
        String vowels = "aeiou";
        // char[] characters=word.toCharArray();
        int nchars = word.length();
        for (int i = 0; i < nchars; i++) 
        {
            if (vowels.contains(word.substring(i, i + 1)) == true)
             {
                nVowels++;
            }

        }
        return nVowels;
        //System.out.println(nVowels);
    }
}
