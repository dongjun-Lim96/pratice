import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_02_ArrayList {
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = new int[5];
		
		
		ArrayList<String> s1 = new ArrayList<String>();
		int size = s1.size();
		
		
		System.out.println("size:"+size);	
		s1.add("태연"); //0 //추가 메서드
		s1.add("수연"); //1
		s1.add("유리"); //2
		s1.add("수영"); //3
		
		System.out.println(s1);
		
		size = s1.size();
		System.out.println("size:"+size); //toString이 붙어있다
		//[ , , , , ] (요소)String의 toString()
		
		s1.add(1, "써니");
		System.out.println(s1.toString());
		
		String g = s1.get(0);
		System.out.println("g:"+g);
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("웬디");
		add.add("슬기");
		
		s1.addAll(add); //ArratList 전체 추가
		System.out.println(s1.toString());
		
		size = s1.size();
		System.out.println("size:"+size);
		
		//s1.remove(1);
		s1.remove("수연");  //삭제 메서드
		
		
		ArrayList<String> delete = new ArrayList<String>();
		delete.add("수영");
		delete.add("유리");
		
		s1.removeAll(delete); //여러개를 지울 떄에는 컬렉션을 새로 만들어서 removeall로 전체 삭제
		System.out.println(s1.toString());
		s1.add("웬디");
		System.out.println(s1.toString());
		
		
		int index1 = s1.indexOf("웬디");
		int index2 = s1.lastIndexOf("웬디");
		System.out.println(index1+","+index2);
		
		if (index1 == -1) {
			System.out.println("웬디가 없습니다");
		}
		
		boolean result =s1.contains("슬가");
		System.out.println("result:" + result);
		
		if (result == false) {
			System.out.println("웬디가 없습니다");
		}
		
		System.out.println(s1.toString());
		
		s1.set(2, "윤아"); //교체 메서드
		System.out.println(s1.toString());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		
		if (s1.indexOf(name) != -1) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		boolean flag = false;
		for (int i = 0; i < s1.size(); i++) {
			if (s1.get(i).equals(name)) {
				System.out.println("가입한 회원입니다.");
				flag = true;
				break;
			}			
		}
		if (flag == false) {
			System.out.println("가입하지 않은 회원입니다.");			
		}
		
//		lebgth: 배열의 길이
//		lebgth(): 문자열의 길이
//		size: 이런건 없다
//		size(): 컬렉션 안의 요소의 갯수
		
		
		System.out.println("-------------------");
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		s2.add(100);
		s2.add(200);
		s2.add(300);
		
		System.out.println("size2:"+s2.size());
		System.out.println(s2.toString()); //굳이 toString을 쓸 필요는 없다 자동으로 나와서
		//[ , , , , ] (요소)String의 toString() 
		//ArrayList의 toString과 String의 toString이 같이 나온거라고 보면 된다.
		
		Integer g2 = s2.get(0);
		System.out.println("g2:"+g2);
		
	}
}


//배열은 고정된 크기를 가진다.
//컬렉션은 크기가 유동적이다, 확장할수도 줄일수도 있다.
//List, Set, Map은 인터페이스다.
//List 순서가 있다. 중복허용
//Set 순서가 없고 중복불가


//add
//set
//remove
