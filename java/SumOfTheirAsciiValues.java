public class SumOfTheirAsciiValues {
    public static void main(String[] args){
        String str="a@123bc$123";
        int sum=fun(str);
        System.out.print(sum);  
    }
    static int fun(String str){
        int sum=0;
        int n=str.length();
        char[] ch=str.toCharArray();
        for(int i=0;i<n;i++){
            if(Character.isAlphabetic(ch[i]))
            sum=sum+(ch[i]+0);

        }
        return sum;
    }
}
