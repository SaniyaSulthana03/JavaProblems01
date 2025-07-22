public class LinkedList {
    public static void main(String[] args)
     {
        Node head=null;
        head=Node.insertNodeAtEnd(head,100);
        Node.insertNodeAtEnd(head,200);
                System.out.println(head+""+head.data+  ""+ head.next);
                System.out.println("head.next.data: " + head.next.next);
                Node.insertNodeAtEnd(head, 300);
                head= Node.insertNodeAtBeg(head, 25);
                Node.displayList(head);
                int n=Node.count(head);
                System.out.println("number of nodes: " + n);
                head=Node.insertNodeAtBeg(head, 50);
                Node.insertNodeAtBeg(head,250);
                if(Node.is_present(head, 50)==true)
                System.out.println("present");
                else{
                    System.out.println("not present");
                }
                Node.sort(head);
                Node.displayList(head);
                System.out.println("After delete");
                
                Node.Delete(head,200);


    }
}
//insert node at beginning
//insert node at end
//insert node at beginning
//insert node at a given position
//insert node at a given position
class Node 
{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next=null;
    }
    public static Node createNode(int data) {
          Node newNode =new Node(data);
          return newNode;
    }
     public static Node insertNodeAtBeg(Node head,int data){
        if(head ==null)
        head=createNode(data);
        else{
           
            Node newNode=createNode(data);
             newNode.next= head;
            head=newNode;

        }
        return head;
        
     }
   public static Node insertNodeAtEnd(Node head,int data){
    if(head==null)
    head=createNode(data);
    else{
        Node curr=head;
        while(curr.next!=null){   //if it is not the last node go to next node
            curr=curr.next;
        }
        curr.next=createNode(data);
    }
    return head;
 }
 public static void displayList(Node head){
    Node curr=head;
    while(curr!=null){
        System.out.println(curr+""+curr.data+""+curr.next);
        curr=curr.next;
    }
 }
 public static int count(Node head)
 {
    Node curr=head;
    int n=0;   //number of nodes are 0 if current is not null then increment n and then return n
    while(curr!=null)
    {
        n++;
        curr=curr.next;
    }
    return n;
}
public static void sort(Node head)
{
    // Node curr=head;
    // Node prev=null;
    // while(curr!=null)
    // {
    //     while(curr.next!=null && curr.next.data<curr.data)
    //     {
    //         int temp=curr.data;
    //         curr.data=curr.next.data;
    //         curr.next.data=temp;
    //         curr=curr.next;
    //     }
    //     if(curr.next==null)
    //     break;
    //     prev=curr;
    //     curr=curr.next;
    // }
    // if(prev!=null)
    // prev.next=null;
    Node curr=head;
    while(curr.next!=null)
    {
        Node successor=curr.next;
        while(successor!=null)
        {
            if(curr.data>successor.data){
                int t=curr.data;
                curr.data=successor.data;
                successor.data=t;
            }
            curr=successor;
            successor=curr.next;

        }
    }
    //fo(i=0;i<n-1;i++)
    //for(i+1;i<n;i++)
    
    
}
     public static boolean is_present(Node head,int key)
     {
        // Node curr=head;
        // while(curr!=null){
        //     if(curr.data==key)
        //         return true;
        //     curr=curr.next;
        // }
        // return false;
        // if(head==null)
        // return false;
        boolean found=false;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data==key)
            
                //found=true;
                 return true;
                curr=curr.next;
                return false;

            
            
        }
        return found;
    
     } 
     public static Node Delete(Node head,int key)
     {
        if(head==null ) 
        return null;
        if(head.data==key)
        head=head.next;
        else{
            Node prev=head;
            Node curr=prev.next;
            while(curr!=null)
            {
                if(curr.data==key)
                prev.next=curr.next;

                prev=curr;
                curr=curr.next;


                
            }
        }
         return head;

     }
     

}
//insert node after the key
//insert the node before the key