import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Classes: ");
		int cls = sc.nextInt();
		int stu;
		//creating the array - 2D Jagged Array
		String a[][] = new String[cls][];
		
		//collecting the student data for each class
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the total number of students in class no: "+(i+1));
			stu = sc.nextInt();//
			a[i] = new String[stu];
		}

		//collecting data
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the class no: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the name of student no: "+(j+1));
				a[i][j] = sc.next();
			}
		}

		//fetching data
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the class no: "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("The name of student no: "+(j+1)+" is: "+(a[i][j]));
			}
		}
	}	
}