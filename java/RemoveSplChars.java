//import java.util.*;

public class RemoveSplChars {
    public static void main(String[] args) {
        // regular expression
        String str = "Saniya@12003#sanu";
        String mod_str = str.replaceAll("[a-zA-Z0-9]", " "); //only returns the special characters
        String mods_str = str.replaceAll("[^a-zA-Z0-9]", " ");// for removing special characters
        String modsss_str = str.replaceAll("[0-9]", " ");// for removing numerics
        String modss_str = str.replaceAll("[^0-9]", " ");// for removing all characters except numbers
        System.out.println(str + "\n");
        System.out.println(mod_str + "\n");
        System.out.println(mods_str + "\n");
        System.out.println(modsss_str + "\n");
        System.out.println(modss_str + "\n");
    }

}
