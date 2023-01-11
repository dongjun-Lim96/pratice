
public class Ex09_03_String {
	public static void main(String[] args) {

		int a;
		double b;
		String c; // String Ŭ���� == �ڷ���

		//		String s1 = "Have a nice day"; //"Have a nice day"�� s1,s2 ��� ������
		//		String s2 = "Have a nice day"; //���� �ϳ��� �޶� �ٸ� �ּһ���

		String s1 = new String("Have a nice day"); //���ο� ���� �Ҵ�
		String s2 = new String("Have a nice day"); //�̰� ���� ���ϸ� �ּҰ� �޶� falseó����
		String s3 = "hahaha"; //���ͷ� ǥ����
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println(s1==s2); //�ּҺ�

		int len = s1.length();
		System.out.println(len);

		boolean result1 = s1.equals(s2); //String�ȿ� ���ڿ��� ���ϴ� �������̵�, Object equals()�� �ƴ�
		System.out.println(result1); //String�� equals�� �ּҺ񱳰� �ƴϴ�.

		result1 = s1.equalsIgnoreCase(s2);
		System.out.println(result1);

		int reulst2 = s1.compareToIgnoreCase(s2);
		System.out.println(reulst2);
		if (reulst2 == 0) {
			System.out.println("�� ���ڿ� ����");
		}else {
			System.out.println("�� ���ڿ� ���� ����");			
		}
		
		System.out.println("=====================");
		
		String s4 = s1.concat(s3);
		System.out.println(s1.concat(s3));
		System.out.println(s1+s3);
		
		int result3 = s1.indexOf("nice");
		//Have a nice day �տ������� 7���� n
		System.out.println(result3); //��ã���� -1 �� ���´�
		
		result3 = s1.lastIndexOf('a'); //�ƽ�Ű �ڵ�� ã��
		//Have a nice day ������ a�� ã�´�.
		System.out.println(result3); //��ã���� -1 �� ���´�
		
		System.out.println("=====================");
		
		//Have a nice day 3���� 9 �տ� �ִ°� ���� ��������
		String result4 = s1.substring(7,11);
		System.out.println(result4);
		//e a ni
		
		//Have a nice day
		result4 = s1.substring(7); //7���� ������ �����´�.
		System.out.println(result4);
		
		result4 = s1.replace('a', 'x'); // a�� x�� �ٲ۴�.
		System.out.println(result4); 
		
		System.out.println("====================");
		
		result4 = s1.toString(); //String Ŭ������ toString�� �������̵� �Ǿ��ִ�.
		System.out.println(result4);
		System.out.println(s1);
		System.out.println(s1.toString());
		
		result4 = s1.toLowerCase(); //���� �ҹ��ڷ� ����
		System.out.println(result4);
		
		result4 = s1.toUpperCase();
		System.out.println(result4);
		
		System.out.println(s1.contains("ce"));
		System.out.println(s1.contains("abc")); // abc�� ����
		
		String s5 = "    abc de FG  ";
		System.out.println(s5);
		System.out.println(s5.length());
		
		String s6 = s5.trim();
		System.out.println(s6);
		System.out.println(s6.length());
		
		char ch = s1.charAt(2); // �� ��ġ�� ���� ��������
		System.out.println(ch);
		
		String fullName = "Hello.java"; //a.txt, picture.jpg
		String fileName; //Hello
		String ext;//java
		
		
		int index = fullName.indexOf('.');
		
		fileName = fullName.substring(0, index);
		ext = fullName.substring(index+1);
		
		System.out.println("ȭ�ϸ�:"+ fileName);
		System.out.println("Ȯ����:"+ ext);
	}
}


//equalsIgnoreCase: ��ҹ��� ���о��� ���� ��
//compareTo: ���̺� ,���(����)�� ���ڷ� ����
//compareToIgnoreCase: ��ҹ��� �����ϰ� ��
//concat: ���ڿ� ����
//indexOf: ��ġ�� ã�� �޼���, ��ã���� -1
//lastIndexOf: �ڿ������� ��ġ�� ã�� �޼���, ��ã���� -1
//substring: ���ڿ� �Ϻ� �����Ë� ����ϴ� �޼��� 3~9
//replace: ���ڿ� �ٲٰ� ������
//toLowerCase: ���� �ҹ��ڷ� ����
//contains: ���Կ��� Ȯ��
//trim: �յڰ��� ���� , ���� ������ ���д�.
//charAt: �Ű����� �ڸ� ���� ����