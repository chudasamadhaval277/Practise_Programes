package Practise;

import java.util.HashSet;
import java.util.Set;

public class findTheDuplicateValueFromArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Dhaval", "Suhani", "Jaineel", "Dhaval"};
		
		Set<String> uniqueNames = new HashSet<>();
		
		Set<String> duplicateNames = new HashSet<>();
		
		for(String str:names) {
			if(!uniqueNames.add(str)) {
				duplicateNames.add(str);
			}
		}
		
		System.out.println(duplicateNames.toString());
	}

}
