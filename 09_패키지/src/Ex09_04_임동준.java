import java.util.Iterator;
import java.util.Scanner;

class Person2{
	private String id;
	private String pw;
	private String name;

	public Person2(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}

}

<<<<<<< HEAD
public class Ex09_04_ìž„ë™ì¤€ {
	public static void main(String[] args) {

		Person2[] arr = {
				new Person2("kim","1234","ê¹€ì—°ì•„"),
				new Person2("son","7777","ì†í¥ë¯¼"),
				new Person2("jo","9876","ì¡°ê·œì„±")
		};

		Scanner sc= new Scanner(System.in);

		do {
			int loop = 0;
			System.out.print("idìž…ë ¥:");
			String id = sc.next();
			if (id.length() > 8 || id.length() < 2) {
				System.out.println("idëŠ” 2ê¸€ìž~8ê¸€ìž ìž…ë ¥í•´ì•¼ í•©ë‹ˆë‹¤.");
				continue;
			}else {
				for (int i = 0; i < arr.length; i++) {
					if (id.equals(arr[i].getId())) {
						System.out.print("pwìž…ë ¥:");
						String pw = sc.next();
						if (pw.equals(arr[i].getPw())) {
							System.out.println(arr[i].getName()+"ë‹˜ ë°˜ê°‘ìŠµë‹ˆë‹¤.");
						}else {
							System.out.println("ë¹„ë²ˆì´ ë§žì§€ ì•ŠìŠµë‹ˆë‹¤.");
						}
					}else {
						loop++;
					}
				}
				if (loop == arr.length) {
					System.out.println("ì¼ì¹˜í•˜ëŠ” idê°€ ì—†ìŠµë‹ˆë‹¤.");
					continue;
				}
			}

			System.out.print("ê³„ì†?");
			String key = sc.next();
			if (key.equals("n")) {
				System.out.println("í”„ë¡œê·¸ëž¨ì„ ì¢…ë£Œí•©ë‹ˆë‹¤.");
				break;
			}

		} while (true);

	}
}
=======
public class Ex09_04_ÀÓµ¿ÁØ {
	public static void main(String[] args) {

		Person2[] arr = {
				new Person2("kim","1234","±è¿¬¾Æ"),
				new Person2("son","7777","¼ÕÈï¹Î"),
				new Person2("jo","9876","Á¶±Ô¼º")
		};

		Scanner sc= new Scanner(System.in);

		do {
			int count = 0;
			System.out.print("idÀÔ·Â:");
			String id = sc.next();
			
			if (id.length() > 8 || id.length() < 3) {
				System.out.println("id´Â 3±ÛÀÚ~8±ÛÀÚ ÀÔ·ÂÇØ¾ß ÇÕ´Ï´Ù.");
				continue;
			}

			for (Person2 p : arr) {
				if (id.equals(p.getId())) {
					System.out.print("pwÀÔ·Â:");
					String pw = sc.next();

					if (pw.equals(p.getPw())) {
						System.out.println(p.getName()+"´Ô ¹Ý°©½À´Ï´Ù.");
					}else {
						System.out.println("ºñ¹øÀÌ ¸ÂÁö ¾Ê½À´Ï´Ù.");
						continue;
					}
				}else {
					count++;
				}
				if (count == arr.length) {
					System.out.println("ÀÏÄ¡ÇÏ´Â id°¡ ¾ø½À´Ï´Ù.");
					continue;
				}
			}

			System.out.print("°è¼Ó?:");
			String key = sc.next();
			if (key.equals("n")) {
				System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
				break;
			}
		} while (true);
	}
}
>>>>>>> branch 'master' of https://github.com/dongjun-Lim96/pratice.git
