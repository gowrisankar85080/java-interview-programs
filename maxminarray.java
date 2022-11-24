import java.util.*;
class maxminarray{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = input.nextInt();
        }
        int maxValue = array[0];
        for (int i = 0; i < n; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("max:"+maxValue);
        int minValue = array[0];
        for (int i = 0; i <n; i++){
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("min:"+minValue);
    }
}