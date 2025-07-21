import java.util.*;
public class Anagram {
    public static void main(String[] args){
        // String str="saniya";
        // String str2="sulthana";
        // char[] a=str.toCharArray();
        // char[] b=str2.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        char[] arr1=args[0].toCharArray();
        char[] arr2=args[1].toCharArray();

        if(arr1.length != arr2.length)
        System.out.println("an anagram");
        else
        System.out.println("not an anagram");


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1=String.valueOf(arr1);
        String s2=String.valueOf(arr2);

        if(s1.equals(s2)==true)
        System.out.println("anagram");
        else
        System.out.println("not an anagram");
    }   
}
