
class Sports2{
	private String name;
	private int inwon;

	public Sports2(String name, int inwon) {
		this.name = name;
		this.inwon = inwon;
	}
	
	public void display() {
		System.out.println("name: "+ name);
		System.out.println("inwon: "+ inwon);
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setInwon(int inwon) {
//		this.inwon = inwon;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getInwon() {
//		return inwon;
//	}
}

class Baseball2{
	//Sports2를 포함(상속 x)
	Sports2 s;
	private double ta;

	public Baseball2(String name, int inwon, double ta) {
//		s.setName(name);
//		s.setInwon(inwon);
		s = new Sports2(name,inwon);
		this.ta = ta;
	}
	
	public void display() {
//		System.out.println("name: "+ s.getName());
//		System.out.println("inwon: "+ s.getInwon());
		s.display();
		System.out.println("ta: "+ ta);
	}
}

public class Ex06_07_임동준 {
	public static void main(String[] args) {

		Baseball2 b = new Baseball2("야구", 9, 0.567);
		b.display();
	}
}
