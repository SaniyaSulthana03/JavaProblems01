import java.util.Scanner;
public class Constructor {
    public int id;
    public String name;
    public String branch;
    Constructor(int id, String name, String branch)
    {
        this.id=id;
        this.name=name;
        this.branch=branch;
    }
    // public int cseStudents{
        

     

    public static void main(String[] args){
        Constructor[] cs;
        Constructor cs[]=new Constructor[5];
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<5;i++){
            cs[i]=new Constructor(sc.nextInt(),sc.next(),sc.next());
             cs[i]=new Constructor(id,name,branch);
        }
        Constructor cs[i]=new Constructor(int id , String name,branch);
         for(int i=0;i<5;i++){
            System.out.println("%4d  + %10s + %5s");
            this.id=id;
            this.name=name;
            this.branch=branch;
            System.out.println("%4d  + %10s + %5s");
         }

    
    }
    
}
