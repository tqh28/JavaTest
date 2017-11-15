package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person(10, "Nick");
		Person p2 = new Person(12, "Bob");
		Person p3 = new Person(8, "Zin");
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		
		for (Person p : list) {
			System.out.println(p.toString());
		}
		
	}

}
