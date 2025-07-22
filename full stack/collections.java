 //built in datastructures in java 
 //it is an interface
 //collections extends list implements arrayList,LinkedList and stack
 //colections extends queue implements LinkedList,priority queue and dequeue
 //collections extends set implements treeset,hashset,linkedhashset.
 //map interface like dictionary in python
 //map interface implements hashmap,linkedhashmap and treemap
 //comparator is an interface
 //iterator is a class
 //list interface has some basic methods
 //arraylist implements all methods of list interface and many others
 //List obj=new LinkedList()
 //List obj=new ArrayList()

 import java.util.List;
 import java.util.ArrayList;
 import java.util.Comparator;
 import java.util.Iterator;
 class Student{
    public String name;
    public int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
 }
 
 public class collections {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        ArrayList<String> result = new ArrayList<>();
        list.add(new Student("saniya",19));
        list.add(new Student("sulthana",20));
        list.add(new Student("sulthana",22));
        list.add(new Student("sulthana",19));
        int n=list.size();
        System.out.println(n);
        //int n=list.size();
        for(Student s:list) {
            if (result .contains(s.name)==false)
            result.add(s.name);
        }
        System.out.println(result);
        // if(s.age <=18)
        // for(Student s:list){
        //     Student s;
        //     for(int i=0;i<n;i++){
        //         System.out.println(list.get(i).name+" "+list.get(i));
        //    // System.out.println(s);
        //     System.out.println(s.name+""+s.age+" ");
        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            Student s=it.next();
            System.out.println(s.name.toUpperCase()+""+s.age+" ");
        }
        }

    }

    
 