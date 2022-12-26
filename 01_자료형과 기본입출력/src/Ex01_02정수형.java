
public class Ex01_02정수형 {
	public static void main(String[] args) {
		System.out.println(1+2);
		int a=1;
		int b=2;
		System.out.println("a+b");
		System.out.println(a+b);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		b3 = (byte) (b1+b2);
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		System.out.println("b3: "+(b1+b2));
		
		int c = 1000000;
		int d = 2000000;
		long result = c*(long)d;
		System.out.println("result: " +result);
		System.out.println();
		System.out.println(c);
	}
}

//cannot be resolved to a variable 선언없이 변수를 사용하려고 할 때 발생
//캐스팅은 잠시만 변환시켜줌
//큰 자료형 작은 자료형 연산시 큰 자료형으로 변환