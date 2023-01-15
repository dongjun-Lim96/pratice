import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;


	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return name+"\t"+tel+"\n";
	}
}

public class Ex10_05_�ӵ��� {
	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();
		String name;
		String tel;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");		


			
			
			int key = sc.nextInt();

			// 1==============================================
			if (key == 1) {
				System.out.print("�̸��� �Է��ϼ���:");
				name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
				tel = sc.next();

				Card input = new Card(name, tel);
				list.add(input);
			}

			// 2==============================================
			else if (key == 2) {
				System.out.print("�̸��� �Է��ϼ���: ");
				name = sc.next();
				boolean flag = false;

				for (int i = 0; i < list.size(); i++) {
					Card c = list.get(i);
					if (c.getName().equals(name)) {
						list.remove(i);
						flag = true;
					}else {
						flag = false;
					}
				}
				if (flag) {
					System.out.println("�����Ǿ����ϴ�.");					
				}else {
					System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");					
				}	
			}

			// 3==============================================
			else if (key == 3) {
				System.out.print("�̸��� �Է��ϼ���: ");
				name = sc.next();
				boolean flag = false;

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						flag = true;
						System.out.print("�����Ͻ� ��ȭ��ȣ��: ");
						tel = sc.next();
						list.get(i).setTel(tel);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}
				if (!flag) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
				}
			}

			// 4==============================================
			else if (key == 4) {
				System.out.println("�̸�"+"\t"+"��ȭ��ȣ");
				for (Card c : list) {
					System.out.println(c.getName()+"\t"+c.getTel());
				}

			}

			// 5==============================================
			else if (key == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			// else==============================================
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		} 
		
		sc.close();
	}
}
