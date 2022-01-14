package week3.day2;
import java.util.Arrays;

public class Anagram {

public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
if (text1.length()!=text2.length()) {
	System.out.println("both string is not equal so its not anagram");
}
else
{
	char []a=text1.toCharArray();
	char []b=text2.toCharArray();
	 Arrays.sort(a);
	 Arrays.sort(b);
	 if(Arrays.equals(a,b)==true)
	 {
		 System.out.println("string is anagram");
	 }
	 else
	 {
		 System.out.println("string is not anagram");
	 }
}
}
}