import java.util.*;
import java.lang.*;
public class countsamecharinstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();//java 
        char letter = sc.next().charAt(0);// a
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
       System.out.println(count);
    }
}
