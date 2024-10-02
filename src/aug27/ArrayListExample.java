package aug27;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		System.out.println("Practice Git");
		System.out.println("Practice Git---DemoGit");
		//after commit
		System.out.println("Practice Git1");
		System.out.println("Practice Git2");
		System.out.println("Practice Git3");


	//	ArrayList<String> list = new ArrayList<String>();
		ArrayList list= new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("lmn");
		list.add("pqr");
		list.add(100);
		list.add('a');
		System.out.println("List is: "+list);
		System.out.println(list.size());
		list.remove(1);
		System.out.println("List is: "+list);
		System.out.println(list.size());
		list.add(1,"aish");
		for(Object s:list)
		{
			System.out.println(s);
		}
	}

}
