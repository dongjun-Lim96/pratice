import java.util.Scanner;

class Food{
	private String name;
	private String local;
	private int price;
	
	public Food() {
		name = "���";
		local = "�ѱ�";
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


public class Ex05_20_�ӵ��� {
	public static void main(String[] args) {
		//��ü 3��
		//1.������ ���� ����
		//2.������ ���� ����(1, 2.2, false)
		//3.setter ���� ����

		Food fd1 = new Food();
		fd1.display();
		
		Food fd2 = new Food();
		fd2.setName("�ʹ�");
		fd2.setLocal("�Ϻ�");
		fd2.setPrice(11000);
		System.out.println(fd2.getName()+", "+fd2.getLocal()+", "+fd2.getPrice());
		
		Food fd3 = new Food("������", "�߱�", 18000);
		fd3.display();

		Food[] arr = new Food[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�����̸�:");
			String name = sc.next(); 
			System.out.print("����:");
			String local = sc.next();
			System.out.print("����:");
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
		//��ü�� ����ϴ� �޼���(1����ü, 3����ü)
		//getter���� ��� (2����ü)
		//��ü �迭 �߰�
	}
}


//���ϴ� Ŭ���� ����� 
//������� �ּ� 3��