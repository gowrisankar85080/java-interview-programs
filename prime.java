import java.util.*;
public class prime {
    static boolean isPrime(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i=2;count<a;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        sc.close();
    }
}
