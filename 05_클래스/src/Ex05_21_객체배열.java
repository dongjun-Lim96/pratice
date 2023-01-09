
class Student2{
	private String name;
	private int kor, eng, math;
	
	public void display() {
		System.out.println(name+","+kor+","+eng+","+math);
	}
	
	public Student2() {
		name = "½á´Ï";
		kor = 10;
		eng = 20;
		math = 30;
	}
	
	public Student2(String name) {
		this.name = name;
		kor = 50;
		eng = 50;
		math = 59;
	}
	
	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor =kor;
		this.eng = eng;
		this.math = math;
	}
}

public class Ex05_21_°´Ã¼¹è¿­ {
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		Student2 s2 = new Student2("ÅÂ¿¬");
		Student2 s3 = new Student2("À±¾Æ",70,80,90);
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("----------------");
		
		//Student2[] arr = new Student2[3];
		//arr[0] = new Student2();
		//arr[1] = new Student2("ÅÂ¿¬");
		//arr[2] = new Student2("À±¾Æ",70,80,90);
		Student2[] arr = {new Student2(), new Student2("ÅÂ¿¬"), new Student2("À±¾Æ",70,80,90)};
		
		//for (int i = 0; i < arr.length; i++) {
		//	arr[i].display();
		//}
		
		for (Student2 s : arr) {
			s.display();
		}
		
	}
}
