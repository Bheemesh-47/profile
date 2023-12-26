import java.util.Scanner;

//Write a program to replace all the vowels with a special character
//input : aeiou
//output: @#$%*

//Write a program to segregate the alphabets, numerics and the special characters into a separate string
//input : ABC123DEF#$%^&12345#$%^&
//output: ABCDEF
//		  12312345
//		  #$%^&#$%^&
public class StringCode5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String str = sc.nextLine();
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||
				str.charAt(i)=='u'||
				str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' ||
				str.charAt(i)=='U')
			{
				str2 = str2 + "@";
			}
			else {
				str2=str2 + str.charAt(i);
			}
		}
		System.out.println(str2);
	}
}
