<<<<<<< HEAD

import java.util.Scanner;

public class Ex09_11_�ӵ��� {
	public static void main(String[] args) {
		int[] lotto = new int[6]; // ���� ���� ����
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
			System.out.print("����"+(i+1)+ ": ");
			my[i] = sc.nextInt();
			if (my[i] > 45 || my[i] < 1) {
				System.out.println("1~45 ������ ���� �Է��ϼ���");
				continue;
			}

			for (int j = 0; j < i; j++) {
				if (my[i]==my[j]) {
					System.out.println("�ߺ���");
					i--;
					break;
				}
			}
			i++;
		}
		System.out.println("���� �߻���Ų �ζ� ��ȣ");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}//�� �ζǹ�ȣ ���

		System.out.println();

		System.out.println("���� �Է��� �ζǹ�ȣ");
		for(i=0;i<lotto.length;i++) {
			System.out.print(my[i]+" ");
		}//�� �ζǹ�ȣ ���

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
			System.out.println("1��");
			break;
		}
		case 5: {
			System.out.println("2��");
			break;
		}
		case 4: {
			System.out.println("3��");
			break;
		}
		default:
			System.out.println("��!!");
		}
		sc.close();
	}
}
=======
import java.util.Scanner;

public class Ex09_11_임동준 {
	public static void main(String[] args) {

		int[] lotto = new int[6]; // 난수 들어갈 공간
		int[] my = new int[6]; // 내가 쓸 공간

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < my.length; i++) {
			
		}
		






	}
}

//해야할것 
//중복제거
//숫자제한
//맞은 갯수



//로또번호 맞추기 1~45
//중복 금지

//맞은 갯수: 1
//꽝
>>>>>>> branch 'master' of https://github.com/dongjun-Lim96/pratice.git
