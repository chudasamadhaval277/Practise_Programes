package practise1;

import java.util.Arrays;

public class rightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int k = 1;
		int n = arr.length;
		int[] result = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			int newPosition = (i + k) % n;
			result[newPosition] = arr[i]; 
		}
		
		System.out.println(Arrays.toString(result));
		System.out.println("demo 1");
		
		

	}

}
