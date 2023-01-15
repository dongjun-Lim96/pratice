import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;

	public Music(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return title+"/"+singer+"/"+price;
	}
}

public class Ex10_04_ArrayList {
	public static void main(String[] args) {

		//		Music 객페 3개를 배열로 만들어
		//		ArrayList에 넣고 출력

		Music[] arr = {
				new Music("락", "잭블랙", 3000),
				new Music("랩", "타블로", 5000),
				new Music("발라드", "성시경", 7000)
		};

		//		Music mc1 = new Music("락", "잭블랙", 3000);
		//		Music mc2 = new Music("랩", "타블로", 5000);
		//		Music mc3 = new Music("발라드", "성시경", 7000);

		ArrayList<Music> list = new ArrayList<Music>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		String retry;
		
		while (true) {
			System.out.print("제목:");
			String title = sc.next();
			System.out.print("가수명:");
			String singer = sc.next();
			System.out.print("가격:");
			int price = sc.nextInt();
			
			Music inmput = new Music(title, singer, price);
			list.add(inmput);
			
			System.out.println("계속?");
			retry = sc.next();
			if (retry.equals("n")) {
				break;
			}
		}
		
		System.out.println(list);
		
		
		for (int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			System.out.println(m.getTitle());
			System.out.println(m.getSinger());
			System.out.println(m.getPrice());
			System.out.println();
		}
		
		System.out.println();
		
//		for (Music m : list) {
//			System.out.println(m.getTitle());
//			System.out.println(m.getSinger());
//			System.out.println(m.getPrice());
//			System.out.println();
//		}
	}
}
