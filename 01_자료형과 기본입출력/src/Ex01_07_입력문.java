import java.util.Scanner;

public class Ex01_07_�Է¹� {
	public static void main(String[] args) {
		int a ;
		int b ;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�Է�: ");
		a = sc.nextInt();
		
		System.out.print("b�Է�: ");
		b = sc.nextInt();
		
		System.out.println(a+b);
		
		c =sc.next();
		System.out.print("c�Է�: " + c);
		
		sc.close();
	}
}
