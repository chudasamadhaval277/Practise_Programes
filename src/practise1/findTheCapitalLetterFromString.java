package practise1;

import java.util.HashSet;
import java.util.Set;

public class findTheCapitalLetterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama Dhaval";
		
		Set<Character> set = new HashSet<>();
		
		for(char ch:name.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				System.out.println("Capital Letter from String::"+ch);
			}
		}

	}

}
