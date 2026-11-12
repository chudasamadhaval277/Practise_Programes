package Practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class findTheCapitalLetterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama";
		int count = 0;
		
		
		
		for(char ch:name.toCharArray()) {
			
			if(Character.isUpperCase(ch)) {
				count++;
				System.out.println("Capital Letter from String ::"+ch);
			}
		}
		System.out.println(count);
		
		
		

	}

}
