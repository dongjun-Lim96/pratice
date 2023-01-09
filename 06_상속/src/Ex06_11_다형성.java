class Robot{

}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Ex06_11_������ {
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
	//Robot r = (Robot)new DrawRobot(); �ڵ� ��ĳ����
	
	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			//r.dance(); �θ����� �ڽĸ޼��尡 ��� ȣ���� �ȵȴ�.
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
