public class Employees {
    /**
     * //adding employee
     * //printing employee
     * //deleting employee
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        Node head = null;
        head = addEmployeeToList(head, 102, "saniyasul");
        addEmployeeToList(head, 101, "saniya");
        addEmployeeToList(head, 103, "saniyasu");
        addEmployeeToList(head, 104, "saniyas");
        System.out.println(head.empId + " " + head.employee);
        printAllEmployees(head);
        if (removeemployee(head, 104) == false)
            System.out.println("not found");
        else 
        {
            System.out.println(head);
        }
        printAllEmployees(head);
        sortList(head);
    }



    static Employee reverseList(Employee head){
        Employee prev=null ,curr=head;
        while(curr!=null){
            Employee next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=next;
        return head;


    }

    static void printAllEmployees(Employee head) 
    {
        Employee curr = head;
        while (curr != null) 
        {
            System.out.println(curr.empId + " " + curr.empName);
        }
        return;
    }

    static removeemployee(Employee head,int ref_id)
    {
        Employee prev=null,curr=head;
        // prev.next=curr.next;
        while(curr!=null && curr.empId!=ref_id)
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr == null)
        {
            return false;
        }
    }

    static void countEmp(Employee head) 
    {
        int count = 0;
        Employee curr = head;
        while (curr != null)
         {
            curr++;
            curr = curr.next;
        }
        return count;
        System.out.println(count);
    }


    static void sortList(Employee head)
    {
        Employee start=head;
        Employee end=null;
        boolean sorted=false;
        while(!sorted)
        {
            boolean swapped=false;
            Employee curr=start;
            while(curr!=end)
            {
                // if(curr.empId>curr.next.empId)
                if(curr.empName.compareTo(curr.next.empName)>0)
                {
                    int temp=curr.empId;                       //swapping ids
                    curr.empId=curr.next.empId;
                    curr.next.empId=temp;
                    String t=curr.empName;              //swapped name
                    curr.empName=curr.next.empName;
                    curr.next.empName=t;
                    swapped=true;
                }
                curr=curr.next;
            }
            if(!swapped)sorted=true;
        }
    }



     

    

    static boolean addEmployeeToList(Node head, int id, String name) {
        Employee employee = new Employee(id, name);
        // Employee head=null;
        // head=addEmployeeToList(head,102,"saniya");
        if (head == null) {
            head = employee;
            // return head;
        } else {
            Employee curr = head;
            while (curr.next != null) // to get last employee
            {
                curr = curr.next;
                curr.next = employee; //
            }

        }
        return head;

    }
}
