import java.util.Calendar;

public class Ex09_14_Calender {
	public static void main(String[] args) {
		//Calendar c = new Calendar(); �� �ȵɱ�?
		
		
		String[] week = {"","��","��","ȭ","��","��","��","��"}; //������ �Ͽ����� 1�̾
		Calendar cal = Calendar.getInstance(); // getInstance()�޼��尡 Calendar ��ü�� �������
											//getInstance()�� static �޼���� �ٷ� ��밡��
		System.out.println(cal); //cal�� toString�� ���� ���� ����
		System.out.print(cal.get(Calendar.YEAR)+"��");//get�� �Ϻθ� ������
		System.out.print(cal.get(Calendar.MONTH)+1+"��");//���� 0���� �����ؼ� 1�� ���ؾ���
		System.out.print(cal.get(Calendar.DATE)+"��");
		System.out.println();
		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"����/"); //�Ͽ����� 1�̾ �ݿ����� 6�̴�.
		System.out.print(week[cal.get(Calendar.DAY_OF_WEEK)]+"����"); 
		
		System.out.println();
		
		int am_pm = cal.get(Calendar.AM_PM);
		if (am_pm == 0) {
			System.out.print("����");
		}else {
			System.out.print("����");
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour+"��"+minute+"��"+second+"��");
		
	}
}
