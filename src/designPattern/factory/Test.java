package designPattern.factory;

public class Test {

	public static void main(String[] args) {
		TFactory tf = new TFactory();

		T t1 = tf.getT("T1");
		T t2 = tf.getT("T2");
		
		t1.print();
		t2.print();
	}

}
