package aug27;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}


public class InhetanceSingle {
	
	public static void main(String[] args) {

		/*A aa= new A();
		aa.a=100;
		aa.display();*/
		
		B bb= new B();
		bb.a=200;
		bb.display();
		bb.b=300;
		bb.print();
	}

}
