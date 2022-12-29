import java.util.Scanner;

public class Ex04_03_1차원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//국어 영어 수학 점수 입력받아 출력
		
		/*
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mth = sc.nextInt();
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mth);
		*/
		
		
		String[] sub = {"국어점수: ", "영어점수: ", "수학점수: "}; 
		int[] score = new int[3];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(sub[i]);
			score[i] = sc.nextInt();
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		sc.close();
	}
}
