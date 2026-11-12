package practise1;

public class fiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c;
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("A value is ::"+a);
			System.out.println("B value is ::"+b);
			
			c = a+b;
			
			
			
			System.out.println("C value is ::::::::::::::::::: "+c);
			a = b;
			b = c;
		}
	}

}
