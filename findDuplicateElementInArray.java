import java.util.*;
public class findDuplicateElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr[] = new int[a];
        boolean flag = false;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate: "+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("no duplicate");
        }
    }
}
