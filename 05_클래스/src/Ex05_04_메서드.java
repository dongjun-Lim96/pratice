
public class Ex05_04_메서드 {
	public static void main(String[] args) {//main 메서드 정의
		int result = add(3,9);//add메서드 호출 (12로 받는다)add(3,9)==12
		System.out.println("result:"+result);
		
		result = add(200, 193);
		System.out.println("result:"+result);
		
		result = add(123, 456);
		System.out.println("result:"+result);
		
		System.out.println(add(100, 200));
		System.out.println("------------------------");
		
		mul(2, 3.9, 7);
		mul(4, 9, 10);
		
		show();
		//static 없이 show 쓰는 법 
		//Ex05_04_메서드 ex = new Ex05_04_메서드();
		//ex.show();
	}
	
	static int add(int a, int b) {//add메서드 정의
		//int sum = a+b;
		return a+b; //sum;
	}
	
	static void mul(int a, double b,int c) {//mul 메서드 정의
		System.out.println("세 수의 곱:"+a*b*c);
	}	
	
	static void show() {
		System.out.println("show 메서드 정의 부분");
	}
}

//메서드는 항상 클래스 안에 있어야 한다.
//main은 실행클래스
//main 메서드에 static을 붙이는 이유는 jvm이 인식하기 위해서
//static 메서드에서는(main같은) static 메서드만 호출 가능