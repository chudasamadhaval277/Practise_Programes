package practise1;

public class secondhighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {2, 1, 5, 8, 9, 10, 15};
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(Integer num:numbers) {
			
			if(num > highest) {
				
				secondHighest = highest;
				highest = num;
			}else if(num > secondHighest && num != highest) {
				secondHighest = num;
			}
			
		}
		System.out.println(secondHighest);
		System.out.println(highest);
	}

}
