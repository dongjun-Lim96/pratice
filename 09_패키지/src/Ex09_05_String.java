
public class Ex09_05_String {
	public static void main(String[] args) {

		String str = "slow and steady wins the race";

		//System.out.println(str.charAt(5));
		char ch = str.charAt(5);
		//System.out.println(ch);


		int[] alpha = new int[26];
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			//System.out.println(ch+":"+(int)ch);
//			if (ch >='A' && ch <= 'z') {
//				alpha[ch-65]++;
//			}
			if (ch >='a' && ch <= 'z') 
				alpha[ch-97]++;
			
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println((char)(i+97)+":"+alpha[i]);
		}
	}
}
	//A == 65
	//a == 97
	//a:3
	//b:0
	//z:0