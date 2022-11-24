import java.util.*;
class swapwithout{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 5
        int b = sc.nextInt(); // 4
         a = a+b;  // 9
         b = a-b; // 4
         a = a-b; // 5
        System.out.println(a+" "+b);
    }
}