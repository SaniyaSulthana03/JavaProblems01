import java.util.*;
public class AnagramsOrNot {
    public static void main(String[] args){
        String s1="elbow";
        String s2="below";
        if(are_anagrams(s1,s2))
        System.out.println("are anagrams");
        else
        System.out.println("not an anagrams");
    }
    static boolean are_anagrams(String s1, String s2)
    {
        int[] c1=new int[26];
        int[] c2=new int[26];
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int n=s1.length();
        for(int i=0;i<n;i++)
        c1[ch1[i]-97]++;
        for(int i=0;i<n;i++)
        c2[ch2[i]-97]++;
        if(Arrays.compare(c1,c2)==0) return true;
        else
        return false;
    }
    //care race
    //below elbow
    
    
}
