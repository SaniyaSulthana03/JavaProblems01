import java.util.*;
public class FactorialNumber {
    public static void main(String args[])
    {
        int n=10;
        List<Integer> factorials=new ArrayList<>();
        factorials.add(1);
        factorials.add(1);
        for(int i=2;i<=n;i++)
            factorials.add(i*factorials.get(i-1));
        // f[i]=i*f[i-1];
        System.out.println(factorials);

    }
    
}
