package practise1;

import java.util.Arrays;

public class printRightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int k = 2;
		
		int n = arr.length;
		
		int[] result = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			
			int newPostion = (i + k) % n;
			result[newPostion] = arr[i];
		}
		
		System.out.println(Arrays.toString(result));

	}

}
