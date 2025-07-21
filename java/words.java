import java.util.*;
//import java.io.*;
public class words {

    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        String[] items= reader.nextLine().split(" ");
        System.out.println(items.length);
        String longestword=getLongest(items);
        String shortestword=getShortest(items);
        System.out.println(shortestword);
        System.out.println(longestword);
    }
    static String getLongest(String[] words){
        String longestword=" ";
        int maxLength=0;
        int n=words.length;
        for(int i=0; i<n; i++){
            int length=words[i].length();
            if(length>maxLength){
                maxLength=length;
                longestword=words[i];
            }
        }
        return longestword;
    }
    static String getShortest(String[] words){
         String shortestword=" ";
         int minLength=Integer.MAX_VALUE;
         int n=words.length;
         for(int i=0; i<n; i++){
            int length=words[i].length();
            if(length<=minLength){
                minLength=length;
                shortestword=words[i];
            }
        }
        return shortestword;    
    }
 } 
         

        // String[] cities={"hyd","blr","mumbai", "pune"};
        // System.out.println(cities.length);     //for arrays
        // System.out.println(cities[2].length());    //for strings
    
