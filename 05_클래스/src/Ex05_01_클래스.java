
class Person{
	//Person Ŭ���� ����
	String name="����";//�������
	int age = 10;
	double height = 173;
	//���赵�� ����
	
	public Person() {
		System.out.println("Person ������");
	}
}

public class Ex05_01_Ŭ���� {
	public static void main(String[] args) {
		Person man = new Person();  //��ü ���� (������ �������) (������,���������� man)
		man.name = "�ӵ���";
		man.age = 27;
		man.height = 168;
		
		System.out.println(man);
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		
		Person woman = new Person(); //��������:woman
		woman.name = "������";
		woman.age = 30;
		woman.height = 162.3;
		
		System.out.println(woman);
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
	}
}

//5���� ���� �߿�
//Ŭ������: ***���� ����� ���� �ڷ���(����� ���� �ڷ���)***