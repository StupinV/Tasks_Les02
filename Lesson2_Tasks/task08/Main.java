package by.htp.task08;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int x = 1;
		int y = 5;
		int z = 3;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		if ((a <= x && b <= y) || (a <= x && b <= z) || (a <= y && b <= x) || (a <= y && b <= z) ||(a <= z && b <= x) || (a <= z && b <= y)) {
			
			System.out.println("Кирпич пройдет через отверстие.");
			
		}
		
		else {
			
			System.out.println("Кирпич не пройдет через отверстие");
			
		}
		
	}

}
