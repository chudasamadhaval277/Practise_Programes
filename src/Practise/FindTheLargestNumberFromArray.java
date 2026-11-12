package Practise;

public class FindTheLargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 5, 8, 6, 3, 2};
		
		int max = numbers[0];
		
		
		for(int i=0;i<numbers.length;i++) {
			
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		System.out.println("Max Number ::"+max);
		
	}

}
