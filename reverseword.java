import java.util.*;
public class reverseword
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
	String[] words = str.split(" ");//gowri sankar
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
    System.out.println(reversedString);
   }
}