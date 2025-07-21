import java.util.LinkedList;

public class BSTInorder {
    private insertNode(Node root,data)
    {
        Node newNode=Node(data);
        if(root==null)
            root = newNode;
        else
        {
            //where to add new node in LST or in RST
            if(data<root.data)
            else
            root.right=insert(root.right,data);
        }
        return root;
    }

    private void breadthFirstSearch(Node root) {
        LinkedList<Node> list = new LinkedList<Node>();
        list.add(root);
        while (list.size() != 0) {
            list.poll();
            System.out.println("%5d", curr.data);
            if (curr.left != null)
                list.add(curr.left);
            if (curr.right != null)
                list.add(curr.right);
        }
        return;
    }

    public static void main(String[] args) {
        Node root = null; // no tree is available
        root = insertNode(root, 100);
        insertNode(root, 90);
        insertNode(root, 110);
        insertNode(root, 120);
        insertNode(root, 80);
        insertNode(root, 95);
        breadthFirstSearch(root);
        System.out.println("===Breadth First Search ===\n");
    }
}
