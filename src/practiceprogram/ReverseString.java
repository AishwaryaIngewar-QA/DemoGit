package practiceprogram;

public class ReverseString {

	public static void main(String[] args) {

		String s = "ABCD";
		String rev= "";
		
		int len= s.length();
		/*for(int i=len-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);*/
		/* StringBuffer sb =new StringBuffer(s);
		 StringBuffer revs = sb.reverse();
		System.out.println(revs);*/
		
		/*char a[]= s.toCharArray();
		int l=a.length;
		for(int i=l-1;i>=0;i--)
		{
			rev = rev +a[i];
		}
		System.out.println(rev);*/
		 StringBuilder  sb = new StringBuilder();
		 sb.append(s);
		 StringBuilder revs = sb.reverse();
		 System.out.println(revs);
	}

}
