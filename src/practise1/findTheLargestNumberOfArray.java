package practise1;

public class findTheLargestNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 4, 6, 8, 3};
		
		int max = Integer.MIN_VALUE;
		
		
		for(Integer num:numbers) {
			
			if(num > max) {
				max =num;
			}
		}
		System.out.println(max);

	}

}
