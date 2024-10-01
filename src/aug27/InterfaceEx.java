package aug27;

interface AA
{
	int a=10;
	void show();
}
class BB implements AA
{
	public void show()
	{
		System.out.println(a);
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		
		AA obj= new BB();	
		obj.show();
		
		
		

	}

}
