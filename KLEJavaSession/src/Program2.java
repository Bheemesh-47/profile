import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j<=(3*n)/4 || i==(3*n)/4 && j<=(3*n)/4 || j==0 && i<=(3*n)/4 
						|| j==(3*n)/4 && i<=(3*n)/4 ||  i==j && i>=n/2) {
					System.out.print("$ ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("   ");

			for(int j=0;j<n;j++) {
				if(i==0 && j<n-1 || i==(n/2) && j<n-1 || i==(n-1) && j<n-1 || j==0 ||
						j==(n-1) && i!=0 && i!=(n/2) && i!=(n-1)) {
					System.out.print("$ ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}
