package aug27;

class Bank
{
	double interest()
	{
		return 0;
	}
}
class Axis extends Bank
{
	double interest()
	{
		return 4.5;
	}
}
class Hdfc extends Bank
{
	double interest()
	{
		return 8.9;
	}
}


public class MethodOverrideex {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		System.out.println(b.interest());
		Axis a= new Axis();
		System.out.println(a.interest());
		Hdfc h = new Hdfc();
		h.interest();
		System.out.println(h.interest());

		
	}

}

