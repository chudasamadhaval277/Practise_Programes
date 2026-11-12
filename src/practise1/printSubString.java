package practise1;

public class printSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		for(int i=0;i<str.length();i++) {
			
			StringBuilder sb = new StringBuilder();
			
			for(int j=i;j<str.length();j++) {
				sb.append(str.charAt(j));
				System.out.println(sb);
			}
			
		}

		System.out.println("demo 1");

	}

}
