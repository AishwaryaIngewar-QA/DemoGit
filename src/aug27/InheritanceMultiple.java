package aug27;

interface xyz
{
	int a=10;
	void m1();
}
interface abc
{
	int b=20;
	void m2();
	
}

public class InheritanceMultiple implements xyz,abc{
	
	public void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(b);
	}

	public static void main(String[] args) {

		InheritanceMultiple mi= new InheritanceMultiple();
		mi.m1();
		mi.m2();
	}

}
