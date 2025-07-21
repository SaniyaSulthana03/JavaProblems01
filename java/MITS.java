public class MITS {
    //public class MITS{
        public static void main(String[] args)
        {
            Student s1,s2,s3,s4;
            s1=new Student(30,35,40);
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
    
    

