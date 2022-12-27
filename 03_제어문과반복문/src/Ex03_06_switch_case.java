import java.util.Scanner;

public class Ex03_06_switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일: ");
		String fruit = sc.next();
		System.out.println("과일이름: " + fruit);
		
		switch (fruit) {
		case "banana": System.out.println("바나나");
			break;
		case "lemon" : System.out.println("레몬");
			break;
		case "apple" : System.out.println("사과");
			break;
		default: System.out.println("그 밖의 과일");
			break;
		}
		
		sc.close();
	}
}

//switch문은 정수나 문자열 키로만 가능 (실수는 안된다.) 