import java.util.*;
public class searchelementinarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        boolean flag = false;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int search = sc.nextInt();
        for(int i=0;i<a;i++){
            if(arr[i]==search){
                System.out.println("element found at position:"+i);
                flag = true;
            }
        }
        if(flag==false){
            System.out.println("no element found");
        }
    }
}
