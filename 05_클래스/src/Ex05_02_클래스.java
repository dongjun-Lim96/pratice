
class Book{
	//��ü�� ������ ������
	String title, author;//�������(�ν��Ͻ�����)
	int price;
	static String Publisher ="�ֿ����ǻ�"; //(����)(����)(Ŭ����)(static)����, �������� ��밡��
	//static ������ ��ü ���� ������ ��� ����
}

public class Ex05_02_Ŭ���� {
	public static void main(String[] args) {
		Book bk = new Book();//��ü�� ����� �۾� : instance(�ν��Ͻ�)
		bk.title = "����";
		bk.author = "�ڰ渮";
		bk.price = 5000;
		
		System.out.println(bk.title);
		System.out.println(bk.author);
		System.out.println(bk.price);
		System.out.println(bk.Publisher);
		
		System.out.println();
		
		Book bk2 = new Book();
		bk2.title = "�ڹ�";
		bk2.author = "���ü�";
		bk2.price = 15000;
		
		System.out.println(bk2.title);
		System.out.println(bk2.author);
		System.out.println(bk2.price);
		System.out.println(bk2.Publisher);
		System.out.println(Book.Publisher);
		
	}
}
