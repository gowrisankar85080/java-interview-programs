import java.util.*;
public class removewhitespaces {
    public static void main(String[] args){
        String str = " java programming aluminium     coal";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
