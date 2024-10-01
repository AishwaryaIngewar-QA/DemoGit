package practiceprogram;

public class ArrayMissingElem {

	public static void main(String[] args) {

		int a[]= {1,2,4,5};
		int orgsum=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			orgsum= orgsum+a[i];
		}
		System.out.println(orgsum);
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		int missing= sum - orgsum;
		System.out.println("Missing element is: "+missing);

	}

}
