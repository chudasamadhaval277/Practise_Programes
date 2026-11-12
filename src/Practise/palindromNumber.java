package Practise;

public class palindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 123;
		int originalNumber = number;
		int reverse = 0;
		int digit = 0;
		
		while(number > 0) {
			
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number /10;
		}
		
		System.out.println(reverse);
		if(reverse == originalNumber) {
			System.out.println("Palindarom");
		}
		
		

	}

}
