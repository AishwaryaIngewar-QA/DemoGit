package practiceprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");

		int num = sc.nextInt();//1234
		int orgnum=num;
		System.out.println("enter number");
		int rev=0;
		while(num!=0)
		{
			 rev=rev*10 + num%10;
			 num=num/10;
		}
		if(orgnum==rev)
		{
		System.out.println("this is palindrome num");
		}
		else
		{
			System.out.println("this is not a palindrome num");

		}
	}

}
