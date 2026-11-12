package Practise;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama";
		String fullName ="Jaineel Dhaval Chudasama";
		String lastName = "Suhani Dhaval Chuasama";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(sb.indexOf(String.valueOf(ch))== -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
		
		// using distinct function
		
		String result1 = fullName.chars()
		.distinct()
		.mapToObj(c->String.valueOf((char) c))
		.collect(Collectors.joining());
		
		System.out.println(result1);
		
		
		// using linked Hash set
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(char ch1:lastName.toCharArray()) {
			set.add(ch1);
		}
		
		StringBuilder sb1 = new StringBuilder();
		
		for(char ch1 : set) {
			sb1.append(ch1);
		}
		
		System.out.println(sb1);
		

	}

}
