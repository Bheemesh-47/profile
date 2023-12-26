import java.util.Scanner;

public class AdvProgrammig1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of production house:");
		int prod = sc.nextInt();
		System.out.println("Enter the count of Languages in which moives will be produced by the production house:");
		int lang = sc.nextInt();
		System.out.println("Enter the count of movies prodcued in each languages by the production house:");
		int mov = sc.nextInt();
		
		long arr[][][] = new long[prod][lang][mov];
		long arr1[] = new long[prod];
		
		
		for(int i=0;i<arr.length;i++) {
			long rev = 0;
			System.out.println("inside production house no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("language no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the revenue of movie no: "+(k+1));
					arr[i][j][k]=sc.nextLong();
					rev = rev + arr[i][j][k];
				}
			}
			arr1[i]=rev;
			
		}
		System.out.println("=================================================");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside production house no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("language no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the revenue of movie no: "+(k+1)+" is : "+arr[i][j][k]);
				}
			}
		}
		System.out.println("=================================================");
		long overall_investment = 2000000000 * prod;
		System.out.println("The overall investment by Akash is: "+(overall_investment));
		System.out.println("=================================================");
		long overall_revenue=0;
		System.out.println("Revenue made by each production unit is as follows: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Revenue made by unit no: "+(i+1)+" is = "+arr1[i]);
			overall_revenue = overall_revenue + arr1[i];
			
		}
		System.out.println("=================================================");
		System.out.println("The overall revenue made by the movies is: "+(overall_revenue));
		System.out.println("=================================================");
		
		double expected_profit_revenue = overall_investment + (overall_investment * 0.5);
		if(expected_profit_revenue < overall_revenue) {
			System.out.println("Akash has made the profit in 2023. which is more than 50%");
		}
		else {
			System.out.println("Akash not has made the profit in 2023. which is more than 50%");
		}
		
	}
}
