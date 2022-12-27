import java.util.Scanner;

public class Ex03_02_ifesle {
	public static void main(String[] args) {
		int num;
		System.out.println("숫자 입력:");
		
		Scanner sc = new Scanner(System.in);
		
		num =sc.nextInt();
		
		System.out.printf("num=%d\n", num);
		
		if (1<=num && num<=10) {
			System.out.println("1에서 10 사이의 수");
		}
		
		else if (11<=num && num<=20) {
			System.out.println("11에서 20 사이의 수");
		}else if (21<=num && num<=30) {
			System.out.println("21에서 30 사이의 수");
		}
		
		System.out.println("if~else 공부중...");
		
		if (num%10==0) {
			System.out.println("10의 배수");
		}
		else if (num%5==0) {
			System.out.println("5의 배수");
		}
		
		sc.close();
	}
}
