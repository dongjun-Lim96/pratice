import java.util.Scanner;

public class Ex03_04_ifelse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력:");
		int num = sc.nextInt();
		System.out.println("입력한 숫자:" +num);
		
		if (num%5 ==0) {
			System.out.println("5의 배수");
			
			if (num%10==0) {
				System.out.println("10의 배수");
			}else {
				System.out.println("10의 배수가 아님");
			}
		}else {
			System.out.println("5의 배수가 아님");
		}
		sc.close();
	}
}
