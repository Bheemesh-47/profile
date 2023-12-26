import java.util.Scanner;

/*
 *  Organization Company	Employee
 *   	0		    0			3
 *     	1			0			4
 *     				1			5
 *     
 *  Write a code to collect the names of employees from each company
 * 
 * 2 entities ----> 2 loops ----> 2 [] ----> 2-Dimensional Array
 */
public class ArraysCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number of organizations: ");
		int a = sc.nextInt();//5

		System.out.println("Enter to number of companies in each organization: ");
		int m = sc.nextInt();//5

		System.out.println("Enter to number of employees in each company of each organization: ");
		int n = sc.nextInt();//5

		String arr[][][] = new String[a][m][n];//---> 3-D

		//Storing the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside organization no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) //companies
			{
				System.out.println("Inside company no: "+(j+1));

				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of employee no:"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
			/*
			 * arr[0][0][0]=Rohit
			 * arr[0][0][1]=Gill
			 * arr[0][0][2]=Virat
			 * arr[0][1][0]=Rohit
			 * arr[0][1][1]=Gill
			 * arr[0][1][2]=Virat
			 * 
			 * arr[1][0][0]=Rohit
			 * arr[1][0][1]=Gill
			 * arr[1][0][2]=Virat
			 * arr[1][1][0]=Rohit
			 * arr[1][1][1]=Gill
			 * arr[1][1][2]=Virat
			 */
		}
		//Fetching the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside organization no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) //companies
			{
				System.out.println("Inside company no: "+(j+1));

				for(int k=0;k<arr[i][j].length;k++) {

					System.out.println("the name of the Employee no: "+(k+1)+" is = "+arr[i][j][k]);
				}
			}
		}
	}
}