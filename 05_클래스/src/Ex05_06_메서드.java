
class Fruit{
	void apple() {
		System.out.println("apple");
	}
	static void banana() {
		System.out.println("banana");
	}
}

public class Ex05_06_�޼��� {
	public static void main(String[] args) {
		Fruit fr = new Fruit();
		Ex05_06_�޼��� ex = new Ex05_06_�޼���();
		
		fr.apple();
		Fruit.banana();
		fr.banana();
		
		System.out.println("--------");
		
		ex.orange();
		melon();
		ex.melon();
		Ex05_06_�޼���.melon();	
	}
	
	void orange() {
		System.out.println("orange");
	}
	
	static void melon() {
		System.out.println("melon");
	}
}
