
//abstract class itself cannot be instantiate or cannot make object of it
//abstract methods are without any body
public class abstractclass {
    public static void main(String[] args)
    {
        int x=3;
        // Principal xyz=new principal();
        professor prof=new professor();
    }

    
}
abstract class Principal{
    abstract void teach()
    {
        // System.out.println("---");
    }
}
class professor extends Principal
{
    public void research()
    {
       System.out.println("---");
    }
      public void coCuriculum()
    {
      System.out.println("$$$$");  
    }
}