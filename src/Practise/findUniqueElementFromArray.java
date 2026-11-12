package Practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findUniqueElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Dhaval", "Suhani", "Jaineel", "Dhaval"};
		
		

		String[] uniqueNames = Arrays.stream(names).distinct()
				.toArray(String[] :: new);

		
		System.out.println(Arrays.toString(uniqueNames));
	}

}
