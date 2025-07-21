
//if the object is not determine for some time then the object will be deleted the system will automatically deketed such kind of mechanism we call it as garbage removal .
//sorting linked list
//reversing linkedlist
import java.io.*;
import java.util.*;

public class Nonrecursivell {
    public static void main(String[] args)
    {
        addAtEnd(x,b);
        traverse(x);
        int n=count(x);
        System.out.println(n);a
        Point start=a;
        traverse(start);
        deleteLastPoint(start);
        start=pop(start);
        deleteFirstPoint(start);
        start=pop(start);
        start=addAtBeginning(start,f);
        traverse(start);
    }

    Point p1 = new Point(10, 20);
    Point p2 = new Point(20, 30);
    Point p3 = new Point(30, 40);
    Point p4 = new Point(40, 50);
    Point p5 = new Point(50, 60);
    Point p6 = new Point(60, 70);p1.next=p2;p2.next=p3;p3.next=p4;p4.next=p5;p5.next=p6;
    // System.out.println(p1);
    // System.out.println(p1+" "+p1.x+","+p1.y+ " "+p1.next);
    // System.out.println(p2+" "+p2.x+","+p2.y+ " "+p2.next);
    // System.out.println(p3+" "+p3.x+","+p3.y+ " "+p3.next);
    // System.out.println(p4+" "+p4.x+","+p4.y+ " "+p4.next);

    static void traverse(Point start) {
        Point curr = start;
        while (curr.next != null) {
            System.out.println(curr + " " + curr.x + "," + curr.y + " " + curr.next);
            curr = curr.next;
        }
        return;
    }

    static Point addAtEnd(Point start, Point newPoint) {
        Point curr;
        curr = start;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newPoint;
        // return;
    }

    static Point addAtBeginning(Point top, Point newPoint) {
        newPoint.next = top;
        top = newPoint;
        return top;

    }

    static int count(Point head) {
        Point curr = head;
        int n = 0;
        while (curr != null) {
            n = n + 1;
            curr = curr.next;
        }
        return n;
    }

    static void deleteLastPoint(Point start) {
        Point prev, curr;
        prev = null;
        curr = start;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return;

    }

    static Point deleteFirstPoint(Point start) {
        start = start.next;
        return start;

    }

    static Point insertinMiddle() {

    }

    static Point deketeInMiddel() {

    }

    static Point insertAfterPoint() {

    }

    static Point insertBeforePoint() {
    }
}

class Point {
    int x, y, z, a, b;
    Point next;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        // this.z = z;
        // this.a = a;
        // this.b = b;
        next = null;
    }
}
