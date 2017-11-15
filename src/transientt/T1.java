package transientt;

import java.io.Serializable;

public class T1 implements Serializable {

	transient int x;
	int y;
	
	public T1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		return (x ^ y);
	}
	
	@Override
	public boolean equals(Object obj) {
		T1 t1 = (T1) obj;
		if (t1.x == x && t1.y == y) {
			return true;
		}
		return false;
	}
}
