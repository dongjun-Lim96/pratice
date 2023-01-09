
class Member{
	private String id;
	private String passwd;
	
	public Member() { //�⺻ ������
		System.out.println("Member() ������");
		id = "park";
		passwd = "9876";
	}
	
	public Member(String id) { // ������ �����ε�
		System.out.println("Member(String id)");
		this.id = id;
		passwd = "9876";
	}
	
	public Member(String id, String passwd) { // ������ �����ε�
		System.out.println("Member(String id, String passwd)");
		this.id = id;
		this.passwd = passwd;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(passwd);
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPasswd() {
		return passwd;
	}
}

public class Ex05_18_������ {
	public static void main(String[] args) {
		
		Member mb = new Member(); // park => kim  , 9876 => 1234
		
		mb.setId("kim");
		mb.setPasswd("1234");
		
		String id = mb.getId();
		String passwd = mb.getPasswd();
		
		System.out.println(id);
		System.out.println(passwd);
		
		Member mb2 = new Member(); // park, 9876
		mb2.setId("jung");
		mb2.setPasswd("3333");
		System.out.println(mb2.getId());
		System.out.println(mb2.getPasswd());
		
		Member mb3 = new Member("hong", "7777");
		System.out.println(mb3.getId());
		System.out.println(mb3.getPasswd());
		
		Member mb4 = new Member("choi");
		System.out.println(mb4.getId());
		System.out.println(mb4.getPasswd());
		
		System.out.println("-------------");
		
		Member[] arr = {new Member(),new Member(), new Member("hong", "7777"), new Member("choi")};
		arr[0].setId("kim");
		arr[0].setPasswd("1234");
		arr[1].setId("jung");
		arr[1].setPasswd("3333");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getId());
			System.out.println(arr[i].getPasswd());
			System.out.println();
		}
	}
}

/*
������(constructor)
�����ڴ� Ŭ������ �̸��� ���� �޼����.
�����ڴ� �������� �ʴ´�. 
��ü�� ����� �ڵ����� ȣ��Ǵ� �޼���
����Ʈ(�⺻) ������: �����ڴ� ������ �ʾƵ� �⺻�����ڰ� ������� �ִ�.
������ �����ε��� �ϸ� �⺻�����ڴ� ����� ���� �ʴ´�. 
*/