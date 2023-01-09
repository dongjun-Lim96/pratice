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

public class Ex05_22_객체배열입력 {
	public static void main(String[] args) {
		//Person3 p2 = new Person3();
		//Person3 p3 = new Person3();

		Scanner sc = new Scanner(System.in);
		Person3[] arr = new Person3[3];
		
		for(int i=0;i<arr.length;i++) { // 입력 반복
			System.out.print("이름입력:");
			String name = sc.next();

			System.out.print("나이입력:");
			int age = sc.nextInt();
			arr[i] = new Person3(name,age);
		}

		for(int i = 0; i < arr.length; i++) {
			arr[i].display();
		}
		System.out.println("------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// 참조값.toString()
		}
		sc.close();
	}
}

//toString() 메서드는 참조값만 써도(arr[i]) 리턴함 