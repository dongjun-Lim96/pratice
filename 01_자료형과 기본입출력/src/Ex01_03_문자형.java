
public class Ex01_03_문자형 {
	public static void main(String[] args) {
		System.out.println(1);
		char ch ='B';
		
		System.out.println("ch: " +ch+ "입니다" );
		System.out.println((char)(ch+1));
		System.out.println((char)77);
		
		long k = 10000000000l; //그냥 숫자를 넣으면 4바이트 데이터로 인식
	}
}


/* 아스키코드값 
A : 65	a : 97
B : 66	b : 98

long 에 l을 붙여야 8바이트 숫자로 인식함
그냥 숫자만 쓰면 4바이트 int로 인식함
*/
