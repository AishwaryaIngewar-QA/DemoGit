package aug27;

class AAA
{
	int a=88;
	void show()
	{
		System.out.println(a);
	}
}
interface B1
{
	int b1=10;
	void m1();
}
interface B2
{
	int b2=20;
	void m2();
}


public class InheritanceHybrid extends AAA implements B1, B2{
	
	public void m1()
	{
		System.out.println(b1);
	}
	public void m2()
	{
		System.out.println(b2);
	}
	
	public static void main(String[] args) {
		
		InheritanceHybrid ih = new InheritanceHybrid();
		//ih.a=99;
		ih.show();
		ih.m1();
		ih.m2();
	}

}
