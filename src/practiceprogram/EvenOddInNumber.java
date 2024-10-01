package practiceprogram;

public class EvenOddInNumber {

	public static void main(String[] args) {

		int num=1234;
		int even=0;
		int odd =0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				System.out.println("Even numbers are: "+rem);
			}
			else
			{
				System.out.println("Odd numbers are: "+rem);

			}
			
			num= num/10;

		}
	}

}
