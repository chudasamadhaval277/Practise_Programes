package Practise;

import java.util.LinkedHashSet;

public class removeDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch: name.toCharArray()) {
			set.add(ch);
		}
		
		for(char ch1: set) {
			sb.append(ch1);
		}
		
		System.out.println(sb);

	}

}
