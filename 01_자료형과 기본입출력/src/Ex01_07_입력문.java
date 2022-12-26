import java.util.Scanner;

public class Ex01_07_입력문 {
	public static void main(String[] args) {
		int a ;
		int b ;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a입력: ");
		a = sc.nextInt();
		
		System.out.print("b입력: ");
		b = sc.nextInt();
		
		System.out.println(a+b);
		
		c =sc.next();
		System.out.print("c입력: " + c);
		
		sc.close();
	}
}
