import java.util.*;
class countoddevendigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = 0;
        int count = 0;
        int count1=0;
        while(a>0){
            b=a%10;
            if(b%2==0){
                count++;
            }
            else{
                count1++;
            }
            a=a/10;
        }
        System.out.println(count+" "+count1);
    }
}