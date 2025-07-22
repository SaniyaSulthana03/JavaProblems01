import java.util.Scanner;
public class overRiding {
    public static void main(String[] args) {
        father ramaiah=new father();
        ramaiah.calci();
        child bunty=new child();
        bunty.calci();
        //ramaiah.computer();
        //father f=new father();   //only access to calaci
        //child c=new child();     //it access both calci and computer
        //over riding and run time polymorphism
    } 

    
}
class father{
    public void calci(){
        System.out.println("addition\n subtraction\n multiplication\n division");
    }
}
class child extends father
{
    public void calci()
    {
        System.out.println("addition\n subtraction\n multiplication\n division\n modulo\n floor\n trignometry");
    }
    public void computer()
    {
        System.out.println("does all mathematical operations");
    }
}

