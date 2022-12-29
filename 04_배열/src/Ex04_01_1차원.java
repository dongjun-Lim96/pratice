
public class Ex04_01_1차원 {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,e=50;
		
		//배열:같은 자료형 데이터 여러개를 하나로 묶어놓은 집합
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println();
		
		//int[] arr1 = {10,20,30,40,50};
		//int[] arr1 = new int[]{10,20,30,40,50};
		int[] arr1 = new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;		
		
		System.out.println("arr1:" + arr1);
		System.out.println("방의갯수:"+arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println();
		
		//일부 요소에 접근할 떄(전체도 가능)
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		//모든 요소를 접근할 떄
		for (int i : arr1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//double[] arr2 = new double[3]; arr2[0]=1.1; arr2[1]=2.2; arr2[2]=3.3;
		//double[] arr2 = {1.1, 2.2, 3.3};
		double[] arr2 = new double[] {1.1, 2.2, 3.3};
		
		System.out.println("요소의 갯수: "+arr2.length);
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		System.out.println();
		
		for (double f : arr2) {
			System.out.println(f);
		}
	}
}
