package wrapper;

public class Test {

	public static void main(String[] args) {
		Integer i1 = 1;
		Integer i2 = i1;
		System.out.println(i1 == i2);
		i2 = 2;
		System.out.println(i1 == i2);
		System.out.println("----------------------");
		
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("----------------------");
		
		
		Integer i5 = 10;
		Integer i6 = 10;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
	}
}
