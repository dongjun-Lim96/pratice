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

public class Ex09_04_임동준 {
	public static void main(String[] args) {

		Person2[] arr = {
				new Person2("kim","1234","김연아"),
				new Person2("son","7777","손흥민"),
				new Person2("jo","9876","조규성")
		};

		Scanner sc= new Scanner(System.in);

		do {
			int loop = 0;
			System.out.print("id입력:");
			String id = sc.next();
			if (id.length() > 8 || id.length() < 2) {
				System.out.println("id는 2글자~8글자 입력해야 합니다.");
				continue;
			}else {
				
				for (int i = 0; i < arr.length; i++) {
					if (id.equals(arr[i].getId())) {
						System.out.print("pw입력:");
						String pw = sc.next();
						if (pw.equals(arr[i].getPw())) {
							System.out.println(arr[i].getName()+"님 반갑습니다.");
						}else {
							System.out.println("비번이 맞지 않습니다.");
						}
					}else {
						loop++;
					}
				}
				if (loop == arr.length) {
					System.out.println("일치하는 id가 없습니다.");
					continue;
				}
			}

			System.out.print("계속?");
			String key = sc.next();
			if (key.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} while (true);

	}
}