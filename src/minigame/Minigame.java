package minigame;

import java.util.Random;
import java.util.Scanner;

public class Minigame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt();
		
		
		if (coin == 100) {
			System.out.println("개임 시작");
			System.out.println("숫자를 넣어 주세요.");
			
			Random random = new Random();
			int roll = random.nextInt(1)+1;
			int num1 = sc.nextInt();
			
			if (roll == num1) {
				System.out.println("1.종료  2.이어하기");
				int num2 = sc.nextInt();
				
				if (num2 == 1) {
					int small1 = random.nextInt(4)+1;
					int small2 = random.nextInt(5)+1;
					int small3 = random.nextInt(6)+1;
					int sr = (small1+small2+small3)/3;
					System.out.println("작은 보상: " + (100*sr) + "원");
				}else {
					System.out.println("이어합니다. 숫자를 넣어 주세요.");
					
					int reroll = random.nextInt(1)+1;
					int num3 = sc.nextInt();
					
					if (reroll == num3) {
						int big1 = random.nextInt(7)+1;
						int big2 = random.nextInt(8)+1;
						int big3 = random.nextInt(9)+1;
						int br = (big1+big2+big3)/2;
						
						System.out.println("큰 보상" + (100*br) + "원");
					}
				}
				
			}else {System.out.println("틀렸습니다.");}
			
		}else {
			System.out.println("코인을 넣어 주세요.");
		}
		
	}

}
