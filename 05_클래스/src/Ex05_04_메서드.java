
public class Ex05_04_�޼��� {
	public static void main(String[] args) {//main �޼��� ����
		int result = add(3,9);//add�޼��� ȣ�� (12�� �޴´�)add(3,9)==12
		System.out.println("result:"+result);
		
		result = add(200, 193);
		System.out.println("result:"+result);
		
		result = add(123, 456);
		System.out.println("result:"+result);
		
		System.out.println(add(100, 200));
		System.out.println("------------------------");
		
		mul(2, 3.9, 7);
		mul(4, 9, 10);
		
		show();
		//static ���� show ���� �� 
		//Ex05_04_�޼��� ex = new Ex05_04_�޼���();
		//ex.show();
	}
	
	static int add(int a, int b) {//add�޼��� ����
		//int sum = a+b;
		return a+b; //sum;
	}
	
	static void mul(int a, double b,int c) {//mul �޼��� ����
		System.out.println("�� ���� ��:"+a*b*c);
	}	
	
	static void show() {
		System.out.println("show �޼��� ���� �κ�");
	}
}

//�޼���� �׻� Ŭ���� �ȿ� �־�� �Ѵ�.
//main�� ����Ŭ����
//main �޼��忡 static�� ���̴� ������ jvm�� �ν��ϱ� ���ؼ�
//static �޼��忡����(main����) static �޼��常 ȣ�� ����