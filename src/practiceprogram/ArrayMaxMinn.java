package practiceprogram;

public class ArrayMaxMinn {

	public static void main(String[] args) {
		
		int a[]= {3,4,10,6,7};
		int min=a[0];
		int max=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max is"+max);
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}

		}
		System.out.println("min is"+min);
	}

}
