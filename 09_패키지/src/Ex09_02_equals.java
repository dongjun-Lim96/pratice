class Person{
	private String name;
	private int age;
	private char bloodType;

	public Person(String name, int age, char bloodType) {
		super();
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj; //�ٿ�ĳ���� �� �ض�
			return this.age==p.age && this.bloodType == p.bloodType;
		}else {
			return false;
		}	
	}
}

public class Ex09_02_equals {
	public static void main(String[] args) {

		Person p1 = new Person("����",30,'A');
		Person p2 = new Person("�¿�",50,'A');

		boolean result =  p1.equals(p2);

		if (result) 
			System.out.println("���̿� �������� �����ϴ�.");			
		else
			System.out.println("���̳� �������� ���� �ʽ��ϴ�.");

	}
}
