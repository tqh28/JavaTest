package collection;

import java.util.ArrayList;
import java.util.List;

public class TestDeclareCollection {

	public static void main(String[] args) {
		List list1 = new ArrayList<>();
		list1.add("???");
		list1.add(1);
		list1.add(new Person(23, "TQH"));
		for (Object o: list1) {
			System.out.println(o);
		}
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		for (Integer o: list2) {
			System.out.println(o);
		}
		
		List list3 = new ArrayList<String>();
		list3.add(1);
		list3.add("test text");
		list3.add(new Double(100000D));
		list3.add(new Person(23, "TQH"));
		for (Object o: list3) {
			System.out.println(o);
		}
		
		List list4 = new ArrayList<Integer>();
		list4.add(1);
		list4.add("test text");
		list4.add(new Double(100000D));
		list4.add(new Person(23, "TQH"));
		for (Object o: list4) {
			System.out.println(o);
		}
		
		List<String> list5 = new ArrayList<String>();
		
		
		List<> list6 = new ArrayList<String>(); // error in List<>
	}
}
