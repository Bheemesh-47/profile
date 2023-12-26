import java.util.Scanner;

/*	   i		   j			k
 * 	College		 Class		Student
 * 	   0		   0		    2
 * 				   1			2
 * 	   1		   0			2
 * 				   1			2
 * 	   2		   0			2
 * 				   1			2
 * 
 * total number of entities : 3
 * number of dimensions 	: 3D
 * number square brackets	: 3
 * number of loops			: 3
 * 
 * First Entity				: College	---> outer most
 * Second Entity			: Class		---> intermediate
 * Third Entity				: Student	---> inner most
 * 
 * Collect the marks of each student in the subject named Java.
 * 
 */
public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Colleges: ");
		int col = sc.nextInt();
		System.out.println("Enter the total number of Classes in each College: ");
		int cls = sc.nextInt();
		System.out.println("Enter the total number of Student in each Class : ");
		int stu = sc.nextInt();


		//Creating 3D - Array
		int arr[][][] = new int[col][cls][stu];

		//Collecting the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college number "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class number "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student no: "+(k+1)+" in Java:-");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//Printing the information
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college number "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class number "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The marks of student no: "+(k+1)+" in java is :-"+(arr[i][j][k]));
				}
			}
		}
	}
}

/*
 * arr.length 		----> college count
 * arr[i].length 	----> get into the college and collect count of classes
 * arr[i][j].length ----> get into the college, get into the class and collect count of students
 */