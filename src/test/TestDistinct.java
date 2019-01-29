package test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestDistinct {
	public static void main(String[] args) {
		String str = "一分队、二分队、三分队";
		String[] strs = str.split("、");
		Set<String> result = new LinkedHashSet<String>(Arrays.asList(strs));
		str = "";
		for (String str1 : result) {
			str += "、" + str1;
		}
		if(str.startsWith("、")){
			str = str.substring(1, str.length());
		}
		// 这里得到的是Set
		System.out.println(str);
	}
}
