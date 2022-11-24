import java.util.*;
class lettercount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c=0;
        for(char alpha='a';alpha<='z';alpha++){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==alpha){
                    c++;
                }
            }
        
            if(c>0){
                System.out.println(alpha+"="+c);
                c=0;
                   
            }
}
    }
} 