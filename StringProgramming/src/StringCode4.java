import java.util.Scanner;

//Write a program to count the total number of vowel and consonants in the given String
//vowels : a,e,i,o,u
public class StringCode4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int vowel=0;
		int cons =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||
				str.charAt(i)=='u') {
				vowel++;
			}
			else {
				cons++;
			}
		}
		System.out.println(str.length());
		System.out.println("The vowel count in the given String is : "+vowel);
		System.out.println("The consonant count in the given String is : "+cons);
	}
}
