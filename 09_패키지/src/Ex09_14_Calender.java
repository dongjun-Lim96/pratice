import java.util.Calendar;

public class Ex09_14_Calender {
	public static void main(String[] args) {
		//Calendar c = new Calendar(); 왜 안될까?
		
		
		String[] week = {"","일","월","화","수","목","금","토"}; //공백은 일요일이 1이어서
		Calendar cal = Calendar.getInstance(); // getInstance()메서드가 Calendar 객체를 만들어줌
											//getInstance()는 static 메서드로 바로 사용가능
		System.out.println(cal); //cal의 toString은 날자 정보 리턴
		System.out.print(cal.get(Calendar.YEAR)+"년");//get은 일부만 가져옴
		System.out.print(cal.get(Calendar.MONTH)+1+"월");//월만 0부터 시작해서 1을 더해야함
		System.out.print(cal.get(Calendar.DATE)+"일");
		System.out.println();
		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"요일/"); //일요일이 1이어서 금요일이 6이다.
		System.out.print(week[cal.get(Calendar.DAY_OF_WEEK)]+"요일"); 
		
		System.out.println();
		
		int am_pm = cal.get(Calendar.AM_PM);
		if (am_pm == 0) {
			System.out.print("오전");
		}else {
			System.out.print("오후");
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour+"시"+minute+"분"+second+"초");
		
	}
}
