import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math;
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double avg(int a, int b, int c) {
		return (double)(a+b+c)/3;
	}
	//�հ踦 �����ϴ� sum �޼��� ����
	//��� �����ϴ� avg �޼��� ����
}

public class Ex05_07_�ӵ��� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("�̸��Է�:");
		st.name = sc.next();
		System.out.print("�����Է�:");
		st.kor = sc.nextInt();
		System.out.print("�����Է�:");
		st.eng = sc.nextInt();
		System.out.print("�����Է�:");
		st.math = sc.nextInt();
		//�Է¹��� 4���� �� ��� ���
		
		System.out.println("�հ����:"+st.add(st.kor, st.eng, st.math));		
		//�հ����
		
		System.out.printf("������: %.2f", st.avg(st.kor, st.eng, st.math));
		//������(�Ҽ� �Ʒ� 2�ڸ� ���� ���)
	}
}
