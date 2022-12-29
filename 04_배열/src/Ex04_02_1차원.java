
public class Ex04_02_1차원 {
	public static void main(String[] args) {
		
		//1~10합계
		
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int i : n) {
			sum+=i;
		}
		System.out.println(sum);
		sum = 0;
		
		int[] jumsu = {79,88,91,33,100,55,95};
		
		for (int i : jumsu) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]+"\t");
			sum+=jumsu[i];
		}
		System.out.println();
		System.out.print("합:"+sum+"\t");
		System.out.printf("평균: %.2f ",(double)sum/jumsu.length);
		System.out.println();
		
		sum = 0;
		
		for (int i : jumsu) {
			sum+=i;
		}
		System.out.print("합:"+sum+"\t");
		System.out.printf("평균: %.2f ",(double)sum/jumsu.length);
		System.out.println();
		
		int min = jumsu[0];
		int max = jumsu[0];
		
		for (int i = 1; i < jumsu.length; i++) {
			if (max<jumsu[i]) {
				max=jumsu[i];
			}
			if (min>jumsu[i]) {
				min=jumsu[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
