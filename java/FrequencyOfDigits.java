public class FrequencyOfDigits {
    public static void main(String[] args){
        char ch1='a';
        char ch2='A';
        char ch3='0';
        int x=ch1,y=ch2,z=ch3;
        System.out.println(x+" "+y+" "+z);
        //zero=48 ascii value
        String city="1020304050555";
        char[] ch= city.toCharArray();
        int n=city.length();
        int[] count=new int[10];
        for(int i=0; i<n; i++){
            count[ch[i]-48]++;
        }
        for(int i=0;i<10;i++){
            if(count[i]!=0)
            System.out.println((char)(48+i)+":"+count[i]);
        }
        return;
    }
    
}
