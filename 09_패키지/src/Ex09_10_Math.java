
public class Ex09_10_Math {
	public static void main(String[] args) {
		
		int rd = (int)(Math.random()*6)+3;
		System.out.println(rd);
		
		for (int i = 0; i <= 10; i++) {
			rd = (int)(Math.random()*6)+3;
			System.out.println(rd);
		}
		
		char ch = (char)((Math.random()*26)+'A');
		System.out.println(ch);
		
		System.out.println(1);
	}
}
