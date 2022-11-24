import java.util.*;
public class oddevenfromarray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int count = 0;
        int count1 = 0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("even");
        for(int i=0;i<a;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\nodd");
        for(int i=0;i<a;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}
