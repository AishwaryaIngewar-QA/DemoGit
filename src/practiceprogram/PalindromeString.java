package practiceprogram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");//MADAM
		String str=sc.next();
		int len = str.length();
		String org=str;
		String rev= "";
		for(int i=len-1;i>=0;i--)
		{
			rev= rev + str.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	}

}
