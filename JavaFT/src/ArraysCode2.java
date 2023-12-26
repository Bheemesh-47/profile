import java.util.Scanner;

/*
 *  Company		Employee
 *     0			1
 *     1			2
 *     2			3
 *     3			4
 *     
 *  Write a code to collect the names of employees from each company
 * 
 * 2 entities ----> 2 loops ----> 2 [] ----> 2-Dimensional Array
 */
public class ArraysCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to number of companies: ");
		int m = sc.nextInt();//5

		//jagged array
		String arr[][] = new String[m][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter to number of employees company no: "+(i+1));
			arr[i]=new String[sc.nextInt()];//5
		}

		//Storing the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside company no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of employee no:"+(j+1));
				arr[i][j]=sc.next();
			}
			/*
			 * arr[0][0]=Rohit
			 * arr[0][1]=Gill
			 * arr[0][2]=Virat
			 * -----------------
			 * arr[1][0]=Surya
			 * arr[1][1]=MSD
			 * arr[1][2]=Raina
			 * -----------------
			 * arr[2][0]=Rahul
			 * arr[2][1]=Kaif
			 * arr[2][2]=Yuvraj
			 * -----------------
			 * arr[3][0]=Sachin
			 * arr[3][1]=Laxman
			 * arr[3][2]=Balaji
			 */
		}
		//Fetching the data
		for(int i=0;i<arr.length;i++) //companies
		{
			System.out.println("Inside company no: "+(i+1));

			for(int j=0;j<arr[i].length;j++) {

				System.out.println("the name of the Employee no: "+(j+1)+" is = "+arr[i][j]);
			}
		}
	}
}