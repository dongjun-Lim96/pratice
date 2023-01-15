class Top<T>{
	private T data;

	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}

public class Ex10_01_generic {
	public static void main(String[] args) {
		String str = "Generic 방식";
		
		Top<String> t = new Top<String>(); //객체를 만들떄 미지정 자료형이 확정됨
		t.setData(str);
		String s1 = t.getData();
		System.out.println(s1);
		System.out.println();
		
		Top<Integer> t2 = new Top<Integer>();
		//Integer data = 123 // 123 => new Integer(123)
		t2.setData(123);
		Integer s2 = t2.getData();
		System.out.println(s2);
		
		Top<Double> t3 = new Top<Double>();
		t3.setData(1.1);
		System.out.println(t3.getData());
		
		
	}
}


//generic: 하나의 코드를 여러 타입에 재사용 할수 있는 기술