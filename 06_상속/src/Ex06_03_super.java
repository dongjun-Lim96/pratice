
class Person{
	private String name;
	private int age;

	public Person() {
		System.out.println("Person() ������");
	}

	public Person(String name, int age) {
		System.out.println("Person(String name, int age) ������");
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
		super(); //super()�� �׻� �� ���� ����Ѵ�.
		//�θ��� ������ ȣ�� (�� �ᵵ ������ ���´�)
		//System.out.println("Student() ������");
	}

	public Student(String name, int age, String school) {
		super(name,age); //�θ� ������ �ϳ��� ȣ�� ����, (������ �ȿ����� ������ ȣ�� ����, �ٸ������� ȣ�� x)
		System.out.println("Student(String name, int age, String school) ������");
		this.school = school;		
	}
	@Override
	public void show() { //�޼ҵ� �������̵�(overriding)
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
		Person p = new Person("ö��",20);		
		p.show();

		System.out.println("-----------------");
		Student s = new Student("����",30,"�ֿ��");//�ڽ� �����ڸ� ���� �� �θ� �����ڵ� �ڵ� ����
		s.show();
		
		System.out.println("-----------------");
		Employee e = new Employee("����",37,"����","���ߺ�");
		e.show();
	}
}


//�޼ҵ� �������̵�: ��ӹ޴� Ŭ������ �°� �޼����� ������ ���� �ϴ� ��
//����: ����ΰ� ���ƾ��Ѵ�. (�̸�,�Ű�����Ÿ��, ����Ÿ�� ���)
//���������ڸ� ���� ������ ������ �� ����.
//�������̵��� ��Ӱ��� �����ε��� Ŭ���� ������