
class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	public void display() {
		
		System.out.println("�뷡����:"+title);
		System.out.println("������:"+singer);
		System.out.println("�帣:"+genre);
		System.out.println("����:"+price);
		System.out.println();
	}
	
	public Music() {
		title = "��ȫ��";
		singer = "������";
		genre = "�߶��";
		price = 1000;
	}
	
	public Music(String title, String singer, String genre, int price) {
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;	
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getPrice() {
		return price;
	}
}

public class Ex05_19_������ {
	public static void main(String[] args) {
		Music m1 = new Music(); //�����ڷ�: ��ȫ��, ������, �߶��, 1000
		System.out.println(m1.getTitle());
		m1.display();
		
		Music m2 = new Music("���������", "����", "��", 3000); //�����ڷ� 
		System.out.println(m2.getSinger());
		m2.display();
		
		Music m3 = new Music(); // set����: ��ӳ�, ������, Ʈ��Ʈ, 5000
		m3.setTitle("��ӳ�");
		m3.setSinger("������");
		m3.setGenre("Ʈ��Ʈ");
		m3.setPrice(5000);
		System.out.println(m3.getPrice());
		m3.display();
	}
}
