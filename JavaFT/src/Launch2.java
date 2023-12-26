class Parent{
	//Inherited
	void eat() {
		System.out.println("eats food");
	}
	void sleep() {
		System.out.println("parent sleeps at 9pm");
	}
	//Inherited
	void run() {
		System.out.println("runs for 10km");
	}
}

class Child extends Parent{
	//Overriding---Overridden Method
	void sleep() {
		System.out.println("child sleeps at 1am");
	}
	void swims() {
		System.out.println("child swims");
	}
}
public class Launch2 {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.eat();
		c1.sleep();
		c1.run();
		c1.swims();
	}
}
