import java.util.*;
public class Passwords {
    public static void main(String[] args)
    {
       String pwd="Saniya@123";
       if(is_pwd(pwd)==true)
       System.out.print("valid");
       else
       System.out.println("not valid");
    }
    static boolean is_pwd(String pwd){
        int n=pwd.length();
        char[] ch=pwd.toCharArray();
        if(n<6||n>20)
        return false;
        int nu=0,nd=0,nl=0;
        for(int i=0;i<n;i++){
            if(ch[i]!='_' && ch[i]!='.' && ch[i]!='@')
            return false;
            if(Character.isUpperCase(ch[i]))nu++;
            if(Character.isLowerCase(ch[i]))nl++;
            if(Character.isDigit(ch[i]))nd++;
        
        }
        if(nu<1||nl<1||nd<1)
        return false;
        else
        return true;
        for(int i=0;i<n;i++)
        {
            if(!Character.isAlphabetic(ch[i]) && !Character.isDigit(ch[i]))
            {
                if(ch[i] =='.'||ch[i] =='_'||ch[i]=='@')
                return true;
                else
                return false;
            }
            else
            return false;
        }
        return true;
    }
}
