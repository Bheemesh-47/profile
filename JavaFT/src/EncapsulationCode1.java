
class Dog{
	private String name;//instance
	private String color;//instance
	private int cost;//instance
	private int age;//instance
	private String breed;//instance
	
	//parameterized 
	Dog(String name,String color,int cost, int age, String breed)//local
	{
		super();
		this.name = name;//shinny
		this.color = color;//brown
		this.cost = cost;//5000
		this.age = age;//5
		this.breed = breed;//pug
	}
	
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
}
public class EncapsulationCode1 {
	public static void main(String[] args) {
		Dog d = new Dog("Shinny","Brown",5000,5,"Pug");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
		System.out.println(d.getBreed());
	}
}
