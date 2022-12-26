
public class Ex01_04_실수형 {
	public static void main(String[] args) {
		float a = 1.1f;
		double b = 2.2;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		float f1 = 0.0012300f;
		System.out.println("f1: " + f1);
		
		float f2 = 1.123456789f; //반올림 1.1234568
		System.out.println("f2: " + f2);
		
		float f3 = 123; //4바이트 <- 4바이트 가능
		System.out.println("f3: " + f3);
		
		int i4 = (int)1.23f; //4바이트 <- 4바이트지만 float이 더 크다고 인식
		System.out.println("i4: " + i4);
		
		double d1 = 0.123e4;
		System.out.println("d1: " +d1);
		
		double d2 = 0.123e-2;
		System.out.println("d2: " +d2);
	}
}


/*실수를 그냥 쓰면 double 자료형으로 인식 float에 쓰려면 f를 붙임
 8바이트 자료를 4바이트에 욱여 넣을순 없으니까
 넣으면 type mismatch 뜸
 실수 자료형에 그냥 실수를 넣으면 8바이트로 할당됨
 */
