import java.util.Date;

import com.javastudy.Car;

/*class Car{
	private int speed;
	private String direction;
	
	public Car(int speed, String direction) {
		this.speed = speed;
		this.direction = direction;
	}
	
	public void prncar() {
		System.out.println("speed: "+speed);
		System.out.println("direction: "+direction);
	}
}// Car
*/

public class Ex06_06_import {
	public static void main(String[] args) {
		Car car = new Car(100, "동남");
		car.prncar();
		
		//java.lang.System.out.println(123);
		System.out.println(123);
		System.out.println("하하하");
		
		String s = "아이유";
		
		//java.util.Date d = new Date();
		Date d = new Date();
		System.out.println("d:"+d);
	}
}
