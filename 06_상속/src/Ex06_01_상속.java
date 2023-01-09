
class Sports{ //�θ�Ŭ����
	private String name; //������
	private int inwon; // 10
	
	public Sports() {
		name = "������";
		inwon = 10;
	}
	
	public Sports(String name, int inwon) {
		this.name = name;
		this.inwon = inwon;
	}
	
	public void display() {
		System.out.println(name+", "+inwon);
	}
}

class Baseball extends Sports{ //�ڼ�Ŭ���� extends �θ�Ŭ����
	//String name;
	//int inwon;
	private double ta;
	
	public Baseball() {
		super("�߱�",9);
		ta = 0.567;
	}
	
	public Baseball(String name, int inwon, double ta) {
		//this.name = name;
		//this.inwon = inwon;
		super(name, inwon);
		this.ta = ta;	
	}
	
	public void display() {
		//System.out.println(name+", "+inwon+", "+ta);
		super.display();
		System.out.println(ta);
	}
}

class Football extends Sports{ //�ڼ�Ŭ���� extends �θ�Ŭ����
	//String name;
	//int inwon;
	private int goal;
	
	public Football() {
		super("�౸",11);
		goal = 3;
	}
	
	public Football(String name, int inwon, int goal) {
		//this.name = name;
		//this.inwon = inwon;
		super(name, inwon);
		this.goal = goal;	
	}
	
	public void display() {
		//System.out.println(name+", "+inwon+", "+goal);
		super.display();
		System.out.println(goal);
	}
}
public class Ex06_01_��� {
	public static void main(String[] args) {
		
		Sports s = new Sports();
		//s.name = "������";
		//s.inwon = 10;
		//System.out.println(s.name+", "+s.inwon);
		s.display();
		
		Sports s2 = new Sports("������", 10);
		s2.display();
		System.out.println("-------------------");
		
		Baseball b = new Baseball();
		b.display();
		//b.name = "�߱�";
		//b.inwon = 9;
		//b.ta = 0.567;
		Baseball b2 = new Baseball("�߱�", 9, 0.567);
		b2.display();
		//System.out.println(b.name+", "+b.inwon+", "+b.ta);
		System.out.println("-------------------");
		
		Football f = new Football();
		f.display();
		//f.name = "�౸";
		//f.inwon = 11;
		//f.goal = 2;
		
		Football f2 = new Football("�౸", 11, 3);
		f2.display();
		//System.out.println(f.name+", "+f.inwon+", "+f.goal);
		System.out.println("*********************");
		
		//Sports s3 = new Sports("������", 10);
		//Sports b3 = new Baseball("�߱�", 9, 0.567);
		//Sports f3 = new Football("�౸", 11, 3);
		
		Sports[] arr = {
				new Sports("������", 10), 
				new Baseball("�߱�", 9, 0.567),
				new Football("�౸", 11, 3)
				};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
		}
		
	}
	
	/*public static void action(Sports s) {
		if (s instanceof Sports) {
			//r.dance(); �θ����� �ڽĸ޼��尡 ��� ȣ���� �ȵȴ�.
			Sports sp = (Sports)s;
			s.display();
		}
		else if (s instanceof Baseball) {
			Baseball bs = (Baseball)s;
			s.display();
		}
		else if (s instanceof Football) {
			Football ft = (Football)s;
			s.display();;
		}
	}*/
}