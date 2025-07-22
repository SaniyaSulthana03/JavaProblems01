//interface extends interface where class implements interface,class extends class
//interface-abstract method static method
//abstract class contains both abstract and non abstract class
//write a java program for implementing interface


//exception handling
// 1)standard exception
// 2)userdefined exception
public class RulesofInheritance{
    public static void main(String[] args)
    {
        int a=10;
        int b=0;
        try
        {
            return a/b;
            
        }
        System.out.println(c);
        
        catch(Exception e)
        {
            System.out.printf("some error occurred"+e);
        }
        finally{
            if(b!=0)
            System.out.println(a/b);
            else{
                System.out.println("division by zero");

            }
        }
    }

}
//the class of user defined exception will inherit from exception class and it uses exception classes constructor 
class AgeLimitException extends Exception{
    AgeLimitException(String message)
    {
        //this.message=message;
        super(message);
        
    }
}
public class Test{
    public static void main(String[] args)
    {
        int age=15;
        try{
            check(age);
            
        }

        catch(AgeLimitException e)
        {
            System.out.println(AgeLimitException);
        }
        finally{
            System.out.println("crisis managed")
        }
    }
    public static void check(int age)
    {
        if(age<18)
        throw new AgeLimitException("below 18 years is not allowed");
        else{
            System.out.println("allowed");
        }

    }
}