
public class Ex09_03_String {
	public static void main(String[] args) {

		int a;
		double b;
		String c; // String 클래스 == 자료형

		//		String s1 = "Have a nice day"; //"Have a nice day"가 s1,s2 모두 참조함
		//		String s2 = "Have a nice day"; //글자 하나만 달라도 다른 주소생성

		String s1 = new String("Have a nice day"); //새로운 공간 할당
		String s2 = new String("Have a nice day"); //이거 둘이 비교하면 주소가 달라서 false처리됨
		String s3 = "hahaha"; //리터럴 표현법
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println(s1==s2); //주소비교

		int len = s1.length();
		System.out.println(len);

		boolean result1 = s1.equals(s2); //String안에 문자열로 비교하는 오버라이딩, Object equals()가 아님
		System.out.println(result1); //String의 equals는 주소비교가 아니다.

		result1 = s1.equalsIgnoreCase(s2);
		System.out.println(result1);

		int reulst2 = s1.compareToIgnoreCase(s2);
		System.out.println(reulst2);
		if (reulst2 == 0) {
			System.out.println("두 문자열 같음");
		}else {
			System.out.println("두 문자열 같지 않음");			
		}
		
		System.out.println("=====================");
		
		String s4 = s1.concat(s3);
		System.out.println(s1.concat(s3));
		System.out.println(s1+s3);
		
		int result3 = s1.indexOf("nice");
		//Have a nice day 앞에서부터 7번쨰 n
		System.out.println(result3); //못찾으면 -1 이 나온다
		
		result3 = s1.lastIndexOf('a'); //아스키 코드로 찾음
		//Have a nice day 마지막 a를 찾는다.
		System.out.println(result3); //못찾으면 -1 이 나온다
		
		System.out.println("=====================");
		
		//Have a nice day 3부터 9 앞에 있는것 까지 가져오기
		String result4 = s1.substring(7,11);
		System.out.println(result4);
		//e a ni
		
		//Have a nice day
		result4 = s1.substring(7); //7부터 끝까지 가져온다.
		System.out.println(result4);
		
		result4 = s1.replace('a', 'x'); // a를 x로 바꾼다.
		System.out.println(result4); 
		
		System.out.println("====================");
		
		result4 = s1.toString(); //String 클래스의 toString은 오버라이딩 되어있다.
		System.out.println(result4);
		System.out.println(s1);
		System.out.println(s1.toString());
		
		result4 = s1.toLowerCase(); //전부 소문자로 리턴
		System.out.println(result4);
		
		result4 = s1.toUpperCase();
		System.out.println(result4);
		
		System.out.println(s1.contains("ce"));
		System.out.println(s1.contains("abc")); // abc는 없다
		
		String s5 = "    abc de FG  ";
		System.out.println(s5);
		System.out.println(s5.length());
		
		String s6 = s5.trim();
		System.out.println(s6);
		System.out.println(s6.length());
		
		char ch = s1.charAt(2); // 이 위치의 문자 가져오기
		System.out.println(ch);
		
		String fullName = "Hello.java"; //a.txt, picture.jpg
		String fileName; //Hello
		String ext;//java
		
		
		int index = fullName.indexOf('.');
		
		fileName = fullName.substring(0, index);
		ext = fullName.substring(index+1);
		
		System.out.println("화일명:"+ fileName);
		System.out.println("확장자:"+ ext);
	}
}


//equalsIgnoreCase: 대소문자 구분없이 같음 비교
//compareTo: 차이비교 ,결과(리턴)가 숫자로 나옴
//compareToIgnoreCase: 대소문자 무시하고 비교
//concat: 문자열 연결
//indexOf: 위치를 찾는 메서드, 못찾으면 -1
//lastIndexOf: 뒤에서부터 위치를 찾는 메서드, 못찾으면 -1
//substring: 문자열 일부 가져올떄 사용하는 메서드 3~9
//replace: 문자열 바꾸고 싶을때
//toLowerCase: 전부 소문자로 리턴
//contains: 포함여부 확인
//trim: 앞뒤공백 제거 , 사이 공백은 놔둔다.
//charAt: 매개변수 자리 문자 리턴