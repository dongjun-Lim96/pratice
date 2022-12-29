
public class Ex04_05_임동준 {
	public static void main(String[] args) {
		int[][] score = {
				{80,87,84},
				{97,51,88},
				{41,88,53},
				{99,98,100},
				{55,45,68}	
		};
		int sum=0;
		double avg=0;
		
		System.out.println("번호"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+" ");
		System.out.println("================================================");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
				avg=(double)sum/score[j].length;
			}
			System.out.printf("%d \t %.2f",sum,avg);
			System.out.println();
			sum = 0;
			avg = 0;
		}
		System.out.println("================================================");
		sum=0;
		System.out.print("총점:\t");
		for (int i = 0; i < score[i].length; i++) {
			for (int j = 0; j < score.length; j++) {
				sum+=score[j][i];
			}
			System.out.print(sum + "\t");
			sum = 0;
		}
	}
}

//국영수만 배열 번호나 총점 평균 은 굳이 배열 안해도됨
/*
번호	국어	영어	수학	총점	평균 
===============================================
 1	80	92	72	244	81.333336
 2	91	39	20	150	50.0
 3	60	37	10	107	35.666668
 4	32	80	40	152	50.666668
 5	50	100	90	240	80.0
===============================================
총점:313	348	232

*/