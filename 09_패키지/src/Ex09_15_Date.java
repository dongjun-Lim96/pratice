import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_15_Date {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println("d:" + now); //toString�� �ڵ����� �ٴ´�
		
		System.out.print(now.getYear()+1900+"��"); // 1900���� �����̾ 1900�� ���Ѵ�.
		System.out.print(now.getMonth()+1+"��"); //���� 0����
		System.out.println(now.getDate()+"��");
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		System.out.println(now.getDay()+"����");
		System.out.println(week[now.getDay()]+"����");// date�� 0�� �Ͽ����̴�
		
		SimpleDateFormat sdf,sdf2,sdf3;
		sdf = new SimpleDateFormat("YY-MM-D�� E����");//������ ������ �����ϴ� Ŭ����
		System.out.println(sdf.format(now));
		
		sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a"); // M�� ���̰� m�� ���̴� a�� ��������
		System.out.println(sdf2.format(now));
		
		sdf3 = new SimpleDateFormat("y�� M�� d��");
		System.out.println(sdf3.format(now)); // foramt���� date ��ü�� �־���Ѵ�.
	}
}
