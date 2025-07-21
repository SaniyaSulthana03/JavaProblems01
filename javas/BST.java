public class BST {
    public static void main(String[] args)
    {
        Node root=null;    //no tree at all
        root=addNodeToTree(root,50);
        system.out.println(root+root.left+root.right+root.data);
    }

     static addNodeToTree(Node root,int data){
        Node newNode=new Node(data);
        if(root==null)
            node=newNode;
        return root;
     }
    
}
