package Practise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class findUniqueElementFromArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Dhaval", "Jaineel", "Suhani", "Jaineel"};
		
		String[] uniqueNames = Arrays.stream(names).distinct()
				.toArray(String[] :: new);
		
		System.out.println(Arrays.toString(uniqueNames));

	}

}
