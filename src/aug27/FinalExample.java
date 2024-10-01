package aug27;

class St
{
	final void show()
	{
		System.out.println("static");
	}
			
}
class Try extends St
{
	/*void show()
	{
		
	}*/
}



public class FinalExample {
	
	int a=100;
	void print()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {

		FinalExample fe= new FinalExample();
		fe.a=200;
		fe.print();
	}

}
