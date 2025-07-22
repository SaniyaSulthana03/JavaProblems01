import java.util.Scanner;
public class StringsOperations {
    public static void main(String[] args) {
        String city="Hydrebad";
        char[] chars=city.toCharArray();
        chars[0]='c';
        String city1=String.valueOf(chars);
        System.out.println(city1);
    }
}
//immutable to mutable
