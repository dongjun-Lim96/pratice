
public class Ex09_09_Wrapper {
	public static void main(String[] args) {
		String[] str = {"231", "78", "1.234", "97"};
		int num = 0;

		try {
			for (int i = 0; i < str.length; i++) {
				num = Integer.parseInt(str[i]);
				System.out.println(num);
			}

		} catch (NumberFormatException e) {
			System.out.println("정수변환 불가능");
		}

		double num2 = 0;
		for (int i = 0; i < str.length; i++) {
			try {
				int k = Integer.parseInt(str[i]);
			} catch (Exception e) {
				//System.out.println("정수변환 불가능");
			}
			num2 = Double.parseDouble(str[i]);
			System.out.println((int)num2);
		}

	}
}
