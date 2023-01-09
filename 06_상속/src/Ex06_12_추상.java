
abstract class Shape{ //추상클래스: 아직 완성되지 않았다.
	public Shape() {
		System.out.println("Shape 생성자");
	}
	public void make() { //정의
		System.out.println("도형 그리기");
	}
	
	public abstract void draw(); //미완성 메서드, 추상메서드
	public abstract void delete();
}//추상클래스로는 객체를 만들수가 없다.

//1. abstract 또는
//2. 자식쪽에서 부모의 미완성 메서드 완성시키든가
class Circle extends Shape{
	public Circle() {
		System.out.println("Circle 생성자");
	}
	
	public void draw() {
		System.out.println("원을 그린다");
	}
	public void delete() {
		System.out.println("원을 지운다");
	}
}

//1. abstract 또는
//2. 자식쪽에서 부모의 미완성 메서드 완성시키든가
class Triangle extends Shape{
	public Triangle() {
		System.out.println("Triangel 생성자");
	}
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	public void delete() {
		System.out.println("삼각형을 지운다");
	} 
}

public class Ex06_12_추상 {
	public static void main(String[] args) {
		Shape c = new Circle();
		c.draw();
		c.delete();
		
		System.out.println("================");
		
		Shape t = new Triangle();
		t.draw();
		t.delete();
		
		Shape[] arr = {new Circle(), new Triangle()};
		for (int i = 0; i < arr.length; i++) {
			arr[i].draw();
			arr[i].delete();
		}
	}
}



//추상클래스로는 객체를 만들수가 없다.
//1. abstract 또는
//2. 자식쪽에서 부모의 미완성 메서드 완성시키든가

//추상메서드가 없는 추상클래스는 무조건 상속받도록 하기 위해서 만들어 상용한다.
//추상클래스는 상속 자체만으로 완전한 클래스가 된다.