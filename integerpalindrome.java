import java.util.*;
class integerpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int rev = 0;
        while(a!=0){
            int rem = a%10;
            rev = rev*10+rem;
            a = a/10;
        }
        if(b==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}