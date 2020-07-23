package by.htp.task07;

public class Main {
	
	public static void main(String[] args) {
		
		int a = -6;
		int b = 2; 
		int c = -1;
		int count = 0;
		
		System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		
		if(a < 0) {
			
			count++;
			
		}
		
		if(b < 0) {
			
			count++;
			
		}
		
		if(c < 0) {
			
			count++;
			
		}
		
		System.out.println("From this numbers only " + count + " of them are negative");
		
	}

}
