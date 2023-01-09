
class Person2{ //-------------------person2
	private String name;
	private int age;

	public Person2() {

	}

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}//======================person2

class Employee2 extends Person2{ //------------------employee2
	private String company;
	private String part;

	public Employee2() {
		
	}
	
	public Employee2(String name, int age, String company, String part) {
		super(name, age);
		this.company = company;
		this.part = part;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("company:"+ company);
		System.out.println("part:"+ part);
	}
}	//================ employee2

class Teacher extends Employee2{ //--------------teacher
	//private String name;
	//private int age;
	//private String company;
	//private String part;
	private String subject;
	
	public Teacher(String name, int age, String company, String part, String subject) {
		super("�¿�", 50, "SM��", "��Ȱ������");
		this.subject = subject;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("subject"+subject);
	}
}//================teacher

public class Ex06_04_��� {
	public static void main(String[] args) {
		Person2 p = new Person2("����",20);
		p.show();

		System.out.println("----------------");
		Employee2 e =  new Employee2("����", 30, "�ֿ����ǻ�", "�λ��");
		e.show();
		
		System.out.println("----------------");
		Teacher t = new Teacher("�¿�", 50, "SM��", "��Ȱ������", "����");
		t.show();
		
		System.out.println("****************************");
		
		Person2[] arr = {
				new Person2("����",20),
				new Employee2("����", 30, "�ֿ����ǻ�", "�λ��"),
				new Teacher("�¿�", 50, "SM��", "��Ȱ������", "����")
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
			System.out.println();
		}
	}
}
