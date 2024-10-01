package aug27;

public class Operators {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		boolean x= true;
		boolean y= false;
		
		//Arithmetic operators
		System.out.println("Arithmetic operators");
		System.out.println("add of a and b is "+(a+b));
		System.out.println("sub of a and b is "+(b-a));
		System.out.println("mul of a and b is "+(a*b));
		System.out.println("div of a and b is "+(b/a));
		
		//Relational Operators
		System.out.println("Relational operators");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Logical operators;
		System.out.println("Logical operators");
		System.out.println(!x);
		System.out.println(!y);
		System.out.println(x && y);
		System.out.println(x || y);
		
		//Increment/Decrement operators
		System.out.println("Increment/Decrement operators");
		a++;
		System.out.println(a);
		b++;
		System.out.println(b);
		a--;
		System.out.println(a);


		



	}

}
