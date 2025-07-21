import java.util.LinkedList;
public class Node 
{
    private static Node insertNode(Node root,int data)
    {
        Node newNode = New Node(data);
        if(root==null)
            root = newNode;
        else
        {
            if(data<root.data);
            insertNode(root.left, data);
            root.right=insertNode(root.right, data);
            return root;
        }  
    }

    private static void bft(Node root)
    {
       LinkedList<Node> queue =new LinkedList<>();
       queue.add(root);
       while(queue.size()!=0)
       {
        Node curr=queue.poll();
        System.out.println(curr.data + " " );
        if(curr.left!=null)
        queue.add(curr.left);
        if(curr.right!=null)
        queue.add(curr.right);
       }
        return;
    }

    private static NOde searchNode(Node root,int target)
    {
        //exit condition
        if(root==null) return null;
        if(target==root.data) return root;
        if(target < root.insertNode(root, target))
        return searchNode(root.left,target);
       else
        Node addr=searchNode(root.right,target);
        return addr;
    }

    private static Node deleteNode(Node root,int target){
        Node parent=null,curr=root;
        while(curr.data != target && curr != null)
        {
            parent = curr;
            if(target < curr.data)
            curr=curr.left;
            else
            curr=curr.right;
        }
        //we come out of the while loop - curr is null,curr is the one having target
        if(curr==null) return null;
        //node with no kids
        if(curr.left==null && curr.right==null){
            if(curr !=root){
                if(curr==parent.left)
                parent.left=null;
                else
                parent.right=null;

            }
            else return null;
        }
        else if(curr.right!=null && curr.left !=null){
            //having both kids
            //goto curr.right finding the min value node and copy the value at the root
            Node replacer=minValueNode(curr.right);
            int temp=replacer.data;
            deleteNode(root,replacer.data);
            curr.data=temp;
        }
        else{
            //one kid
            Node kid=curr.left!=null ?root.left :root.right;
            if(curr!=root){
                if(curr==parent.left)
                parent.left=kid;
                else
                parent.right=kid;
            }
            else{
                root=kid;
            }
        }
        return root;
    }

    private static Node maxValueNode(Node root){
        Node curr=root;
        while(curr.right != null){
            curr=curr.right;
        return curr;
    }
    }

    private static Node minValueNode(Node root){
        Node curr=root;
        while(curr.left != null){
            curr=curr.left;
        return curr;
    }

    private static void inOrder(Node root)
    {
        if(root==null) return;
        inOrdeer(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);

    }

    private static Node flatten(Node root){
        //no node or one node is exit condition for flatten
        if(root==null || root.left == null && root.right == null) 
        return null;
        if(root.left == null && root.right == null) return root;
        if(root.left!=null)
        {
            flatten(root.left);
            Node temp=root.right;
            root.right=root.left;
            root.left=null;
            //goto end of  right sub tree
            Node curr=root;
            while(curr.right != null)
            {
                curr=curr.right;
                curr=temp;
            }
            flatten(root.right)
    }
]

    public static void main(String[] args)      
    {
        Node root=null;
        root=insertNode(root, 120);
        insertNode(root,100);
        insertNode(root,115);
        insertNode(root,135);
        insertNode(root,118);
        insertNode(root,123);
        bft(root);
        Node addr=searchNode(root,105);
        if(addr==null)
        System.out.println("not found");
        else
        System.out.println(addr+" "+addr.data);
        deleteNode(root,105);
        bft(root);
        inOrder(root);
        flatten(root);

    }
    
    
}
 