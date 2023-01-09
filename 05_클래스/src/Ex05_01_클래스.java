
class Person{
	//Person 클래스 선언
	String name="동준";//멤버변수
	int age = 10;
	double height = 173;
	//설계도의 역할
	
	public Person() {
		System.out.println("Person 생성자");
	}
}

public class Ex05_01_클래스 {
	public static void main(String[] args) {
		Person man = new Person();  //객체 생성 (공간이 만들어짐) (참조값,참조변수는 man)
		man.name = "임동준";
		man.age = 27;
		man.height = 168;
		
		System.out.println(man);
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		
		Person woman = new Person(); //참조변수:woman
		woman.name = "아이유";
		woman.age = 30;
		woman.height = 162.3;
		
		System.out.println(woman);
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
	}
}

//5장이 가장 중요
//클래스란: ***내가 만들어 쓰는 자료형(사용자 정의 자료형)***