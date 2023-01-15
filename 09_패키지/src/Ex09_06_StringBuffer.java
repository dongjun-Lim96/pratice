
public class Ex09_06_StringBuffer {
	public static void main(String[] args) {
		
		String str1 = "Have ";
		String str2 = "a ";
		String str3 = "nice day";
		String str4 = str1+str2+str3;
		System.out.println(str4);
		str4 = str4.replace("nice", "good");
		System.out.println(str4);
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Have ");
		sb.append("a ");
		sb.append("nice day");
		
		System.out.println("sb:"+ sb);
		sb.replace(7, 11, "good");
		System.out.println("sb:"+ sb);
		
		sb.insert(7, "happy ");
		System.out.println("sb:"+ sb);
		
		sb.delete(6, 12);
		System.out.println("sb:"+ sb);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		String ss1 = sb1.toString();
		String ss2 = sb2.toString();
		
		System.out.println(s1.equals(s2));
		System.out.println(sb1.equals(sb2));
		System.out.println(ss1.equals(ss2));
	}
}

//String은 변경이 안된다, 새로운 주소를 만든다
//StringBuffer는 한 주소에 추가 변경 가능
//이미 있던 주소에 추가하므로 속도가 String보다 빠르다
//StringBuffer의 equals는 오버라이딩 되어있지 않아서 toString을
//호출한 다음 String 넣은후 String의 equals로 하면 된다

//append: 추가
//replace: 교체
//insert: 삽입
//delete: 삭제