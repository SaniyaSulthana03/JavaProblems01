import java.util.*;


class Wednesday{
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        String[] inputs=reader.nextLine().split("");
        //String fname="Sachin";
        // String lname="Tendulkar";
        String fname=args[0];
        String lname=args[1];
        String domain=args[2];

        //andhra Style
        String mail1=lname.charAt(0)+"."+"fname"+"@"+domain;
        //north side mail
        String mail2=fname.charAt(0)+"."+"lname"+"@"+domain;
        System.out.print(mail1+"\n");
        System.out.println(mail2+"\n");


    }
}