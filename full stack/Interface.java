
//one class extends another class but same class cannot extends from 
//functional interface are like methods with out keywrd abstract
//its default datatype is public
//the methods with complete implementation are called default methods
interface principal{
    void computeAmount(int p,int n,double r);
}
class Accountant implements Manager{
    void computeAmount(int p,int n,double r){
        return p* Math(1+r/100),n;
    }

}
    public class main(){
        public static void main(String[] args)
        {
            Accountant a=new Accountant();
            a.computeAmount(100000,10,10);
        }


    }
}
public class Interface {
    public void method() {
        System.out.println("Interface");
    }
    
}
