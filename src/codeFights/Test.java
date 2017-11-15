package codeFights;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main (String[] args) {
		
		System.out.println(singleNumber(new int[] {1,2,1,3,3}));
		
	}
	
	static int singleNumber(int[] nums) {
		Map map = new HashMap<Integer, Integer>();
		Integer key, value;
		for (int num: nums) {
			key = new Integer(num);
			value = (Integer) map.get(new Integer(num));
			if (value == null) {
				map.put(new Integer(num), 1);
			} else {
				map.replace(key, value + 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for (Integer i: set) {
			if ((int)map.get(i) == 1) {
				return i;
			}
		}
		
		return 0;
	}
}
