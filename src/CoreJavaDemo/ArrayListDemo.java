package CoreJavaDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("java");
		a.add("rahul");
		a.add("rahul");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		System.out.println(a.size());
		a.remove(1);
		System.out.println(a);
		a.remove("rahul");
		System.out.println(a);
		a.get(0);
		System.out.println(a);
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.indexOf("testing"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		


	}

}
