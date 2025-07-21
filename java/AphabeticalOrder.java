public class AphabeticalOrder {
    public static void main(String[] args){
        String city="madanapalli";
        char[] ch= city.toCharArray();
        
        int n=city.length();
        int[] count=new int[26];
        for(int i=0; i<n; i++){
            count[ch[i]-97]++;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0)
            System.out.println((char)(97+i)+":"+count[i]);
        }
        return;
    }
}
