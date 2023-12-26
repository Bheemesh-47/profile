abstract class Plane{
	void takeOff() {
		System.out.println("Plane took off");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low height");
	}
}
public class Launch {
	public static void main(String[] args) {
		CargoPlane p = new CargoPlane();
		p.takeOff();
		p.fly();
		p.land();
		Plane ref = new Plane() {
			@Override
			void fly() {
				System.out.println("Plane flys");
			}
		};
		System.out.println(ref);
	}
}
