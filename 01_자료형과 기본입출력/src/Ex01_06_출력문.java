
public class Ex01_06_��¹� {
	public static void main(String[] args) {
		int a = 123;
		char b = 'A';
		float c = 98.765f;
		String d = "�ӵ���";
		
		System.out.println("a="+123);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println();
		
		System.out.printf("a=%5d\n",a);
		System.out.printf("b=%c\n",b);
		System.out.printf("b=%d\n",(int)b);
		System.out.printf("c=%.2f\n",c);
		System.out.printf("d=%s\n",d);
		
		System.out.println("�ȳ��ϼ��� \t���� �̸��� \"�ӵ���\"�Դϴ�");
		System.out.println("�ȳ�\\�ϼ��� ���� �̸��� �ӵ����Դϴ�");
		//�������� �� ���� ������ \�ѹ��� "\\"
		
		
	}
}


/*
 ���Ĺ���
����: %d
����: %c
�Ǽ�: %f ���� (%.����f�� �Ҽ��� ���� ��ŭ��)
%���� : ���ڸ�ŭ ��
%t : �Ǳ��
%n : �ٹٲ�
" : "�� ����ϰ� ������ \"
*/