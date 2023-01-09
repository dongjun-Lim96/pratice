
class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("멍멍");
	}
	public void bark2() {
		System.out.println("멍멍");
	}
}

public class Ex06_09_다형성 {
	public static void main(String[] args) {
		
		int i =(int)3.3; //double(8바이트) => int(4바이트)로 다운캐스팅, 직접해줘야함 
		double j = 3; //int(4) => double(8) => 업캐스팅 3 => 3.0, 자동이다.
		System.out.println(i);
		System.out.println(j);
		
		
		Animal a = new Animal();
		a.bark();
		
		Dog d = new Dog();
		d.bark();
		d.bark2();
		
		Animal d2 = new Dog(); //상속관계 일떄만 사용가능, Dog(자식)=>Animal(부모) 업캐스팅(자동)
		d2.bark(); //자식 메서드 사용
		//d2.bark2(); //사용불가, 부모에게 bark2는 없다.
		
		d = (Dog)d2; //Dog(자식) = Animal(부모) 다운캐스팅은 직접 써야함
		d.bark();
	}
}


//부모타입의 참조변수로 자식객체 관리 가능