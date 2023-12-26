import java.util.Arrays;
import java.util.Scanner;

public class JavaString5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String-1: ");
		String s1 = sc.next();
		System.out.println("Enter the String-2: ");
		String s2 = sc.next();
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}
}
