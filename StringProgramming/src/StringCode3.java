import java.util.Scanner;

//Write a program to reverse the string and check if it is a palindrome or not
//input : MOM
//output: It is a palindrome
public class StringCode3 {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = "";
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println(str2);
		if(str1.equals(str2)==true) {
			System.out.println("The Given String is a Palindrome");
		}
		else {
			System.out.println("The Given String is not a Palindrome");
		}
	}
}
