import java.util.StringTokenizer;

public class Ex09_13_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("3+2+7+9","+");
		int sum = 0;
		
		while (str.hasMoreTokens()) {
			sum+= Integer.parseInt(str.nextToken());
		}
		System.out.println("sum:"+sum);
	}
}
