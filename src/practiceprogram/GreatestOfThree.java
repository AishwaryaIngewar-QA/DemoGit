package practiceprogram;

public class GreatestOfThree {

	public static void main(String[] args) {

		int a=50;
		int b= 20;
		int c=30;
		if(a>b && a>c)
		{
			System.out.println("a is greatest: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greatest: "+b);
		}
		else
		{
			System.out.println("c is greatest "+c);
		}
	}

}
