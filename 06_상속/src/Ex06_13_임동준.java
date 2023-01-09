
abstract class Employee3{

	String empno;
	String name;
	int pay;

	public Employee3(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}


	abstract public double getMonthPay();	
}

class FullTime extends Employee3{
	int bonus;

	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	public double getMonthPay() {
		return (pay/(double)12)+(bonus/(double)12);
	}
}

class Contract extends Employee3{
	int hireYear;

	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	public double getMonthPay() {
		return pay/(double)12*hireYear;
	}
}

class PartTime extends Employee3{
	int workDay;

	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	public double getMonthPay() {
		return pay*workDay;
	}
}
public class Ex06_13_임동준 {
	public static void main(String[] args) {

		PartTime p = new PartTime("P1", "수지", 30 ,30);
		Contract c = new Contract("C2", "보검", 250 ,3);
		FullTime f = new FullTime("F3", "제니", 3000 , 500);

		System.out.println("파트타임 급여:"+p.getMonthPay());
		System.out.println("계약직 급여:"+c.getMonthPay());
		System.out.println("정규직 급여:"+f.getMonthPay());

		//배열로 처리

		System.out.println("========================");
		
		Employee3[] arr = {
				new PartTime("P1", "수지", 30 ,30),
				new Contract("C2", "보검", 250 ,3),
				new FullTime("F3", "제니", 3000 , 500)
		};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(
							"사번:"+arr[i].empno +"\t"+
							"이름:"+arr[i].name +"\t"+
							"금액:"+arr[i].pay +"\t"+
							"급여:"+arr[i].getMonthPay()
					);
		}
	}
}


//사번 이름 금액은 상속
//월급 계산 메서드는 추상메서드(double 리턴하는)
//pay/(double)12
//배열로도 처리