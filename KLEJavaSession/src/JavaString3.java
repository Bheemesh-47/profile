import java.util.Scanner;

public class JavaString3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		String s1 = "";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='A') {
				s1 = s1 + '@';
			}
			else if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				s1 = s1 + '#';
			}
			else if(s.charAt(i)=='i'||s.charAt(i)=='I') {
				s1 = s1 + '$';
			}
			else if(s.charAt(i)=='o'||s.charAt(i)=='O') {
				s1 = s1 + '%';
			}
			else if(s.charAt(i)=='u'||s.charAt(i)=='U') {
				s1 = s1 + '*';
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println("The replaced String is : "+s1);
	}
}
