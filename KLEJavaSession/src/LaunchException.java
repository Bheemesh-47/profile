import java.util.InputMismatchException;
import java.util.Scanner;

public class LaunchException {
	public static void main(String[] args) {
		try {
			System.out.println("Division Operation");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Numerator: ");
			int num = sc.nextInt();//critical statement ----> input mismatch exception
			System.out.println("Enter the denominator: ");
			int den = sc.nextInt();//critical statement ----> input mismatch exception
			int res = num/den;//critical statement ----> arithmetic exception
			System.out.println(res);

			System.out.println("Array Operation");
			System.out.println("Enter the array size: ");
			int n = sc.nextInt();//critical statement ----> input mismatch exception
			int arr[] = new int[n];//critical statement ----> negative array size exception
			System.out.println("Enter the position number : ");
			int pos = sc.nextInt();//critical statement ----> input mismatch exception
			System.out.println("Enter the value to be addded : ");
			int val = sc.nextInt();//critical statement ----> input mismatch exception
			arr[pos] = val;//critical statement ----> index out of bounds exception/ input mismatch exception 
			System.out.println("Data added");

		}
		//multi-catch
		catch(InputMismatchException|NullPointerException e1) {
			System.out.println("Input/output Exception");
		}
		//specific catch
		catch(ArithmeticException e2) {
			System.out.println("Arithmetic Exception Occured");
		}
		//multi-catch
		catch (NegativeArraySizeException|ArrayIndexOutOfBoundsException e3) {
			System.out.println("Array Exception handled");
		}
		
		//Generic Catch
		catch (Exception e) {
			System.out.println("Exception Handled in Main");
		}
	}
}
