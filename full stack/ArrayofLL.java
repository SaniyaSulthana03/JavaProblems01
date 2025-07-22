import java.util.*;
public class ArrayofLL
 {
    public static void main(String[] args)
    {

    }
    
}
List obj=new LinkedList();
class Graph
{
    public int v;
    LinkedList<Integer>[] array;
    Graph (int n)
    {
        v=n;
        array=new LinkedList<Integer>[n];
        for(int i=0;i<n;i++)
        array[i]=new LinkedList<>();

    }
}