package aug27;

public class ExceptionHandling {

	public static void main(String[] args) {

	
		System.out.println("program started");
		System.out.println("program inprogress");
		int a=100;
		String s= null;
		int arr[]= new int[5];
		String str="abc";
		try
		{
		//System.out.println(a/0);
		//System.out.println(s.length());
		//System.out.println(arr[10]);
		int n=Integer.parseInt(str);		

		System.out.println("Entered in try block");
		}
		catch(Exception e)
		{
			System.out.println("Entered in catch block");
		}
		finally
		{
			System.out.println("always execute finally");
		}
		System.out.println("program completed");
		System.out.println("program exited");
	}

}
