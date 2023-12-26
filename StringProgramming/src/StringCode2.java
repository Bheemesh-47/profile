//Write a program to demostrate the different built-in
// method inside the String class
public class StringCode2 {
	public static void main(String[] args) {
		String str = "FIFA World Cup Is A Celebration";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());//31
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(25));
//		System.out.println(str.charAt(35));//exception as the length is 31 
		System.out.println(str.concat(" accross the globe."));
		System.out.println(str);
		System.out.println(str.contains("Cup"));
		System.out.println(str.contains("Pop"));
		System.out.println(str.endsWith("Celebration"));
		System.out.println(str.endsWith("Entertainment"));
		System.out.println(str.startsWith("FIFA"));
		System.out.println(str.startsWith("fifa"));
		System.out.println(str.hashCode());
		System.out.println(str.getClass());
		System.out.println(str.indexOf('W'));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		String str1 = "     ";
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
	}
}
