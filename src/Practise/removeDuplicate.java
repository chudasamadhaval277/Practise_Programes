package Practise;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Dhaval Ahaybhai Chudasama";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(sb.indexOf(String.valueOf(ch)) == -1) {
				
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
	}

}
