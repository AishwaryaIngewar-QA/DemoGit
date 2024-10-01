package practiceprogram;

public class Practice {

	public static void main(String[] args) {

		String a = "Hellow";
		String b = new String("Hellow");
		
		System.out.println(a==b);//false
		System.out.println(a.compareTo(b));//0
		System.out.println(a.equals(b));//true
		System.out.println(a.equalsIgnoreCase(b));//true
	}

}
