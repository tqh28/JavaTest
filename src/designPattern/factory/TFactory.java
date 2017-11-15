package designPattern.factory;

public class TFactory {

	public T getT(String name) {
		if (name == null) {
			return null;
		} else if (name.equalsIgnoreCase("T1")) {
			return new T1();
		} else if (name.equalsIgnoreCase("T2")) {
			return new T2();
		}
		return null;
	}
}
