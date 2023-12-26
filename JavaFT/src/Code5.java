import java.util.Scanner;

/*
 * input	: He#$%%^ll&&&&o Goo^^%$$##d Mo$%^&rn$%^&ing Wel&*(co*&%$#me o%n bo$%^&ar#$%^d
 * Output	: HelloGoodMorningWelcomeonbaord
 * 			  #$%%^ll&&&&^^%$$##$%^&$%^&&*(*&%$#%$%^&#$%^
 */
public class Code5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String str = sc.nextLine();
		String str1="";
		String str2="";
		
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || 
					(str.charAt(i)>='A' && str.charAt(i)<='Z')) {
				str1 = str1 + str.charAt(i);
			}
			else {
				str2=str2+str.charAt(i);
			}
		}
		System.out.println("Character String is = "+str1);
		System.out.println("Symbols String is = "+str2);
	}
}
