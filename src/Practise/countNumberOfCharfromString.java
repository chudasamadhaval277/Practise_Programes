package Practise;

import java.util.LinkedHashMap;
import java.util.Map;


public class countNumberOfCharfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch: name.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		
		System.out.println(sb);

	}

}
