import java.util.Scanner;

public class Ex03_03_임동준 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력=>");
		String name = sc.next();
		
		System.out.print("국어 점수=>");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수=>");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수=>");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = (double)sum/3.0; // 263.0/3
		
		System.out.println("---------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);
		System.out.printf("평균: %.2f\n",avg);
		
		System.out.println("---------------------------");
		
		if (90<=avg) {
			System.out.println("학점: A");
		}else if (80<=avg) {
			System.out.println("학점: B");
		}else if (70<=avg) {
			System.out.println("학점: C");
		}else if (60<=avg) {
			System.out.println("학점: D");
		}else System.out.println("학점: F");
		
		System.out.println("---------------------------");
		
		switch ((int)avg/10) {
		case 10: case 9: System.out.println("학점2: A");
		break;
		case 8: System.out.println("학점2: B");
		break;
		case 7: System.out.println("학점2: C");
		break;
		case 6: System.out.println("학점2: D");
		break;
		default: System.out.println("학점2: F");
		break;
		}
		
		sc.close();
	}
}
/*
이름 입력=>아이유
국어 점수=>77
영어 점수=>88
수학 점수=>98
---------------------------
이름	국어	영어	수학
---------------------------
아이유	77	88	98
---------------------------
총점: 263
평균: 87.67
---------------------------
학점=B
if~else

90점 A
80~89 B
c
d
0~59 F학점

switch~case
*/