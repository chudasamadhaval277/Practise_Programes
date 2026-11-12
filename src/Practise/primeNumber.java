package Practise;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20;
		
		for(int i=0;i<num;i++) {
			
			boolean prime = true;
			
			if(i <= 1) {
				prime = false;
			}
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				
				if(i % j == 0) {
					prime = false;
					
					break;
				}
				
			}
			
			if(prime) {
				System.out.println("Prime Number is ::"+i);
			}
			
			
		}
		

	}

}
