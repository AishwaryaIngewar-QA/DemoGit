package practiceprogram;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int a[]= {1,2,3,7,5,6};
		int max = a[0];
		int min = a[0];
		 for(int i=0;i< a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
			System.out.println("max no is: "+max);
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
				 min=a[i];
			 }
		 }
			System.out.println("min no is: "+min);

	}

}
