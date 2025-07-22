import java.util.*;
public class Hashset {
    public static void main(String[] args)
    {
        HashMap<Integer,String>roll=new HashMap<>();    //it come in ascending order
        // LinkedHashMap<Integer,String>rolls=new LinkedHashMap<>();  //will come in same order which we gave
        roll.put(1001,"amala");
        //it displays in ascending order.
        roll.put(1001,"kamala");
        roll.put(1004,"saniya");
        roll.put(1003,"sara");
        if(roll.containsValue("kamala")==false){
            roll.put(1001,"kamala");

        }
        else{
            System.out.println("mala");
        }
        System.out.println(roll.keySet());
        System.out.println(roll);
    }
    
}
//collection has list ,queue and set

