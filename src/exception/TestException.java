package exception;

import java.io.IOException;

public class TestException {

	public static void main (String[] args) {
		test8();
	}
	
	public static void test() {
		throw new RuntimeException();
	}
	
	public static void test2() {
		throw new NullPointerException();
	}
	
	public static void test3() throws IOException {
		throw new IOException();
	}
	
	public static void test4() throws NullPointerException {
		
	}
	
	public static void test5() {
		throw new HuyUncheckedException();
	}
	
	public static void test6() throws HuyCheckedException {
		throw new HuyCheckedException();
	}
	
	public static void test7() throws HuyException {
		throw new HuyException();
	}
	
//	@SuppressWarnings("finally")
	public static void test8() {
		try {
			throw new Exception();
		} catch (Exception e) {
//			System.exit(0);
		} finally {
			throw new NullPointerException();
			System.out.println("t8 finally");
		}
	}
}
