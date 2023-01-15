<<<<<<< HEAD

import java.util.Scanner;

public class Ex09_11_ÀÓµ¿ÁØ {
	public static void main(String[] args) {
		int[] lotto = new int[6]; // ³­¼ö µé¾î°¡´Â °ø°£
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
			System.out.print("¼ýÀÚ"+(i+1)+ ": ");
			my[i] = sc.nextInt();
			if (my[i] > 45 || my[i] < 1) {
				System.out.println("1~45 »çÀÌÀÇ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
				continue;
			}

			for (int j = 0; j < i; j++) {
				if (my[i]==my[j]) {
					System.out.println("Áßº¹µÊ");
					i--;
					break;
				}
			}
			i++;
		}
		System.out.println("ÄÄÀÌ ¹ß»ý½ÃÅ² ·Î¶Ç ¹øÈ£");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}//ÄÄ ·Î¶Ç¹øÈ£ Ãâ·Â

		System.out.println();

		System.out.println("³»°¡ ÀÔ·ÂÇÑ ·Î¶Ç¹øÈ£");
		for(i=0;i<lotto.length;i++) {
			System.out.print(my[i]+" ");
		}//³» ·Î¶Ç¹øÈ£ Ãâ·Â

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
			System.out.println("1µî");
			break;
		}
		case 5: {
			System.out.println("2µî");
			break;
		}
		case 4: {
			System.out.println("3µî");
			break;
		}
		default:
			System.out.println("²Î!!");
		}
		sc.close();
	}
}
=======
import java.util.Scanner;

public class Ex09_11_ìž„ë™ì¤€ {
	public static void main(String[] args) {

		int[] lotto = new int[6]; // ë‚œìˆ˜ ë“¤ì–´ê°ˆ ê³µê°„
		int[] my = new int[6]; // ë‚´ê°€ ì“¸ ê³µê°„

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < my.length; i++) {
			
		}
		






	}
}

//í•´ì•¼í• ê²ƒ 
//ì¤‘ë³µì œê±°
//ìˆ«ìžì œí•œ
//ë§žì€ ê°¯ìˆ˜



//ë¡œë˜ë²ˆí˜¸ ë§žì¶”ê¸° 1~45
//ì¤‘ë³µ ê¸ˆì§€

//ë§žì€ ê°¯ìˆ˜: 1
//ê½
>>>>>>> branch 'master' of https://github.com/dongjun-Lim96/pratice.git
