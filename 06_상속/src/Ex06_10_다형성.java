
class Car{
	String color = "white";
	int door = 4;
	
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	int door  = 6;
	int wheel = 10;
	
	void drive() {
		System.out.println("FEdrive~");
	}
	void water() {
		System.out.println("water!!");
	}
}

public class Ex06_10_������ {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
		System.out.println("-----------------");
		
		FireEngine fe = new FireEngine();
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		fe.drive();
		fe.stop();
		fe.water();
		System.out.println("-----------------");
		
		c = fe; //Car Ÿ�� = FireEngine Ÿ��(��ĳ����) | c = (Car)fe; 
		
		System.out.println(c.door); //�θ������� ����, (��������) 
		//System.out.println(c.wheel); Car�� wheel�� ����
		System.out.println(c.color);
		c.drive(); //FEdrive~
		c.stop(); // stop!!
		//c.water(); c�� water()�� ����
		
		System.out.println("********************");
		FireEngine fe2; 
		
		if (c instanceof FireEngine) { //c�� FireEngine���� �ٲܼ� �ֳ��� ����� ������
			System.out.println("�ٿ�ĳ���� ����");
			fe2 = (FireEngine)c; //�ٿ�ĳ���� , (��ĳ������ �ؾ����� �ٿ�ĳ������ �̷������. ������ ������)
			System.out.println(fe2.door);
			System.out.println(fe2.wheel);
			System.out.println(fe2.color);
			fe2.drive();
			fe2.stop();
			fe2.water();
		}else {
			System.out.println("�ٿ�ĳ���� �Ұ���");
		}		
	}
}

//Ÿ���� �ٸ� �� ������ �θ�Ŭ���������� ����
//�޼���� �ڼ������� ����
