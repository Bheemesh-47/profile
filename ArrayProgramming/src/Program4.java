import java.util.Scanner;

/*	   i		   j			k
 * 	College		 Class		Student
 * 	   0		   0		    2
 * 				   1			3
 * 	   1		   0			4
 * 				   1			2
 * 	   			   2			3	
 */
public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Colleges: ");
		int col = sc.nextInt();
		int cls;
		int stu;

		//Creating 3D - Jagged Array
		int arr[][][] = new int[col][][];
		
		//Collecting count of classes in each college
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the total number of Classes in college - "+(i+1));
			cls = sc.nextInt();
			arr[i] = new int[cls][];
		}
		
		//Collecting count of students in each class of the college
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college - "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class - "+(j+1));
				System.out.println("Enter the total number of Students : ");
				stu = sc.nextInt();
				arr[i][j] = new int[stu];
			}
		}
		

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
