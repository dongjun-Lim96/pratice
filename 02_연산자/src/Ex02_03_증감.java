
public class Ex02_03_증감 {
	public static void main(String[] args) {
		int a=5, aa;
		
		System.out.println("a="+a);
		a++; //1증가 ++a도 가능
		System.out.println("a="+a);
		
		a=5;
		System.out.println("a="+a);
		
		aa=++a; //먼저 연산 (먼저 6으로 만든 후 넣어라) 
		System.out.println("a="+a+", aa="+aa);
		
		a=5;
		System.out.println("a="+a);
		
		aa=a++; //나중 연산 (a먼저 aa에 들어감 그래서 aa는 5가되고 a는 6이된다)
		System.out.println("a="+a+", aa="+aa);
		//++a, a++만 있을 때는 상관 없지만 a=a++같은 연산이 있을떄는 신셩써야함
		
		System.out.println();
		
		int i=10;
		System.out.println(i); //10 
		System.out.println(i--); //콘솔창에 넣은 후 +연산 : i출력 후 1증가
		System.out.println(--i); //연산후 콘솔창에 넣어라 : 1증가 후 i출력
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i); //10 10 8 7 7 6
	}
}
