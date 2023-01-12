class Student{ // extends Object 자동 상속
	private String name;
	private int hakbun;

	public Student(String name, int hakbun) {
		super();
		this.name = name;
		this.hakbun = hakbun;
	}

	@Override
	public String toString() {
		return name+"/"+hakbun;
	}
	@Override
	public boolean equals(Object obj) { //Object 앞에 this,가 숨어있다
		//Object obj = new Student(name, hakbun)	
		if (obj instanceof Student) {			
			Student s = (Student)obj;//처음부터 obj로 Student를 받던가 아니면 다운캐스팅 하던가
			return this.hakbun == s.hakbun && this.name.equals(s.name); //정국 학번 == 슈가학번 
		}else {
			return false;
		}
	}
}

public class Ex09_01_toString {
	public static void main(String[] args) {
		Student s1 = new Student("정국", 2000);
		Student s2 = new Student("슈가", 2000);

		//		System.out.println(s1.str());
		//		System.out.println(s2.str());

		System.out.println(s1.toString());
		System.out.println(s1);//참조변수만 써도 자동으로 toString이 붙는다.
		System.out.println(s2.toString());
		System.out.println(s2);
		boolean result = s1.equals(s2);
		System.out.println("result:"+result);
	}
}

//Object: 최상위 클래스 모든 클래스의 조상격
//toString() 기능: 주소 문자열 리턴, 재정의 하면 원하는 문자열 리턴
//public boolean equals​(Object obj) 기능: 주소 비교
