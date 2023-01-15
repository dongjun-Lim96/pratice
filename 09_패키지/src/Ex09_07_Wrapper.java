
public class Ex09_07_Wrapper {
	public static void main(String[] args) {
		//기본자료형: byte ,short, char, int, long, float, double, boolean
		
		Integer in1 = new Integer(11);
		Integer in2 = 12; // 12=> new Integer(12) : autoboxing
		
		int in3 = new Integer(21); //new Integer(21) => 21 :unboxing 
		int in4 = new Integer(22); //new Integer(22) => 22 :unboxing
		System.out.println(in3+in4);
	
		double d1 = 1.1;
		Double d2 = new Double(1.1);
		Double d3 = 1.1; //1.1=> new Double(1.1) : autoboxing
		double d4 = new Double(1.1); //new Double(1.1) => 1.1 :unboxing
		
		int i = Integer.parseInt("100"); //문자열을 정수로
		int j = Integer.parseInt("200");
		
		System.out.println("100"+"200");
		System.out.println(i+j);
		
		Integer i2 =Integer.valueOf("100"); // 문자열을 정수로
		int j2 =Integer.valueOf("200");
		System.out.println(i2+j2);
		
		double d5 = Double.parseDouble("1.1");
		double d6 = Double.parseDouble("2.2");
		System.out.println(d5+d6);
	}
}


//Wrapper클래스는 기본 자료형을 객체로 만들기 위한 클래스이다.
//기본 자료형을 매개변수로 보내고 싶다면 wrapper로 boxing해서 보낼수 있다
