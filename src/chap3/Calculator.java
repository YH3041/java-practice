package chap3;

public class Calculator {
	public static void main(String args[]) {
		
		int a = 10;
		int b = 20;
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(a, b));
		System.out.println(calc.subtract(a, b));
		System.out.println(calc.multiply(a, b));
		System.out.println(calc.divide(a, b));
	
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
}
