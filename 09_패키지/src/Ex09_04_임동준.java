import java.util.Iterator;
import java.util.Scanner;

class Person2{
	private String id;
	private String pw;
	private String name;

	public Person2(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}

}

public class Ex09_04_�ӵ��� {
	public static void main(String[] args) {

		Person2[] arr = {
				new Person2("kim","1234","�迬��"),
				new Person2("son","7777","�����"),
				new Person2("jo","9876","���Լ�")
		};

		Scanner sc= new Scanner(System.in);

		do {
			int count = 0;
			System.out.print("id�Է�:");
			String id = sc.next();
			
			if (id.length() > 8 || id.length() < 3) {
				System.out.println("id�� 3����~8���� �Է��ؾ� �մϴ�.");
				continue;
			}

			for (Person2 p : arr) {
				if (id.equals(p.getId())) {
					System.out.print("pw�Է�:");
					String pw = sc.next();

					if (pw.equals(p.getPw())) {
						System.out.println(p.getName()+"�� �ݰ����ϴ�.");
					}else {
						System.out.println("����� ���� �ʽ��ϴ�.");
						continue;
					}
				}else {
					count++;
				}
				if (count == arr.length) {
					System.out.println("��ġ�ϴ� id�� �����ϴ�.");
					continue;
				}
			}

			System.out.print("���?:");
			String key = sc.next();
			if (key.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		} while (true);
	}
}