package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestString {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		String a = "1";
//		String b = "2";
//		String c = "3";
//		list.add(a);
//		list.add(b);
//		list.add(c);
//		System.out.println(list);
//		List<String> newList = new ArrayList<>(list);
//		System.out.println(newList);
//		a = "4";
//		System.out.println(list);
//		System.out.println(newList);
		
		List<String> list1 = Arrays.asList("1","2","3");
		list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		List<String> list2 = Arrays.asList("1","4");
		list2 = new ArrayList<>();
		list2.add("1");
		list2.add("4");
		
		System.out.println(list1.containsAll(list2));
		list1.removeAll(list2);
		System.out.println(list1);

	}
}
