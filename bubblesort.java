import java.util.*;
public class bubblesort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int temp=0;
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
     
    }
    for(int i=0;i<a;i++){
        System.out.print(arr[i]+" ");
    }
}
}
