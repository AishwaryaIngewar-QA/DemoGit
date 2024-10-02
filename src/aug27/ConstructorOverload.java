package aug27;

public class ConstructorOverload {
	


	ConstructorOverload(int a, int b)
	{
		System.out.println(a+b);
	}
	ConstructorOverload(double a, int b)
	{
		System.out.println(a+b);
	}
	ConstructorOverload(int a, double b)
	{
		System.out.println(a+b);
	}
	ConstructorOverload(double a, double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConstructorOverload co = new ConstructorOverload(1,1.1);
		
	}

}
