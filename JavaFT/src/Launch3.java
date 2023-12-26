class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
	double add(float a, int b, double c) {
		return a+b+c;
	}
	double add(float a, double b, int c) {
		return a+b+c;
	}
}
public class Launch3 {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float a1=10.11f,b1=20.22f,c1=30.33f;
		double a2=100.111,b2=200.222,c2=300.333;
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(a,b));//int,int
		System.out.println(cal.add(a1, b1));//float,float
		System.out.println(cal.add(a, b1, c2));//int,float.double
	}
}
