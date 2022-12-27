import java.util.Scanner;

public class Ex03_05_switch_case {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = sc.nextInt();
		System.out.println("num="+num);

		if (num ==1) {
			System.out.println("1입니다.");
		}
		else if (num==2) {
			System.out.println("2입니다.");
		}
		else if (num==3) {
			System.out.println("3입니다.");
		}
		else 
			System.out.println("1~3사이의 숫자가 아닙니다.");
		
		System.out.println("--------------------------");
		
		switch (num) {
		case 1: System.out.println("1입니다.");
		break;
		case 2: System.out.println("2입니다.");
		break;
		case 3: System.out.println("3입니다.");
		break;
		
		default : System.out.println("해당사항 없음");
		break;
		}
		System.out.println("switch~case 공부중...");

		sc.close();
	}
}

//ctrl+a : 전체선택
//ctrl+l : 줄맞춤
