
public class Ex01_04_�Ǽ��� {
	public static void main(String[] args) {
		float a = 1.1f;
		double b = 2.2;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		float f1 = 0.0012300f;
		System.out.println("f1: " + f1);
		
		float f2 = 1.123456789f; //�ݿø� 1.1234568
		System.out.println("f2: " + f2);
		
		float f3 = 123; //4����Ʈ <- 4����Ʈ ����
		System.out.println("f3: " + f3);
		
		int i4 = (int)1.23f; //4����Ʈ <- 4����Ʈ���� float�� �� ũ�ٰ� �ν�
		System.out.println("i4: " + i4);
		
		double d1 = 0.123e4;
		System.out.println("d1: " +d1);
		
		double d2 = 0.123e-2;
		System.out.println("d2: " +d2);
	}
}


/*�Ǽ��� �׳� ���� double �ڷ������� �ν� float�� ������ f�� ����
 8����Ʈ �ڷḦ 4����Ʈ�� �� ������ �����ϱ�
 ������ type mismatch ��
 �Ǽ� �ڷ����� �׳� �Ǽ��� ������ 8����Ʈ�� �Ҵ��
 */
