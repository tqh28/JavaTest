package ocp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chapter8 {

	public static void main (String[] args) {
		Date date= new Date();
		
//		System.out.println(date.toString());
//		System.out.println(date.toLocaleString());
//		System.out.println(date.toGMTString());
//		System.out.println(date.getTimezoneOffset());
//		System.out.println(date.getDate());
//		System.out.println(date.getDay());
//		
//		System.out.println(Calendar.getInstance().getTimeZone().getDisplayName());
//		
//		Locale loc = new Locale();
//		Calendar car = Calendar.getInstance(loc);
//		System.out.println(car.getFirstDayOfWeek());
		
//		Date d1 = new Date();
//		System.out.println(d1.toString());
//		
//		Calendar c = Calendar.getInstance();
//		c.setTime(new Date());
//		c.roll(Calendar.MONTH, 13);
//		Date d = c.getTime();
//		System.out.println(d.toString());
		
		
		
//		Locale loc = new Locale("vi");
//		DateFormat dfFul = DateFormat.getDateInstance(DateFormat.FULL, loc);
//		DateFormat dfMed = DateFormat.getDateInstance(DateFormat.MEDIUM, loc);
//		DateFormat dfSho = DateFormat.getDateInstance(DateFormat.SHORT, loc);
//		System.out.println(dfFul.format(date));
//		System.out.println(dfMed.format(date));
//		System.out.println(dfSho.format(date));
//		
//		DateFormat dtfFul = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, loc);
//		DateFormat dtfMed = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, loc);
//		DateFormat dtfSho = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, loc);
//		System.out.println(dtfFul.format(date));
//		System.out.println(dtfMed.format(date));
//		System.out.println(dtfSho.format(date));
		
		
//		float f1 = 122233.4567f;
//		Locale locFR = new Locale("vi"); // France
//		NumberFormat[] nfa = new NumberFormat[4];
//		nfa[0] = NumberFormat.getInstance();
//		nfa[1] = NumberFormat.getInstance(locFR);
//		nfa[2] = NumberFormat.getCurrencyInstance();
//		nfa[3] = NumberFormat.getCurrencyInstance(locFR);
//		for(NumberFormat nf : nfa)
//		System.out.println(nf.format(f1));
		
		
		
		
//		double f1 = 12113.4563378;
//		NumberFormat nf = NumberFormat.getInstance();
//		System.out.print(nf.getMaximumFractionDigits() + " ");
//		System.out.print(nf.format(f1) + " ");
//		nf.setMaximumFractionDigits(5);
//		System.out.println(nf.format(f1) + " ");
//		try {
//		System.out.println(nf.parse("1234.567"));
//		nf.setParseIntegerOnly(true);
//		System.out.println(nf.parse("1234.567"));
//		} catch (ParseException pe) {
//		System.out.println("parse exc");
//		}
		
		
//		String s = "ab.cde.fg";
//		String[] tokens = s.split("\\.");
//		for (String token: tokens) {
//			System.out.println(token);
//		}
		
		int[] arr = new int[] {4,5,7,8,6,4,5,2,5,78,4,5,2,4,7,85,58,5};
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.replace(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for (Integer i: set) {
			if (map.get(i) > 1) {
				System.out.println(i + " " + map.get(i));
			}
		}
		
		
	}
}
