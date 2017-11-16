package collection;

public class Person implements Comparable<Person>{

	private int age;
	private String name;
	
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
	
	@Override
	public int compareTo(Person o) {// o must be a Person, not Object
		return age - o.getAge(); // positive
//		return o.getAge() - age; // negative
	}
	
	/** Error, o must be a Person, not Object
	@Override
	public int compareTo(Object o) {
		return age - ((Person) o).getAge(); // positive
//		return o.getAge() - age; // negative
	}
	*/
	
}
