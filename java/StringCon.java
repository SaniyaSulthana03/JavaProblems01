public class StringCon {
    public static void main(String args[]){
        //converting string to integer
        // String s1="1000";
        // String s2="2000";
        // int x1=Integer.parseInt(s1);
        // int x2=Integer.parseInt(s2);
        // int x=x1+x2;
        // System.out.println(x);

        //converting number to string
        // String name="Ram";
        // int age=20;
        // System.out.printf("%s is %s years old",name,String.valueOf(age));


        // String name="Ram";
        // int age=20;
        // String age1=String.valueOf(age);
        // System.out.printf(name+"is"+age1+"years"+" "+"old");



        Scanner reader=new Scanner(System.in);
        String[] values =reader.nextLine().split(" ");

        String name=values[0];
        int age=Integer.parseInt(values[1]);
        double height=Double.parseDouble(values[2]);
        System.out.printf("%s  %d.2f",name,age,height);
        



    //float to 



    }
    
}
