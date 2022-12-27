
public class Ex02_04_관계논리 {
	public static void main(String[] args) {
		int a=20, b=20;
		
		boolean c = a<=b;
		
		System.out.println("C:" + c); //관계연산자: <,>,<=,>=
		System.out.println("C:" + (a>b));
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		c = a>100 && b>10;
		System.out.println("C:"+c);
		
		c = a>100 || b>10;
		System.out.println("C:"+c);
		
		c=!(a>100);//20>100
		System.out.println("C:"+c);
		
		/*
		 논리연산자: &&, ||, !(not)
		 
		 && : and 연산자
		 T && T : T
		 T && F : F
		 F && T : F
		 F && F : F
		 
		 || : or 연산자
		 T || T : T
		 T || F : F
		 F || T : F
		 F || F : F
		 */
	}
}
