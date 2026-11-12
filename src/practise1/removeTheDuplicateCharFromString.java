package practise1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import Practise.findUniqueElementFromArray;

public class removeTheDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama";
		String fullName = "Jaineel Dhaval Chudasama";
		String lastName = "Suhani Dhaval Chudasama";
		StringBuilder sb = new StringBuilder();
		
		for(char ch:name.toCharArray()) {
			
			if(sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
		
		
		// 
		
		String unqieNames = fullName.chars().distinct()
				.mapToObj(c-> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(unqieNames);

		
		
		// 
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(char ch1 : lastName.toCharArray()) {
			
			set.add(ch1);
		}
		
		StringBuilder sb1 = new StringBuilder();
		
		for(char ch2:set) {
			
			sb1.append(ch2);
		}
		
		System.out.println(sb1);
		System.out.println("demo 1");
		
		
	}

}
