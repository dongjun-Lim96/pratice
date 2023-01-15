
import java.util.Scanner;

public class Ex09_11_임동준 {
	public static void main(String[] args) {
		int[] lotto = new int[6]; // 난수 들어가는 공간
		int[] my = new int[6];		

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}

		int i = 0;
		while (i<6) {
			System.out.print("숫자"+(i+1)+ ": ");
			my[i] = sc.nextInt();
			if (my[i] > 45 || my[i] < 1) {
				System.out.println("1~45 사이의 수를 입력하세요");
				continue;
			}

			for (int j = 0; j < i; j++) {
				if (my[i]==my[j]) {
					System.out.println("중복됨");
					i--;
					break;
				}
			}
			i++;
		}
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}//컴 로또번호 출력

		System.out.println();

		System.out.println("내가 입력한 로또번호");
		for(i=0;i<lotto.length;i++) {
			System.out.print(my[i]+" ");
		}//내 로또번호 출력

		int count = 0;
		for(i=0;i<lotto.length;i++) {
			for(int j=0;j<my.length;j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
			}
		}
		
		switch (count) {
		case 6: {
			System.out.println("1등");
			break;
		}
		case 5: {
			System.out.println("2등");
			break;
		}
		case 4: {
			System.out.println("3등");
			break;
		}
		default:
			System.out.println("꽝!!");
		}
		sc.close();
	}
}
