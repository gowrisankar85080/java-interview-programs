import java.util.*;
class checkvowel{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char b = sc.next().charAt(0);
        if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' ){
            System.out.println("vowel");
        }
        else{
            System.out.println("not a vowel");
        }
    }
}