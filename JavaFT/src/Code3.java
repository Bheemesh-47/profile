/*
 * Program to create a simple calculator application using switch cases
 */

import java.util.Scanner;
public class Code3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the operation to be performed : \n+"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. Multiplication\n"
				+ "4. Division");
		int op = scan.nextInt();
		int val;
		switch (op) {
		case 1: {
			System.out.println("Addition Operartion is invoked.");
			System.out.println("Enter the value no: 1: ");
			int num1 = scan.nextInt();
			System.out.println("Enter the value no: 2: ");
			int num2 = scan.nextInt();
			val = num1 + num2;
			System.out.println("The result of addition is : "+val);
			break;
		}
		case 2: {
			System.out.println("Subtraction Operartion is invoked.");
			System.out.println("Enter the value no: 1: ");
			int num1 = scan.nextInt();
			System.out.println("Enter the value no: 2: ");
			int num2 = scan.nextInt();
			val = num1 - num2;
			System.out.println("The result of subtraction is : "+val);
			break;
		}
		case 3: {
			System.out.println("Multiplication Operartion is invoked.");
			System.out.println("Enter the value no: 1: ");
			int num1 = scan.nextInt();
			System.out.println("Enter the value no: 2: ");
			int num2 = scan.nextInt();
			val = num1 * num2;
			System.out.println("The result of multiplication is : "+val);
			break;
		}
		case 4: {
			System.out.println("Division Operartion is invoked.");
			System.out.println("Enter the value no: 1: ");
			int num1 = scan.nextInt();
			System.out.println("Enter the value no: 2: ");
			int num2 = scan.nextInt();
			val = num1 / num2;
			System.out.println("The result of division is : "+val);
			break;
		}
		default:
			System.out.println("wrong input selected");
		}
	}
}
