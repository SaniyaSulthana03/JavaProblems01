//public class BST {
    
import java.util.*;
//}
//combo of bst
//insert nodess
//create tree
//preorder
//post order
//n order
//min value node in tree
//max value node in tree
//bfs of the tree
//flatten a tree
//delete
//reverse
//dfs of the tree
public class BST
{
    public static void main(String args[])
     {
        ArrayList<Edge> edges=new ArrayList<>();
        // Comparator weightComperator=(e1,e2)->
        // {
        //     if(e1.weight==e2.weight )return 0;
        //     else if(e1.weight>e2.weight ) return -1;
        //     else return 0;
        // };
        edges.add(new Edge(0,1,5));
        edges.add(new Edge(0,2,3));
        edges.add(new Edge(1,2,2));
        edges.add(new Edge(1,3,6));
        edges.add(new Edge(2,3,6));
        Collections.sort(edges, new weightComparator() );
        Iterator<Edge> it=edges.iterator();
        while(it.hasNext())
         {
            Edge edge=it.next();
            System.out.println(edge.src+"  "+ edge.dst+"  "+edge.weight);
        //System.out.println("sum of X+Y: " + )
         }
        }
}
class Edge{
    public int src;
    public int dst;
    public int weight;
    Edge(int src, int dst, int weight){
        this.src = src;
        this.dst=dst;
        this.weight=weight;
    }

}
class weightComparator implements Comparator<Edge>{
    public int compare(Edge e1, Edge e2) {
        if(e1.weight==e2.weight)
        return 0;
        else if(e1.weight>e2.weight)
        return 1;
        else
        return -1;
    }
}
