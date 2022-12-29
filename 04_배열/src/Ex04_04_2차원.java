
public class Ex04_04_2차원 {
	public static void main(String[] args) {

		/*int[] arr1 = {10,20,30,40,50};
				int[] arr1 = new int[]{10,20,30,40,50};
				int[] arr1 = new int[5];
				arr1[0]=10;
				arr1[1]=20;
				arr1[2]=30;
				arr1[3]=40;
				arr1[4]=50;
		 */		

		int[][] arr = {
				{11,22,33,66,90},
				{13,46},
				{44,55,66,90},
				{77}
		};
		
		/*System.out.println("arr:" + arr);
		System.out.println("arr[0]:" + arr[0]);
		System.out.println("arr[1]:" + arr[1]);
		System.out.println("arr[2]:" + arr[2]);
		System.out.println("arr[3]:" + arr[3]);
		
		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" ");//0행 1열
		System.out.print(arr[0][2]+" ");
		System.out.println();
		
		System.out.print(arr[1][0]+" ");//1행 0열
		System.out.print(arr[1][1]+" ");
		System.out.print(arr[1][2]+" ");
		System.out.println();
		
		System.out.print(arr[2][0]+" ");
		System.out.print(arr[2][1]+" ");
		System.out.print(arr[2][2]+" ");
		System.out.println();
		
		System.out.print(arr[3][0]+" ");
		System.out.print(arr[3][1]+" ");
		System.out.print(arr[3][2]+" ");
		System.out.println();
		
		System.out.println(arr.length);//행의 갯수
		System.out.println(arr[0].length);//0행의 열의 갯수
		System.out.println(arr[1].length);//1행의 열의 갯수
		System.out.println(arr[2].length);//2행의 열의 갯수
		System.out.println(arr[3].length);//3행의 열의 갯수
		*/
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
