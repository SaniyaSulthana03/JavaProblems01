public class LongestPalindromeStringRecursion {
    public static void main(String[] args)
    {
        String s="abbcccbbasdreaaa";
        int length=fun(s,0,s.length()-1);
        System.out.println(length);
    }
    private static int fun(String s,int start,int end)
    {
        if(start==end) return 1;       //for one character
        else if(end-start==1)          //two characters
        {
            if (s.charAt(start)==s.charAt(end))
            return 2;
            else
            return 1;
        }
        else{                       //for morethan 2 characters
            if(s.charAt(start)==s.charAt(end))
            return 2+fun(s,start+1,end-1);
            else
            return Math.max(fun(s,start+1,end),fun(s,start,end-1));

        }
 
    }
    
}
