class Student{
    //they conduct three test for every student
    //coding=50%,verbal=30%,aptitude=20%
    //total<cutoff(fail)
    //total>cutoff(pass)
    //given names and marks
    //print the names of selected students
    int coding,quant,verbal;
    private static double cut_off;
    private int wc,wv,wq;
    Student(int x,int y,int z){
        coding=x;verbal=y;quant=z;
        cut_off=40;
        wc=50;
        wv=30;
        wq=20;
    }
    boolean is_selected(){
        double total=(coding*wc+verbal*wv+quant*wq)/100;
        if(total>=cut_off)return true;
        else return false;
    }
    static double get_cutoff(){
        return cut_off;
    }
}
class MITS{
    public static void main(String[] args)
    {
        Student s1,s2,s3,s4;
        s1=new Student(50,50,50);
        s2=new Student(20,25,35);
        s3=new Student(30,38,42);
        s4=new Student(5,50,30);
        if(s1.is_selected()==true)
        System.out.println("s1 is selected");
        else
        System.out.println("s1 is not selected");
         if(s2.is_selected()==true)
        System.out.println("s2 is selected"); 
        else
        System.out.println("s2 is not selected");
        if(s3.is_selected()==true)
        System.out.println("s3 is selected");
        else
        System.out.println("s3 is not selected");
         if(s4.is_selected()==true)
        System.out.println("s4 is selected");
        else
        System.out.println("s4 is not selected");
    }
}





    

