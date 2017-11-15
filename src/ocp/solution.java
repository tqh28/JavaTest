package ocp;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class solution {

	public static void main(String[] args) {
//		double d = 100000 * 100000 * 100000 + 100000 * 100000 + 100000;
//		
//		System.out.println(d);
		
		Date d1 = new Date();
		
		System.out.println("longestCommonSubstring: " + longestCommonSubstring("a1dg1jl", "ae2dg2ji"));
		

		Date d2 = new Date();
		System.out.println("Time: " + (d2.getTime() - d1.getTime()));
	}

	static int longestCommonSubstring(String s, String t) {
		double MMM = 10000000000D;
		double MMN = 100000D;
		
		double res = 0;
		
		List<Double> list = new LinkedList<Double>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < t.length(); j ++) {
				if (s.charAt(i) == t.charAt(j)) {
					double value = 1;
					
					List<Double> removeList = new LinkedList<Double>();
					for (Double d: list) {
						if (Math.floor(d.doubleValue() / MMN) == (i - 1) * MMN + j - 1) {
							value = d % MMN + 1;
						} else if ((int)d.doubleValue() / MMM < i - 1) {
							removeList.add(d);
						}
					}
					
					for (Double d: removeList) {
						list.remove(d);
					}
					
					
					list.add(i * MMM + j * MMN + value);
					if (value > res) {
						res = value;
					}
				}
			}
		}
		
		
		return (int )res;
	}
	

}
