import java.util.Scanner;

public class Ex03_01_ifelse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("a 입력:");
		int a = sc.nextInt();
		System.out.print("b 입력:");
		int b = sc.nextInt();
		
		System.out.println("a="+a+", b+"+b);
		
		/*
		 if(조건문){
		 	참일떄 실행할 문장
		 }
		 else{
		 	조건문이 참이 아닐때 처리되는 부분
		 }
		 */
		
		if (a>b) { 
			System.out.println("a가 b보다 크다.");
			System.out.println("하하하");
		}
			//한줄만 있을 떈 중괄호 없어도 되지만 두줄 이상부턴 중괄호 필요 
		else if (a<b) {
			System.out.println("b가 a보다 크다.");
			System.out.println("호호호");
		} else {
			System.out.println("a와 b는 같다.");
			System.out.println("히히히");
		}
		
		System.out.println("if문 공부중..");
		sc.close();
	}
}
