
public class Ex03_07_for {
	public static void main(String[] args) {
		
		/*for(초기식; 조건식; 증강식){
			반복할 문장1;
			반복할 문장2;
		}
		*/
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println("자바 안:"+i);
		}
		System.out.println("자바 밖:" +i);
	}
}
