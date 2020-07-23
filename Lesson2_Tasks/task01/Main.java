package by.htp.task01;

public class Main {
	
	public static void main(String[] args) {
		
		double a = 1;
		double b = 4;
		double c = 5;
		System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		
		double answer = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("Answer = " + answer);
		
	}	

}
