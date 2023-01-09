
class Person{
	private String name;
	private int age;

	public Person() {
		System.out.println("Person() 생성자");
	}

	public Person(String name, int age) {
		System.out.println("Person(String name, int age) 생성자");
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}

class Student extends Person{
	//	private String name;
	//	private int age;
	private String school;

	public Student() {
		super(); //super()는 항상 맨 위에 써야한다.
		//부모의 생성자 호출 (안 써도 저절로 들어온다)
		//System.out.println("Student() 생성자");
	}

	public Student(String name, int age, String school) {
		super(name,age); //부모 생성자 하나만 호출 가능, (생성자 안에서만 생성자 호출 가능, 다른곳에서 호출 x)
		System.out.println("Student(String name, int age, String school) 생성자");
		this.school = school;		
	}
	@Override
	public void show() { //메소드 오버라이딩(overriding)
		super.show();
		System.out.println("shcool:"+ school);
	}
}

class Employee extends Person{
	private String company;
	private String part;
	
	public Employee(String name, int age, String company, String part) {
		super(name, age);
		this.company = company;
		this.part = part;
	}
	
	public void show() {
		super.show();
		System.out.println("company:"+ company);
		System.out.println("part:"+ part);
	}
}

public class Ex06_03_super {
	public static void main(String[] args) {
		Person p = new Person("철수",20);		
		p.show();

		System.out.println("-----------------");
		Student s = new Student("수영",30,"쌍용고");//자식 생성자를 만들 때 부모 생성자도 자동 생성
		s.show();
		
		System.out.println("-----------------");
		Employee e = new Employee("정국",37,"현대","개발부");
		e.show();
	}
}


//메소드 오버라이딩: 상속받는 클래스에 맞게 메서드의 내용을 변경 하는 것
//조건: 선언부가 같아야한다. (이름,매개변수타입, 리턴타입 등등)
//접근제어자를 좁은 범위로 변경할 수 없다.
//오버라이딩은 상속개념 오버로딩은 클래스 내에서