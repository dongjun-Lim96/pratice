import java.util.ArrayList;
import java.util.Iterator;

class Person{
	private String id;
	private String pw;
	
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return id+"/"+pw;
	}
}

public class Ex10_03_ArrayList {
	public static void main(String[] args) {
		
		Person p1 = new Person("kim", "1111");
		Person p2 = new Person("park", "3333");
		Person p3 = new Person("choi", "5555");
		
		ArrayList<Person> list = new ArrayList<Person>(); //ArrayList�� ��ü�� ���´�
		list.add(p1);
		list.add(p2);
		list.add(new Person("choi", "5555")); //�̷��͵� ����
		
		System.out.println(list); //object�� toString�� ȣ��Ǽ� �������� ��µȴ�.
		//[ , , ] ,���̻��̿� ����� toString�� ȣ��ȴ�.
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);
		}
		System.out.println();
		
		Iterator<Person> iter = list.iterator(); // ArrayList�� �ݺ��� �޼��� Iterator�� �޴´�
		while (iter.hasNext()) { // �ݺ��Ұ� ���ҳ�? �������� true
			Person p = iter.next(); //������ �������� (�׻� ���� ���� hasNext(),next())
			System.out.println(p.getId()+":"+p.getPw());
		}
	}
}
