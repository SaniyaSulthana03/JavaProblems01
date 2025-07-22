
//given a sentence find a word which has more numbers of vowels read that file from a file using scanner class.
import java.io.File;
import java.util.Scanner;
//String sentence=" ";
//String result=" ";
public class vowels{
    String sentence=" ";
    String result=" ";
    public static void main(String[] args)
    {
        
        
        try{
            File f=new File("vowels.txt");
            Scanner scan=new Scanner(f);
            String sentence=scan.nextLine();
            sentence.close();
            System.out.println(sentence);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("issue is resolved");
        }
        String[] words =sentence.split(" ");
        int max= 0;

        for(String word : words){
            int n=0;
            for(int i=0;i<word.length();i++)
            {
                if((word.charAt(i)=='a')||(word.charAt(i)=='e')||(word.charAt(i)=='i')||(word.charAt(i)=='o')||(word.charAt(i)=='u')){     
                 n++;
                }
                if(n>max){
                    max=n;
                    result=word;
                }
                System.out.println(result + " "+ " " +max);
            //scan.close();
        
        
            }
            
        }
    
         result=result+":" +String.valueOf(max); 
         try{
              FileWriter Writer=new FileWriter("output.txt");
              Writer.write(result);
            Writer.close();
         }
         catch(Exception e){
              System.out.println(e);
         }
     
    
    }
}

//program without collections


    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the sentence");
    //     String s=sc.nextLine();
    //     int count=0;
    //     for(int i=0;i<s.length();i++)
    //     {
    //         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
    //         {
    //             count++;
    //         }
    //     }
    //     if(count>s.length()/2)
    //     {
    //         System.out.println("the word has more vowels");
    //     }
    //     else
    //     {
    //         System.out.println("the word has less vowels");
    //     }
    // }
