import java.util.*;
public class checkarmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num1 = Integer.toString(num);
        int len = num1.length();
        int rev=0;
        int temp = num;
        int sum = 0;
        while(num!=0){
         rev = num%10;
         sum+=Math.pow(rev,len);
         num=num/10;
        }
        if(sum==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
