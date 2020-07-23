package by.htp.task06;

public class Main {
	
	public static void main(String[] args) {
		
		double a = 70;
		double b = 25;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if(a + b == 90) {
			
			System.out.println("This triangle is right-angled");
			
		}
		
		else {
			
			if(a + b > 180) {
				
				System.out.println("This triangle doesn't exist");
				
			}
			
			else {
				
				System.out.println("This triangle exists");
				
			}
			
		}
		
	}

}
