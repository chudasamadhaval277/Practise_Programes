package practise1;

public class reverseStringwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dhaval Ajaybhai Chudasama";
		String[] names = name.split(" ");
		
		String result = "";
		
		for(int i=names.length-1;i>=0;i--) {
			
			result += names[i];
		}
		
		System.out.println(result);
		System.out.println("demo 1");

	}

}
