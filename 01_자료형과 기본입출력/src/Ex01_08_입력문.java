import java.util.Scanner;

public class Ex01_08_�Է¹� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է�=>");
		String name = sc.next();
		System.out.print("���� ����=>");
		int g = sc.nextInt();
		System.out.print("���� ����=>");
		int y = sc.nextInt();
		System.out.print("���� ����=>");
		int s = sc.nextInt();
		
		int result =g+y+s;
		
		System.out.println("----------------------------");
		System.out.println("�̸�\t����\t����\t����");
		System.out.println("----------------------------");
		System.out.printf("%s\t%d\t%d\t%d\n",name,g,y,s);
		System.out.println("----------------------------");
		System.out.println("����: " + result);
		System.out.printf("���%.2f\n",(double)result/3);
		System.out.println("----------------------------");
	}
}
