import java.util.*;
public class stack {
    public static void main(String[] args)
    {
        Stack<String> names = new Stack<>();
        names.push("sachin");
        names.push("saniya");
        names.push("showkath");
        names.push("shabana");
        if(! names.isEmpty()){
            names.pop();
        }
        System.out.println(names.peek());
        System.out.println(names.search("sachin"));
        System.out.println(names.search("shifa"));   
    }  
}
