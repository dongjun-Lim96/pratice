import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_02_ArrayList {
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = new int[5];
		
		
		ArrayList<String> s1 = new ArrayList<String>();
		int size = s1.size();
		
		
		System.out.println("size:"+size);	
		s1.add("�¿�"); //0 //�߰� �޼���
		s1.add("����"); //1
		s1.add("����"); //2
		s1.add("����"); //3
		
		System.out.println(s1);
		
		size = s1.size();
		System.out.println("size:"+size); //toString�� �پ��ִ�
		//[ , , , , ] (���)String�� toString()
		
		s1.add(1, "���");
		System.out.println(s1.toString());
		
		String g = s1.get(0);
		System.out.println("g:"+g);
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("����");
		add.add("����");
		
		s1.addAll(add); //ArratList ��ü �߰�
		System.out.println(s1.toString());
		
		size = s1.size();
		System.out.println("size:"+size);
		
		//s1.remove(1);
		s1.remove("����");  //���� �޼���
		
		
		ArrayList<String> delete = new ArrayList<String>();
		delete.add("����");
		delete.add("����");
		
		s1.removeAll(delete); //�������� ���� ������ �÷����� ���� ���� removeall�� ��ü ����
		System.out.println(s1.toString());
		s1.add("����");
		System.out.println(s1.toString());
		
		
		int index1 = s1.indexOf("����");
		int index2 = s1.lastIndexOf("����");
		System.out.println(index1+","+index2);
		
		if (index1 == -1) {
			System.out.println("���� �����ϴ�");
		}
		
		boolean result =s1.contains("����");
		System.out.println("result:" + result);
		
		if (result == false) {
			System.out.println("���� �����ϴ�");
		}
		
		System.out.println(s1.toString());
		
		s1.set(2, "����"); //��ü �޼���
		System.out.println(s1.toString());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�:");
		String name = sc.next();
		
		if (s1.indexOf(name) != -1) {
			System.out.println("������ ȸ���Դϴ�.");
		}else {
			System.out.println("�������� ���� ȸ���Դϴ�.");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		boolean flag = false;
		for (int i = 0; i < s1.size(); i++) {
			if (s1.get(i).equals(name)) {
				System.out.println("������ ȸ���Դϴ�.");
				flag = true;
				break;
			}			
		}
		if (flag == false) {
			System.out.println("�������� ���� ȸ���Դϴ�.");			
		}
		
//		lebgth: �迭�� ����
//		lebgth(): ���ڿ��� ����
//		size: �̷��� ����
//		size(): �÷��� ���� ����� ����
		
		
		System.out.println("-------------------");
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		s2.add(100);
		s2.add(200);
		s2.add(300);
		
		System.out.println("size2:"+s2.size());
		System.out.println(s2.toString()); //���� toString�� �� �ʿ�� ���� �ڵ����� ���ͼ�
		//[ , , , , ] (���)String�� toString() 
		//ArrayList�� toString�� String�� toString�� ���� ���°Ŷ�� ���� �ȴ�.
		
		Integer g2 = s2.get(0);
		System.out.println("g2:"+g2);
		
	}
}


//�迭�� ������ ũ�⸦ ������.
//�÷����� ũ�Ⱑ �������̴�, Ȯ���Ҽ��� ���ϼ��� �ִ�.
//List, Set, Map�� �������̽���.
//List ������ �ִ�. �ߺ����
//Set ������ ���� �ߺ��Ұ�


//add
//set
//remove
