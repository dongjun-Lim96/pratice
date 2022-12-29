import java.util.Scanner;

public class Ex04_08_임동준 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int stuno;
		int[] scores = null;
		
		while(true) {
			System.out.println("==================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("==================================");
			System.out.print("선택>");
			int selectno = sc.nextInt();
			if (selectno == 1) {
				System.out.print("학생수>");
				stuno = sc.nextInt();
				scores = new int[stuno];
			}
			else if (selectno == 2) {
				System.out.print("선택>2");
				
			}
			else if (selectno == 3) {
				for (int i = 0; i < scores.length; i++) {
					
				}
			}
			else if (selectno == 4) {

			}
			else if(selectno == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}

/*
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>1
학생수>3
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>2
scores[0]>77
scores[1]>43
scores[2]>98
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:77
scores[1]:43
scores[2]:98
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>4
최고점수:98
최하점수:43
평균:72

정렬한 결과
43 77 98 
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>5
프로그램 종료
*/
