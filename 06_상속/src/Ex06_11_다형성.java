class Robot{

}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Ex06_11_다형성 {
	public static void main(String[] args) {
		Robot[] arr = {
				new DanceRobot(),
				new SingRobot(),
				new DrawRobot()
		};

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}

	//Robot r = (Robot)new DanceRobot();
	//Robot r = (Robot)new SingRobot();
	//Robot r = (Robot)new DrawRobot(); 자동 업캐스팅
	
	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			//r.dance(); 부모한테 자식메서드가 없어서 호출이 안된다.
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}
		else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		else if (r instanceof DrawRobot) {
			DrawRobot dw = (DrawRobot)r;
			dw.draw();
		}
	}
}
