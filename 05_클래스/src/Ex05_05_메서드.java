import java.util.Scanner;

class Calculator{
	
	int sum(int x, int y) {
		return x+y;
	}
	/*
	int sub(int x, int y) {
		return x-y;
	}*/
	
	static int sub(int x, int y) {
		return x-y;
	}
	
	static int max(int x, int y) {
		if (x>y) 
			return x;
		else 
			return y;
	}
}

public class Ex05_05_메서드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result  = cal.sum(num1, num2);
		System.out.println("result:"+result);
		/*System.out.println("sub결과:"+cal.sub(num1, num2));*/
		//System.out.println("결과:"+cal.sum(num1, num2));
		
		int result1 = Calculator.sub(num1, num2);//static 메서드는 클래스로 바로 접근
		System.out.println("sub결과:"+result1	);
		
		System.out.println("큰 수:"+Calculator.max(num1, num2));
		
		sc.close();
	}
}
