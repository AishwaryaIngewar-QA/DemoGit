package aug27;

public class StaticExample {
	int a =10;
	static int b=20;
	void m1()
	{
		System.out.println("This is not static method");
	}
	static void m2()
	{
		System.out.println("This is static method");

	}

	public static void main(String[] args) {
		StaticExample se= new StaticExample();
		System.out.println(b);
		m2();
		System.out.println(se.a);
		se.m1();
		

	}

}
