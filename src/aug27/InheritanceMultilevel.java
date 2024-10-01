package aug27;
class X
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class Y extends X
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
class C extends Y
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}




public class InheritanceMultilevel {

	public static void main(String[] args) {

		C cc= new C();
		cc.a=100;
		cc.b=200;
		cc.c=300;
		cc.display();
		cc.print();
		cc.show();
	}

}
