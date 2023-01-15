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

public class Ex10_05_임동준 {
	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();
		String name;
		String tel;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");		


			
			
			int key = sc.nextInt();

			// 1==============================================
			if (key == 1) {
				System.out.print("이름을 입력하세요:");
				name = sc.next();
				System.out.print("전화번호를 입력하세요:");
				tel = sc.next();

				Card input = new Card(name, tel);
				list.add(input);
			}

			// 2==============================================
			else if (key == 2) {
				System.out.print("이름을 입력하세요: ");
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
					System.out.println("삭제되었습니다.");					
				}else {
					System.out.println("일치하는 이름이 없습니다.");					
				}	
			}

			// 3==============================================
			else if (key == 3) {
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				boolean flag = false;

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						flag = true;
						System.out.print("수정하실 전화번호는: ");
						tel = sc.next();
						list.get(i).setTel(tel);
						System.out.println("수정되었습니다.");
					}
				}
				if (!flag) {
					System.out.println("이름을 잘못 입력하셨습니다.");
				}
			}

			// 4==============================================
			else if (key == 4) {
				System.out.println("이름"+"\t"+"전화번호");
				for (Card c : list) {
					System.out.println(c.getName()+"\t"+c.getTel());
				}

			}

			// 5==============================================
			else if (key == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// else==============================================
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		} 
		
		sc.close();
	}
}
