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

public class Ex05_05_�޼��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1:");
		int num1 = sc.nextInt();
		
		System.out.print("����2:");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result  = cal.sum(num1, num2);
		System.out.println("result:"+result);
		/*System.out.println("sub���:"+cal.sub(num1, num2));*/
		//System.out.println("���:"+cal.sum(num1, num2));
		
		int result1 = Calculator.sub(num1, num2);//static �޼���� Ŭ������ �ٷ� ����
		System.out.println("sub���:"+result1	);
		
		System.out.println("ū ��:"+Calculator.max(num1, num2));
		
		sc.close();
	}
}
