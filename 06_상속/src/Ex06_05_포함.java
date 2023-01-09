
class Person3{
	private String name;
	int age;

	public Person3() {

	}

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
}//Person3

class Worker {
	Person3 p;
	String job;
	
	public Worker(String name, int age, String job) {
		p = new Person3(name, age);
		this.job = job;
	}
	
	public void display() {		
		System.out.println("name:"+p.getName());
		System.out.println("age:"+p.age);
		System.out.println("job:"+job);
	}
}//Worker

public class Ex06_05_포함 {
	public static void main(String[] args) {
		Worker w = new Worker("슈가",70,"가수");
		w.display();
	}
}
