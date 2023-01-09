import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math;
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double avg(int a, int b, int c) {
		return (double)(a+b+c)/3;
	}
	//합계를 리턴하는 sum 메서드 정의
	//평균 리턴하는 avg 메서드 정의
}

public class Ex05_07_임동준 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("이름입력:");
		st.name = sc.next();
		System.out.print("국어입력:");
		st.kor = sc.nextInt();
		System.out.print("영어입력:");
		st.eng = sc.nextInt();
		System.out.print("수학입력:");
		st.math = sc.nextInt();
		//입력받은 4가지 값 모두 출력
		
		System.out.println("합계출력:"+st.add(st.kor, st.eng, st.math));		
		//합계출력
		
		System.out.printf("평균출력: %.2f", st.avg(st.kor, st.eng, st.math));
		//평균출력(소수 아래 2자리 까지 출력)
	}
}
