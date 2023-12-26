class SampleTest{
	static int a,b,c;//static variables --->1
	int m,n,o;//non-static variables

	//static block -- can access only static variables --->2
	static 
	{
		a=100;
		b=200;
		c=300;
//		m=1000;//error
//		n=2000;//error
//		o=3000;//error
	}

	//Non-static block -- can access both static and non-static variables
	{
		a=1001;
		b=2001;
		c=3001;
		m=10001;
		n=20001;
		o=30001;
	}

	//static methods -- can access only static variables
	static void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(m);//error
//		System.out.println(n);//error
//		System.out.println(o);//error
	}
	//static methods -- can access both static and non-static variables
	void display1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}
public class Launch4 {
	public static void main(String[] args) {
		System.out.println(SampleTest.a);
		System.out.println(SampleTest.b);
		System.out.println(SampleTest.c);
		System.out.println("---------");
		SampleTest st = new SampleTest();
		st.display1();
		System.out.println("---------");
		st.display();
	}
}
