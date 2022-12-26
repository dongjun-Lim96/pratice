import java.util.Scanner;

public class Ex01_08_입력문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력=>");
		String name = sc.next();
		System.out.print("국어 점수=>");
		int g = sc.nextInt();
		System.out.print("영어 점수=>");
		int y = sc.nextInt();
		System.out.print("수학 점수=>");
		int s = sc.nextInt();
		
		int result =g+y+s;
		
		System.out.println("----------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------");
		System.out.printf("%s\t%d\t%d\t%d\n",name,g,y,s);
		System.out.println("----------------------------");
		System.out.println("총점: " + result);
		System.out.printf("평균%.2f\n",(double)result/3);
		System.out.println("----------------------------");
	}
}
