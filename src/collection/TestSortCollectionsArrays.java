package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestSortCollectionsArrays {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		
		stringList.add("Bill");
		stringList.add("Ann");
		stringList.add("Dane");
		stringList.add("Cris");
		
		
		Collections.sort(stringList);
		
		for (String s: stringList) {
			System.out.println(s);
		}
	}
}
