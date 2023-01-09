
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

public class Ex06_10_다형성 {
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
		
		c = fe; //Car 타입 = FireEngine 타입(업캐스팅) | c = (Car)fe; 
		
		System.out.println(c.door); //부모쪽으로 접근, (변수여서) 
		//System.out.println(c.wheel); Car에 wheel이 없음
		System.out.println(c.color);
		c.drive(); //FEdrive~
		c.stop(); // stop!!
		//c.water(); c에 water()가 없다
		
		System.out.println("********************");
		FireEngine fe2; 
		
		if (c instanceof FireEngine) { //c를 FireEngine으로 바꿀수 있나를 물어보는 연산자
			System.out.println("다운캐스팅 가능");
			fe2 = (FireEngine)c; //다운캐스팅 , (업캐스팅을 해야지만 다운캐스팅이 이루어진다. 없으면 에러남)
			System.out.println(fe2.door);
			System.out.println(fe2.wheel);
			System.out.println(fe2.color);
			fe2.drive();
			fe2.stop();
			fe2.water();
		}else {
			System.out.println("다운캐스팅 불가능");
		}		
	}
}

//타입이 다를 떈 변수는 부모클래스쪽으로 접근
//메서드는 자손쪽으로 접근
