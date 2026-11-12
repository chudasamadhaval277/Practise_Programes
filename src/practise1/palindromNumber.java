package practise1;

public class palindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121;
		int originalNumber = num;
		int reverse = 0;
		int digit = 0;
		
		while(num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println(reverse);
		
		if(reverse==originalNumber) {
			System.out.println("Palindrom");
		}

	}

}
