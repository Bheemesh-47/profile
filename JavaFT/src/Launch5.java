import java.util.Scanner;

class Farmer{
	double principle;
	static double rate;
	double time;
	double simpleInterest;
	
	static {
		rate=2.5;//memory for rate will be created only once for all the objects
	}
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		principle=sc.nextDouble();
		
		System.out.println("Enter the Time Needed (In Years): ");
		time=sc.nextDouble();
		
	}
	void calculate() {
		simpleInterest = (principle * time * rate)/100;
	}
	
	void showSimpleInterest() {
		System.out.println("The Simple Interest is : "+simpleInterest);
	}
}
public class Launch5 {
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		
		f1.collectData();
		f2.collectData();
		f3.collectData();
		
		f1.calculate();
		f2.calculate();
		f3.calculate();
		
		System.out.println("Simple Interest for First farmer is : ");
		f1.showSimpleInterest();
		System.out.println("Simple Interest for Second farmer is : ");
		f2.showSimpleInterest();
		System.out.println("Simple Interest for Third farmer is : ");
		f3.showSimpleInterest();
		
	}
}
