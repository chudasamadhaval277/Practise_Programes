package Practise;

public class findSecondLargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {5, 3, 2, 6, 8, 4};
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int num : numbers) {
			
			if(num > highest) {
				secondHighest = highest;
				highest = num;
			}else if(num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}

		System.out.println("Num");
		System.out.println("Num");
		System.out.println("Second Highest :: "+secondHighest);
		
	}

}
