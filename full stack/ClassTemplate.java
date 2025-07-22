class Test<T>
{
    T t1,t2;
    Test(T a,Tb)
    {
        t1=a;
        t2=b;
    }
    public void add(){
        if(t1 instanceof Integer && t2 instanceof Integer){
            int x=t1;
            int y=t2;
            int z=t1+t2;
            System.out.println
        }
    }
}
public class ClassTemplate {
    public static void main(String[] args)
    {
        //   Test <Integer> integerTest=new Test<>(10);
        //   integerTest.print();
        Test <Integer> intadd=new Test<>(10);
        intadd.print();
          Test <String> StringTest=new Test<>("MITS");
          StringTest.print();

          Test <Double> DoubleTest=new Test<>(10.24);
          DoubleTest.print();
    }
}
class Test<T>
{
     public T thingToPrint;
     Test(T x){
        thingToPrint = x;
    }
    public void print(){
        System.out.println(thingToPrint);
    }

    

     T t1,t2;
  Test(T a,T b);
  {
    t1=a;
    t2=b;
  }
   public void add()
   {
    System.out.println(t1+" "+t2);
   }
}




public class Test{
    public static void main(String[] args){
        int p=20;
        Integer x=p;   //auto boxing
        int y=x;    //auto unboxing
        System.out.println(y);
    }
}