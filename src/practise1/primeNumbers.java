package practise1;

public class primeNumbers {

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
				}
			}
			
			if(prime) {
				System.out.println("Prime Numbers :: "+i);
			}
		}
		System.out.println("demo 1");
		
	}

}
