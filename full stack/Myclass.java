public class Myclass 
{
    public static void main(String[] args)
    {
        String sentence="this is not good but it is not bad";
        String[] words=sentence.split(" ");
        String sub="is";
        int count=0;
        for(String word : words)
        {
            if(word.equals("sub"))
            {
                count++;
            } 
            System.out.println("count");   
        }
    }
}
