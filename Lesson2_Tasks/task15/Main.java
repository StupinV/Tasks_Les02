package by.htp.task15;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 216;
		int nod;
		int b = 144;
		
		if (a != b) {
			
			if(a < b) {
				
				int min = a;
				
				for(int i = min; i > 0; i--) {
					
					if((a % i == 0) && (b % i == 0)) {
						
						nod = i;
						System.out.println("мнд= " + nod);
						break;
						
					}
					
				}
			
			}
			
			else {
				
				int min = b;
				
				for(int i = min; i > 0; i--) {
					
					if((a % i == 0) && (b % i == 0)) {
						
						nod = i;
						System.out.println("мнд= " + nod);
						break;
						
					}
					
				}
			
			}

			
		}
		
		else {
			
			System.out.println("мнд= " + a);
			
		}
		
	}

}
