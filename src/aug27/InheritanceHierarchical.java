package aug27;

class parent 
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}
class child1 extends parent
{
	int a;
	void m1()
	{
		System.out.println(a);
	}
}
class child2 extends parent
{
	int b;
	void m2()
	{
		System.out.println(b);
	}
}

public class InheritanceHierarchical {

	public static void main(String[] args) {
		
		child1 c1= new child1();
		c1.x=10;
		c1.show();
		c1.a=20;
		c1.m1();

		child2 c2 = new child2();
		c2.x=11;
		c2.show();
		c2.b=22;
		c2.m2();

	}

}
