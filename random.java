import java.util.*;
public class random {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random a = new Random();
    int b = a.nextInt(100);
    System.out.println(b);
    double c = a.nextDouble(1000);
    System.out.println(c);
    int mm = (int)(Math.random()*100);
    System.out.println(mm);
}
}