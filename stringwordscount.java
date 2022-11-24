import java.util.*;
public class stringwordscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int count = 1;
        for(int i=0;i<words.length()-1;i++){
            if((words.charAt(i)==' ') && (words.charAt(i+1)!=' ')){
               count++;
            }
        }
System.out.println("number of words:"+count);
    }
}
