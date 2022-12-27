import java.util.Scanner;

public class Ex02_05_삼항 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=101, b=20;
		//조건식 ? 참 : 거짓
		int result = a<b ? a : b ;
		System.out.println("result: "+ result);
		
		String str = a%2==0 ? "짝수" : "홀수" ;
		System.out.println("Str:"+str);
	}
}

//이항연산자 : +,-,*,/,%,&&,||,!,<,>,==
//단항연산자 : ++,--,!,-(음수의 기능)
//삼항연산자(조건연산자) : 조건식 ? 참 : 거짓