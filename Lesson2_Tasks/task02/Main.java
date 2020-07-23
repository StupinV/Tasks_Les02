package by.htp.task02;

public class Main {
	
	public static void main(String[] args) {
		
		double a = 4;
		double b = 8;
		double c = 2;
		double d = 4;
		System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; d = " + d);
		
		double result = (a * b) / (c * d) - (a * b - c)/(c * d);
		
		System.out.println("Result = " + result);
		
	}

}
