import static java.lang.Math.*; //����ƽ ������ Math ��������

public class Ex09_10_Math {

	public static void main(String[] args) {

		//		3~8 ������ ���� ���� �߻�

		double d = Math.random(); // 0<= d < 1
		System.out.println(d);

		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random() * 6) + 3;
			// 0*6 <= d < 1*6 => 
			//		0 <= d <5.999999
			//		0+3 <= d <=5+3
			//		3 <= d <= 8
			System.out.println(n);
		}

		//		A(65)~Z(90) ���
		//		90-65+1=26
		char x = (char)((Math.random() * 26)+ 'A');
		System.out.println(x);

		//		3~7 : 7~3+1=5��
		//		3���� 3 4 5 6 7
		
		
		System.out.println(1.1);

		long m1 = Math.round(4.3);
		System.out.println(m1);
		
		m1 = Math.round(4.9); //�ݿø� �޼���
		System.out.println(m1);
		
		double m2 = Math.ceil(4.3);
		System.out.println(m2);
		
		 m2 = Math.ceil(4.3); //�ø� �޼���
		System.out.println(m2);
		
		double m3 = Math.floor(4.9); //���� �޼���
		System.out.println(m3);
		
	}

}
