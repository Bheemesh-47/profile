
public class JavaString6 {
	public static void main(String[] args) {
		String s1 = "Hi Good morning to all";
		System.out.println(s1);
		s1=s1.trim();
		int sp = 0;
		String s2 ="";
		System.out.println(s1);
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
				sp++;
			}
		}
		System.out.println("Word count is = "+(sp+1));
		
		String arr[] = new String[sp+1];
		int temp=0;
		
		for(int i=s1.length()-1;i>=0;i--) {
			if(s1.charAt(i)==' ') {
				arr[temp]=s2;
				temp++;
				s2="";
			}
			else {
				s2=s2+s1.charAt(i);
			}
		}
		arr[temp]=s2;
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+' ');
		}
	}
}
