import java.util.StringTokenizer;

public class Ex09_08_Wrapper {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		
		System.out.println("합계:"+sum);
		
		String[] num2 = {"1","2","3","4","5"};
		String sum2 = "";
		sum = 0;
		
		for (int i = 0; i < num2.length; i++) {
			sum2 += num2[i];
			sum += Integer.parseInt(num2[i]);			
		}
		System.out.print(sum2);
		System.out.println();
		System.out.println(sum);
		
		String[] str = {"웬디:70","아이유:90","크리스탈:30"};
	
		sum = 0;
		for (int i = 0; i < str.length; i++) {
			int index = str[i].indexOf(":");
			sum += Integer.parseInt(str[i].substring(index+1));
			
		}
		System.out.println("합계:"+sum);
		
		sum = 0;
		for (int i = 0; i < str.length; i++) {
			String arr[] = str[i].split(":");
			sum += Integer.parseInt(arr[1]);
		}
		System.out.println("합계:"+sum);
		
	}
}
