package by.htp.task11;

public class Main {
	
	public static void main(String[] args) {
		
		int a = -6;
		int b = 10;
		int h = 1;
		int x = 3;
		
		while((x > 2) && (x <= b)) {

			System.out.print(x + " ");
			x = x + h;
			
		}
		
		System.out.println(" ");
		x = 2;
		System.out.println(" ");
		
		while((x >= a) && (x <= 2)) {
			
			System.out.print(x + " ");
			x = x - h;
			
		}
		
	}

}
