
abstract class Shape{ //�߻�Ŭ����: ���� �ϼ����� �ʾҴ�.
	public Shape() {
		System.out.println("Shape ������");
	}
	public void make() { //����
		System.out.println("���� �׸���");
	}
	
	public abstract void draw(); //�̿ϼ� �޼���, �߻�޼���
	public abstract void delete();
}//�߻�Ŭ�����δ� ��ü�� ������� ����.

//1. abstract �Ǵ�
//2. �ڽ��ʿ��� �θ��� �̿ϼ� �޼��� �ϼ���Ű�簡
class Circle extends Shape{
	public Circle() {
		System.out.println("Circle ������");
	}
	
	public void draw() {
		System.out.println("���� �׸���");
	}
	public void delete() {
		System.out.println("���� �����");
	}
}

//1. abstract �Ǵ�
//2. �ڽ��ʿ��� �θ��� �̿ϼ� �޼��� �ϼ���Ű�簡
class Triangle extends Shape{
	public Triangle() {
		System.out.println("Triangel ������");
	}
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
	public void delete() {
		System.out.println("�ﰢ���� �����");
	} 
}

public class Ex06_12_�߻� {
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



//�߻�Ŭ�����δ� ��ü�� ������� ����.
//1. abstract �Ǵ�
//2. �ڽ��ʿ��� �θ��� �̿ϼ� �޼��� �ϼ���Ű�簡

//�߻�޼��尡 ���� �߻�Ŭ������ ������ ��ӹ޵��� �ϱ� ���ؼ� ����� ����Ѵ�.
//�߻�Ŭ������ ��� ��ü������ ������ Ŭ������ �ȴ�.