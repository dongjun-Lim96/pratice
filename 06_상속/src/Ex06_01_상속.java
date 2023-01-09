
class Sports{ //부모클래스
	private String name; //스포츠
	private int inwon; // 10
	
	public Sports() {
		name = "스포츠";
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

class Baseball extends Sports{ //자손클래스 extends 부모클래스
	//String name;
	//int inwon;
	private double ta;
	
	public Baseball() {
		super("야구",9);
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

class Football extends Sports{ //자손클래스 extends 부모클래스
	//String name;
	//int inwon;
	private int goal;
	
	public Football() {
		super("축구",11);
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
public class Ex06_01_상속 {
	public static void main(String[] args) {
		
		Sports s = new Sports();
		//s.name = "스포츠";
		//s.inwon = 10;
		//System.out.println(s.name+", "+s.inwon);
		s.display();
		
		Sports s2 = new Sports("스포츠", 10);
		s2.display();
		System.out.println("-------------------");
		
		Baseball b = new Baseball();
		b.display();
		//b.name = "야구";
		//b.inwon = 9;
		//b.ta = 0.567;
		Baseball b2 = new Baseball("야구", 9, 0.567);
		b2.display();
		//System.out.println(b.name+", "+b.inwon+", "+b.ta);
		System.out.println("-------------------");
		
		Football f = new Football();
		f.display();
		//f.name = "축구";
		//f.inwon = 11;
		//f.goal = 2;
		
		Football f2 = new Football("축구", 11, 3);
		f2.display();
		//System.out.println(f.name+", "+f.inwon+", "+f.goal);
		System.out.println("*********************");
		
		//Sports s3 = new Sports("스포츠", 10);
		//Sports b3 = new Baseball("야구", 9, 0.567);
		//Sports f3 = new Football("축구", 11, 3);
		
		Sports[] arr = {
				new Sports("스포츠", 10), 
				new Baseball("야구", 9, 0.567),
				new Football("축구", 11, 3)
				};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
		}
		
	}
	
	/*public static void action(Sports s) {
		if (s instanceof Sports) {
			//r.dance(); 부모한테 자식메서드가 없어서 호출이 안된다.
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