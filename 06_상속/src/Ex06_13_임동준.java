
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
public class Ex06_13_�ӵ��� {
	public static void main(String[] args) {

		PartTime p = new PartTime("P1", "����", 30 ,30);
		Contract c = new Contract("C2", "����", 250 ,3);
		FullTime f = new FullTime("F3", "����", 3000 , 500);

		System.out.println("��ƮŸ�� �޿�:"+p.getMonthPay());
		System.out.println("����� �޿�:"+c.getMonthPay());
		System.out.println("������ �޿�:"+f.getMonthPay());

		//�迭�� ó��

		System.out.println("========================");
		
		Employee3[] arr = {
				new PartTime("P1", "����", 30 ,30),
				new Contract("C2", "����", 250 ,3),
				new FullTime("F3", "����", 3000 , 500)
		};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(
							"���:"+arr[i].empno +"\t"+
							"�̸�:"+arr[i].name +"\t"+
							"�ݾ�:"+arr[i].pay +"\t"+
							"�޿�:"+arr[i].getMonthPay()
					);
		}
	}
}


//��� �̸� �ݾ��� ���
//���� ��� �޼���� �߻�޼���(double �����ϴ�)
//pay/(double)12
//�迭�ε� ó��