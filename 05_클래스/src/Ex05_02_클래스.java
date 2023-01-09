
class Book{
	//객체를 만들어야 생성됨
	String title, author;//멤버변수(인스턴스변수)
	int price;
	static String Publisher ="쌍용출판사"; //(공유)(정적)(클래스)(static)변수, 공통으로 사용가능
	//static 변수는 객체 생성 전에도 사용 가능
}

public class Ex05_02_클래스 {
	public static void main(String[] args) {
		Book bk = new Book();//객체를 만드는 작업 : instance(인스턴스)
		bk.title = "토지";
		bk.author = "박경리";
		bk.price = 5000;
		
		System.out.println(bk.title);
		System.out.println(bk.author);
		System.out.println(bk.price);
		System.out.println(bk.Publisher);
		
		System.out.println();
		
		Book bk2 = new Book();
		bk2.title = "자바";
		bk2.author = "남궁성";
		bk2.price = 15000;
		
		System.out.println(bk2.title);
		System.out.println(bk2.author);
		System.out.println(bk2.price);
		System.out.println(bk2.Publisher);
		System.out.println(Book.Publisher);
		
	}
}
