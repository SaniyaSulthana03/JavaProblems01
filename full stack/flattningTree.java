public class flattningTree {
     public static void main(String[] args)
     {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        flatten(root);
        System.out.println(root);
     }
     public void flatten(Node root){
    if(root==null)return;
    if(root.left==null &&root.right==null)
    return;
    if(root.left!=null){
    flatten(root.left);
    Node temp=root.right;
    root.right=root.left;
    root.left=null;
    }

    curr=root.right;
    while(curr.right!=null)
    curr=curr.right;

    curr=temp;

}
public void reverse{
     if(root==null)return;
     reverse(root.left);
     reverse(root.right);
     Node temp=root.left;
     root.left=root.right;
     root.right=temp;
} 
}

//store address 
//reverse left subtee
//reverse right subtree
//swap lst with rst data 
//print inorder to see the result.