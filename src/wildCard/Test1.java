package wildCard;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		String s = "test";

		System.out.println(returnT(s));

		String[] arr = new String[] { "", "1", "2", "3" };
		T2("0");
		T2(arr);
	}

	public static <T> T returnT(T t) {
		return t;
	}

	public static <T> List sort(List<T> list) {
		return list;
	}

	public static void T2(String... strings) {
		// for (String s: strings)
		System.out.println(strings[1]);
	}

}
