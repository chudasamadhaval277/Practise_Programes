package Practise;

public class fiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		
		int a = 0;
		int b = 1;
		int c;
		
		
		for(int i=0;i<=number;i++) {
			
			System.out.println("number a:: "+a);
			System.out.println("number b:: "+b);
			
			c = a+b;
			
			a = b;
			b = c;
			
			
			
			System.out.println("Number c::::::::::::::"+c);
		}
		
		
	}

}
