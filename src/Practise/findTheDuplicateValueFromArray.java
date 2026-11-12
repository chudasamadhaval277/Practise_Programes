package Practise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class findTheDuplicateValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Dhaval", "Jaineel", "Suhani", "Dhaval"};
		
		
		Set<String> unquieNames = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		
		for(String str : name) {
			if(!unquieNames.add(str)) {
				duplicates.add(str);
			}
		}
		
		System.out.println(duplicates.toString());
		
		

	}

}
