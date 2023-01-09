
class Parent{
	int x = 10;
	
	void method() {
		System.out.println("P_x="+x);
	}
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		int x = 30;
		System.out.println("x="+x); //지역변수
		System.out.println("this.x="+this.x); //멤버변수
		System.out.println("super.x="+super.x); //부모멤버변수
		super.method();
	}
}

public class Ex06_01_super {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		
	}
}
