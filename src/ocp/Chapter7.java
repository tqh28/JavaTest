package ocp;

public class Chapter7 {

	public static void main (String[] args) {
//		if (true)
//			if (false) System.out.println("false if");
//			else System.out.println("else in if"); 
//		else System.out.println("else out if"); 
//		
//		
//		int x = 5;
//		boolean b = false;
//		if (b = true) {}
//		
//		byte swi = 10;
//		switch (swi) {
//		case 1: 
//			break;
//		case 100: 
//			break;
//		}
//		
//		switch (10) {
//		case 1:  
//			break;
//		}
//		
//		for (System.out.println("1");true;System.out.println("3")) {
//			break;
//		}
		

		outer:
		for (int i=0; i<5; i++) {
		  for (int j=0; j<5; j++) {
		    System.out.println("Hello");
		    continue outerr;
		  } // end of inner loop
		  System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye"); 
	}
}
