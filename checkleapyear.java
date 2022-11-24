import java.util.*;
public class checkleapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = false;
        if(year%4==0){
            isLeapYear=true;
        }
        else if(year%400==0){
            isLeapYear=true;
        }
        else if(year%100==0){
            isLeapYear=false;
        }
        else{
            isLeapYear=true;
        }
        if(isLeapYear){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
