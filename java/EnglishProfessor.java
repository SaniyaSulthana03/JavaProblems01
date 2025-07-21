import java.util.*;
public class EnglishProfessor 
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String[] names=reader.nextLine().split(" ");
         String[] words=reader.nextLine().split(" ");
         int n=names.length;
         int maxVowels=0;
         String winnerWord=" ";
         String winner=" ";
         for(int i=0;i<n;i++){
            int nVowels=fun(words[i]);
            if(nVowels>maxVowels){
                maxVowels=nVowels;
                winnerWord=words[i];
                winner=names[i];
            }
        }
        System.out.println("winner:"+winnerWord);
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
     }

}
