import java.util.Scanner;

class Person3{
	private String name;
	private int age;

	public Person3() {

	}

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(name+" "+age);
	}
	
	public String toString() {
		return name+","+age;
	}
}

public class Ex05_22_��ü�迭�Է� {
	public static void main(String[] args) {
		//Person3 p2 = new Person3();
		//Person3 p3 = new Person3();

		Scanner sc = new Scanner(System.in);
		Person3[] arr = new Person3[3];
		
		for(int i=0;i<arr.length;i++) { // �Է� �ݺ�
			System.out.print("�̸��Է�:");
			String name = sc.next();

			System.out.print("�����Է�:");
			int age = sc.nextInt();
			arr[i] = new Person3(name,age);
		}

		for(int i = 0; i < arr.length; i++) {
			arr[i].display();
		}
		System.out.println("------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// ������.toString()
		}
		sc.close();
	}
}

//toString() �޼���� �������� �ᵵ(arr[i]) ������ 