import java.util.Scanner;

class Food{
	private String name;
	private String local;
	private int price;
	
	public Food() {
		name = "김밥";
		local = "한국";
		price = 3500;
	}
	
	public Food(String name, String local, int price) {
		this.name = name;
		this.local = local;
		this.price = price;
	}
	
	public void display() {
		System.out.println(name+", "+local+", "+price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocal() {
		return local;
	}
	
	public int  getPrice() {
		return price;
	}
}


public class Ex05_20_임동준 {
	public static void main(String[] args) {
		//객체 3개
		//1.생성자 통한 주입
		//2.생성자 통한 주입(1, 2.2, false)
		//3.setter 통한 주입

		Food fd1 = new Food();
		fd1.display();
		
		Food fd2 = new Food();
		fd2.setName("초밥");
		fd2.setLocal("일본");
		fd2.setPrice(11000);
		System.out.println(fd2.getName()+", "+fd2.getLocal()+", "+fd2.getPrice());
		
		Food fd3 = new Food("탕수육", "중국", 18000);
		fd3.display();

		Food[] arr = new Food[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("음식이름:");
			String name = sc.next(); 
			System.out.print("지역:");
			String local = sc.next();
			System.out.print("가격:");
			int price = sc.nextInt();
			
			arr[i] = new Food(name, local, price);
			
		}
		
		/*for (int i = 0; i < arr.length; i++) {
			arr[i].display();
		}*/
		
		for (Food fd : arr) {
			fd.display();
		}
		
		sc.close();
		//전체를 출력하는 메서드(1번객체, 3번객체)
		//getter통한 출력 (2번객체)
		//객체 배열 추가
	}
}


//원하는 클래스 만들기 
//멤버변수 최소 3개