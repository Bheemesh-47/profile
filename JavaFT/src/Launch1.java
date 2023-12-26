
class Tiger{
	private String name;//Have access only within the Tiger Class
	private String color;//Have access only within the Tiger Class
	private int age;//Have access only within the Tiger Class
	private String country;//Have access only within the Tiger Class
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
public class Launch1 {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		//t1.name="ramu";//Cannot access the private members outside the class
		t1.setName("ramu");
		t1.setAge(7);
		t1.setColor("orange");
		t1.setCountry("india");
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
	}

}
