//if root is zero then it is bft
//2)if left !=right not a bst
//3)both right and left must be bst's.
// /import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Tree {
    public static void main(String[] args){
        Node root=null;
        Trees tree=new Trees();
        root= tree.insert(root,30);
        tree.insert(root,25);
        tree.insert(root,28);
        tree.insert(root,23);
        tree.insert(root,40);
        tree.insert(root,35);
        tree.insert(root,45);
        root.left.left.left=new Node(80);
         //if subtree is available
         //left node's data>root,s data
         //return false
         //if right subtree is available
         //right node's data>root's data
         //do it recursively
         //return false
        tree.bft(root);
        System.out.println("preOrder traversal");
        tree.preOrder(root);
         System.out.println("preOrder traversal");
        tree.postOrder(root);
         System.out.println("preOrder traversal");
        tree.inOrder(root);

        System.out.println("number of nodes"+tree.count(root));
        // int key=20;
        // if(tree.is_present(root,20)==true)
        // System.out.println(key+"is present");
        //  else{
        //     System.out.println(key+"is not present");
        //  }

         System.out.println(tree.is_bst(root));


    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;

    }
}
class Trees
{
    public Node insert(Node root,int data)
    {
          if(root==null)
          root=new Node(data);
        //   (return root;
          else
          {
            if(data<root.data)
            {
                root.left=insert(root.left,data);
            }
            else
            {
               root.right=insert(root.right,data);   
            }
           // return root;
          }
          return root;
    }
    public void bft(Node root)
    {
        if(root==null)
        return;
        Queue<Node>nodes=new LinkedList<>();
        nodes.offer(root);
        while(nodes.size()!=0)
        {
            Node node=nodes.poll();
            System.out.println(node.data+"");
            if(node.left!=null)
            nodes.offer(node.left);
            if(node.right!=null)
            nodes.offer(node.left);
        }

    }
    public void inOrder(Node root)
    {
         if(root==null)return;
       
        inOrder(root.left);
         System.out.println(root.data+" ");
        inOrder(root.right);

    }
    public void preOrder(Node root){
        
        if(root==null)return;
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root){
         if(root==null)return;
       
        postOrder(root.left);
        postOrder(root.right);
         System.out.println(root.data+" ");
    }
    public int count(Node root){
        if(root==null)return 0;
        return 1+count(root.left)+count(root.right);
    }
    //is present
    public boolean is_Present(Node root,int key){
         if(root==null)return false;
      
        // boolean b1=is_present(root.left,key);
        // boolean b2=is_present(root.right,key);
          boolean b3=root.data==key;
          boolean b=b1||b2||b3;
        return b;
    }
    public boolean is_bst(Node root)
    {
        if(root==null)return true;
        //if(is_bst(root.left)==false||is_bst(root.right)==false)return false;
        //if(is_bst(tree)&&is_bst(tree.left)&&is_bst(tree.right))
        if(root.left.data > root.data) return false;
        if(root.right.data < root.data) return false;
        if(is_bst(root.left)&& is_bst(root.right))
        return true;
    }
    public int height(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        if(root.right >= root.left)
        System.out.println(tree.height);
        }
    }
    
