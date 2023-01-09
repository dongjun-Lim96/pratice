
class BugerKing{
	String beaf; 
	String chiken;

	public BugerKing(String beaf, String chiken) {
		this.beaf = beaf;
		this.chiken = chiken;
	}

	public void display() {
		System.out.print("beaf: " + beaf + "\t" + "chiken: " + chiken + "\n");
	}
}

class SideMenu extends BugerKing{
	String beverage;
	String fry;

	public SideMenu(String beaf, String chiken, String beverage, String fry) {
		super(beaf, chiken);
		this.beverage = beverage;
		this.fry = fry;
	}

	public void display() {
		super.display();
		System.out.print("beverage: "+ beverage + "\t" + "fry: " + fry + "\n");
	}
}

class Buy extends SideMenu{
	int price;
	int amount;

	public Buy(String beaf, String chiken, String beverage, 
			String fry, int price, int amount) {
		super(beaf, chiken, beverage, fry);
		this.price = price;
		this.amount = amount;
	}

	public void display() {
		super.display();
		System.out.print("price: "+ price + "\t" + "amount: " + amount+"\n");
	}
}

public class Ex06_08_�ӵ��� {
	public static void main(String[] args) {

		Buy b = new Buy("whopper", "longchiken", "cider",
				"onion ring", 40000, 5);
		
		b.display();
	}
}

//��� �ι� �̻� �ޱ�
//���� - �θ� - �ڼ�
//�� Ŭ������ ������� 2�� �̻� super�� �Ἥ 