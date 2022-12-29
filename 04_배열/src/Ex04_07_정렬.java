
public class Ex04_07_정렬 {
	public static void main(String[] args) {
		int[] arr = {8,3,5,2,9};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int[] arr2 = {7,5,3,8,9};
		/*i=0 j=1 2 3 4
		 *i=1 j=2 3 4 
		 *i=2 j=3 4 
		 *i=3 j=4
 		 */
		int tmp;
		for (int i = 0; i < arr2.length-1; i++) {
			for (int j = i+1; j < arr2.length; j++) {
				if (arr2[i]>arr2[j]) {
					tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
					
				}
			}	
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
