
class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("�۸�");
	}
	public void bark2() {
		System.out.println("�۸�");
	}
}

public class Ex06_09_������ {
	public static void main(String[] args) {
		
		int i =(int)3.3; //double(8����Ʈ) => int(4����Ʈ)�� �ٿ�ĳ����, ����������� 
		double j = 3; //int(4) => double(8) => ��ĳ���� 3 => 3.0, �ڵ��̴�.
		System.out.println(i);
		System.out.println(j);
		
		
		Animal a = new Animal();
		a.bark();
		
		Dog d = new Dog();
		d.bark();
		d.bark2();
		
		Animal d2 = new Dog(); //��Ӱ��� �ϋ��� ��밡��, Dog(�ڽ�)=>Animal(�θ�) ��ĳ����(�ڵ�)
		d2.bark(); //�ڽ� �޼��� ���
		//d2.bark2(); //���Ұ�, �θ𿡰� bark2�� ����.
		
		d = (Dog)d2; //Dog(�ڽ�) = Animal(�θ�) �ٿ�ĳ������ ���� �����
		d.bark();
	}
}


//�θ�Ÿ���� ���������� �ڽİ�ü ���� ����