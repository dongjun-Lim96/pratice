import java.util.Scanner;

public class Ex05_12_�ӵ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����1:");
		int num1 = sc.nextInt();

		System.out.print("����2:");
		int num2 = sc.nextInt();
		sc.close();

		int result = power(num1, num2);
		System.out.println("result:"+result);
		System.out.println(num1+"�� "+num2+"���� "+result+"�Դϴ�.");
		
		result = re(num1, num2);
		System.out.println(result);
		
		double result2 = Math.pow(num1, num2);
		System.out.println(result2);
		
	}//main

	static int power(int a, int b) {

		if (b==1) {
			return a;
		}else 
			return a*power(a, b-1);
	}
	
	static int re(int a, int b) {
		int result =1 ;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
}

/*
 ���ȣ���
 ����1:2
 ����2:6
 result:64
 2�� 6���� 64�Դϴ�.
 */
