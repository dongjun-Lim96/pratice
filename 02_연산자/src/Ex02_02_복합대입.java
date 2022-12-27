
public class Ex02_02_복합대입 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		
		System.out.println("a=" +a);
		
		// = : 대입연산자
		// += : 복합대입연산자 (+-/*%등등)
		
		//a = a+3;
		a+=3;
		System.out.println("a=" +a);
		
		System.out.println("b=" +b);
		b-=7;
		System.out.println("b=" +b);
		
		System.out.println("c=" +c);
		c*=4;
		System.out.println("c=" +c);
		
		System.out.println("d=" +d);
		d/=4;
		System.out.println("d=" +d);
		
		System.out.println("e=" +e);
		e%=4; //e=e%4;
		System.out.println("e=" +e);
		
		System.out.println();
		
		char ch1= 'a'; //
		System.out.println("ch1= " +ch1);
		ch1 = (char)(ch1+2); //2바이트 와 4바이트 연산시 4바이트로 연산 즉 타입이 맞지 않는다
					         //97+2 가된다
		ch1 += 2;
		System.out.println("ch1= " +ch1);
		
		String fruit = "apple";
		
		System.out.println("fruit="+fruit);
		fruit +=" banana";
		System.out.println("fruit="+fruit);
	}
}
