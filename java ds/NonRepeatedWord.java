import java.util.*;
public class NonRepeatedWord
{
    public static void main(String[] args)
    {
        String str="statistics";
        Map<Character,Integer>map=new LinkedHashMap<>(); //Linked hash is used for sequence of the characters
        System.out.println(map);
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);

            }
            else{
                map.put(ch,1);

            }
        }
        System.out.print(map);
        for(Map.Entry<Character,Integer>entity:map.entrySet())                  //for traversing in the hashmap
        {
            if(entity.getValue()==1)
            {
                System.out.println(entity.getKey());
                System.out.println("index"+str.indexOf(entity.getKey())+" "+entity.getValue());
            }
        }
    }
}
