
public class Ex04_06_2차원 {
	public static void main(String[] args) {
		
		/*int[][] n = {
				{1,2,3,4},
				{5,6,7,8}
		};
		
		
		int[][] n = new int[][] {
			{1,2,3,4},
			{5,6,7,8}
		};
		*/
		
		int[][] arr = new int[2][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int[] is : arr) { //행 복사 (한 줄)
			for (int is2 : is) {//복사한 행의 열복사
				System.out.print(is2+" ");
			}
			System.out.println();
		}
	}
}
