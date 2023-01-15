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
		
		ArrayList<Person> list = new ArrayList<Person>(); //ArrayList는 객체만 들어온다
		list.add(p1);
		list.add(p2);
		list.add(new Person("choi", "5555")); //이런것도 가능
		
		System.out.println(list); //object의 toString이 호출되서 참조값이 출력된다.
		//[ , , ] ,사이사이에 요소의 toString이 호출된다.
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);
		}
		System.out.println();
		
		Iterator<Person> iter = list.iterator(); // ArrayList를 반복할 메서드 Iterator가 받는다
		while (iter.hasNext()) { // 반복할게 남았나? 남았으면 true
			Person p = iter.next(); //다음거 가져오기 (항상 같이 쓴다 hasNext(),next())
			System.out.println(p.getId()+":"+p.getPw());
		}
	}
}
