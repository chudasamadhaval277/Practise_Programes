package Practise;

public class reverseStringArray {
	
	
	public static void main(String[] args) {
		
		
		String name = "Dhaval Ajaybhai Chudasama";
		String[] name1 = name.split(" ");
		String result = "";
		
		for(int i=name1.length-1;i>=0;i--) {
			result = result + name1[i];
		}
		
		System.out.println(result);
	}
	
	

}
