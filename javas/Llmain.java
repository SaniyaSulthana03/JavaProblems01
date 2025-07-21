// create a linked list of 4 lines and each point consistes of 3 members
//create a class point
//object name is nothing but the address of the object
//to initialize parameters of objects when it is being created ==>purpose of constructor
// method->by defsault it is public but havig same name as class name
import java.io.*;
import java.util.*;
public class Llmain {
    public static void main(String[] args){
    
        Point p1=new Point(10,20);
        Point p2=new Point(20,30);
        Point p3=new Point(30,40);
        Point p4=new Point(40,50);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        System.out.println(p1);
        System.out.println(p1+" "+p1.x+","+p1.y+ " "+p1.next);
        System.out.println(p2+" "+p2.x+","+p2.y+ " "+p2.next);
        System.out.println(p3+" "+p3.x+","+p3.y+ " "+p3.next);
        System.out.println(p4+" "+p4.x+","+p4.y+ " "+p4.next);

    }  
}
class Point{
    int x, y,z;
    Point next;
    Point(int x,int y){
        this.x=x;
        this.y=y;
        this.z=z;
        next=null;
    }
}




//another program
 
// class Point{                      //blue print,mould,template
//     int x, y,z;
//     Point next=null;
//     Point(int x,int y,int z){
//         this.x=x;
//         this.y=y;
//         this.z=z;
//         next=null;
        
//     }

// }
// class Llmain{
//     public static void main(String[] args){
//         Point a=new Point(10,20,30);
//         Point b=new Point(20,20,40);
//         Point c=new Point(20,20,40);
//         a.next=b;
//         b.next=c;
//         // System.out.println(a +" "+a.x+" "+b+" "+b.x +" "+c+" "+c.x);
//         System.out.println(a +" "+a.x+" "+a.next);
//         System.out.println(b +" "+b.x+" "+b.next);
//         System.out.println(c +" "+c.x+" "+c.next);
        

//     }
// }
