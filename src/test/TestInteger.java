package test;

import java.util.ArrayList;
import java.util.List;

public class TestInteger {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		System.out.println(list.contains(1));
		list.add(300);
		System.out.println(list.contains(300));
	}
}
