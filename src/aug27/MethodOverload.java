package aug27;

public class MethodOverload {

	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, int b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {

		MethodOverload mo = new MethodOverload();
		mo.add(10, 10);
		mo.add(1.5, 1.5);
		mo.add(5, 2.5);
		mo.add(2.3, 10);
	}

}
