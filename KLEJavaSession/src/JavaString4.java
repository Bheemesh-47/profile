import java.util.Scanner;

public class JavaString4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		int alp_cnt=0;
		int num_cnt=0;
		int spl_cnt=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || 
					(s.charAt(i)>='A' && s.charAt(i)<='Z')) {
				alp_cnt++;
			}
			else if((s.charAt(i)>='0' && s.charAt(i)<='9')) {
				num_cnt++;
			}
			else {
				spl_cnt++;
			}
		}
		System.out.println("Alphabets count= "+alp_cnt);
		System.out.println("Numbers count= "+num_cnt);
		System.out.println("Special Character count= "+spl_cnt);
	}
}
