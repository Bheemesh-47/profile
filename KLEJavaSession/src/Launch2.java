import java.util.Scanner;

abstract class Shapes{
	double area;
	
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}
class Circle extends Shapes{
	private double r;
	double pi=3.14768;
	
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextDouble();
	}

	@Override
	void calculate() {
		area=pi*r*r;
	}
	
}
class Square extends Shapes{
	private double side;
	
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		side = sc.nextDouble();
	}

	@Override
	void calculate() {
		area=side * side;
	}
	
}
class Rectangle extends Shapes{
	private double l,b;
	
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		b = sc.nextDouble();
	}

	@Override
	void calculate() {
		area=l * b;
	}
	
}
class Geometry{
	void permit(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}
public class Launch2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Square sq = new Square();
		Rectangle r = new Rectangle();
		Geometry g = new Geometry();
		g.permit(c);
		g.permit(sq);
		g.permit(r);
	}
}
