package Practise;

import java.util.Arrays;

public class rightRotation {
	
	public static void main(String[] args) {
		
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		int k = 3;
		int n = numbers.length;
		int[] result = new int[n];
		
		for(int i=0;i<n;i++) {
			int newPosition = (i + k) % n;
			result[newPosition] = numbers[i];
		}
		
		System.out.println("Array After rotation::: "+ Arrays.toString(result));
	}

}
