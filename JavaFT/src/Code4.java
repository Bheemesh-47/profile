import java.util.Scanner;

/*
 * Given the following 
 * input	: madam
 * Output	: Given String is a palindrome
 */

public class Code4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		String str1="";
		
		/*
	   	 i		
	 	 0	1	2	3	4
	str	 m	a	d	a	m
		 
	str1 m	a 	d	a	m
		 
		 */
		
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		
		if(str.equals(str1)==true) {
			System.out.println("Given String is a palindrome");
		}
		else {
			System.out.println("Given String is not a palindrome");
		}
		
	}
}
