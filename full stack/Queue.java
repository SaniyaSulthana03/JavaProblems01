import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.util.PriorityQueue;
public class Queue {
    public static void main(String[] args)
    {
        Queue<Integer> persons=new PriorityQueue<>();
        persons.offer(new Person("saniya",10000));
        persons.offer(new Person("saniy",20000));
        persons.offer(new Person("sani",50000));
        persons.offer(new Person("san",40000));
        persons.offer(new Person("sa",80000));
        long sal=persons.poll().name;
        System.out.println(persons.peek().name);
        System.out.println("removed from queue is:"+persons.peek().name);
        persons.offerlast();
        persons.offerfirst();
        persons.pollfirst();
        persons.polllast();
    }
}
class Person{
    public String name;
    public long time;
    Person(String a,long b)
    {
        name=a;
        time=b;
    }

}
//Linkedlist class queue methods of queue in java.
//queue methods
//1)offer
//2)poll