import java.util.StringTokenizer;

public class Ex09_12_StringTokenizer {
	private static final Object[] String = null;

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("2023/01/12,16:01", "/,:");
		
		int count = str.countTokens();
		System.out.println("count:"+count);
		
		while(str.hasMoreTokens()) {
			String s = str.nextToken();
			System.out.println(s);
		}
		
		System.out.println();
		
		String str1 = "2023/01/12,16:01";
		String[] arr = str1.split("/");
		
		
		for (int i = 0; i < str1.length(); i++) {
			
		}
	}
}


//countTokens(" ","/,:") /,:@공백 등등 구분자로 분리시키는 메서드 
// 기본 구분자는 (" ")공백이다

//hasMoreTokens() 다음 토큰이 남아있는지 확인
//nextToken() 다음 토큰 리턴

//split() 하나의 구분자로 분리시키는 메서드