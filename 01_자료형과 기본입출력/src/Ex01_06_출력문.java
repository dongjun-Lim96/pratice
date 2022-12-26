
public class Ex01_06_출력문 {
	public static void main(String[] args) {
		int a = 123;
		char b = 'A';
		float c = 98.765f;
		String d = "임동준";
		
		System.out.println("a="+123);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println();
		
		System.out.printf("a=%5d\n",a);
		System.out.printf("b=%c\n",b);
		System.out.printf("b=%d\n",(int)b);
		System.out.printf("c=%.2f\n",c);
		System.out.printf("d=%s\n",d);
		
		System.out.println("안녕하세요 \t저의 이름은 \"임동준\"입니다");
		System.out.println("안녕\\하세요 저의 이름은 임동준입니다");
		//역슬래쉬 를 쓰고 싶으면 \한번더 "\\"
		
		
	}
}


/*
 서식문자
정수: %d
문자: %c
실수: %f 에서 (%.숫자f는 소수점 숫자 만큼만)
%숫자 : 숫자만큼 띄어서
%t : 탭기능
%n : 줄바꿈
" : "를 출력하고 싶으면 \"
*/