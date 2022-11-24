import java.util.*;
public class fibonacci {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int firsterm = 0;
       int secondterm = 1;
       int temp=0;
       for(int i=1;i<=a;i++){
           System.out.print(firsterm+" ");
           temp = firsterm+secondterm;
           firsterm=secondterm;
           secondterm=temp;
       }
   } 
}
