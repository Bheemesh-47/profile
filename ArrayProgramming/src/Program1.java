import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Students: ");
		int n = sc.nextInt();
		
		//Creating Array
		String a[] = new String[n];
		int n1 = a.length;
		System.out.println(n);
		System.out.println(n1);
		
		//Collecting Data
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of Student no: "+(i+1));
			a[i] = sc.next();
		}
		
		//Fetching Data
		for(int i=0;i<n;i++) {
			System.out.println("The name of Student no : "+(i+1)+" is: "+(a[i]));
		}
	}
}
