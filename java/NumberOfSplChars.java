import java.util.*;
public class NumberOfSplChars {
    //public class SumOfTheirAsciiValues {
        public static void main(String[] args){
            String str="a@123bc$123";
            int sum=fun(str);
            System.out.print(sum);  
        }
        static int fun(String str){
            int na=0,nd=0,sum=0;
            int n=str.length();
            char[] ch=str.toCharArray();
            for(int i=0;i<n;i++){
                if(Character.isDigit(ch[i]))
                nd++;
                 if(Character.isAlphabetic(ch[i]))
                na++;
                sum=sum+(ch[i]+0);
            }
            return sum;
        }
    }
    
    

