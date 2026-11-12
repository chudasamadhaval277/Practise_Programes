package Practise;

import java.util.stream.Collectors;

public class removeDuplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Dhaval Ajaybhai Chudasama";
		
		String result = name.chars()
				.distinct()
				.mapToObj(c-> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(result);
	}
	
	

}
