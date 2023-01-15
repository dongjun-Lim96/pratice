import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_15_Date {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println("d:" + now); //toString이 자동으로 붙는다
		
		System.out.print(now.getYear()+1900+"년"); // 1900년이 기준이어서 1900을 더한다.
		System.out.print(now.getMonth()+1+"월"); //월은 0부터
		System.out.println(now.getDate()+"일");
		
		String[] week = {"일","월","화","수","목","금","토"};
		System.out.println(now.getDay()+"요일");
		System.out.println(week[now.getDay()]+"요일");// date는 0이 일요일이다
		
		SimpleDateFormat sdf,sdf2,sdf3;
		sdf = new SimpleDateFormat("YY-MM-D일 E요일");//날자의 형식을 지정하는 클래스
		System.out.println(sdf.format(now));
		
		sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a"); // M은 월이고 m은 분이다 a는 오전오후
		System.out.println(sdf2.format(now));
		
		sdf3 = new SimpleDateFormat("y년 M월 d일");
		System.out.println(sdf3.format(now)); // foramt에는 date 객체만 넣어야한다.
	}
}
