package aug27;

public class MainMethodOverload {
	
	public void main(int x)
	{
		System.out.println("ChangeGit");

		System.out.println(x);
	}
	public void main(int x, int y)
	{
		System.out.println("ChangeGit");

		System.out.println(x+y);
	}

	public static void main(String[] args) {
		MainMethodOverload mm = new MainMethodOverload();
		mm.main(10);
		mm.main(20, 30);
		

		
	}

}
