package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // getInstance -> 팩토리 메소드
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11); // 11 = 12 = (Month + 1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2000, 0, 1); // 2000/1/1
		cal.add(Calendar.DATE, 100); 
		// set으로 설정한 날부터 100일 되는날이 출력됨. 2000/1/1일 이후 100일째
		printDate(cal);
		

	}

	private static void printDate(Calendar cal) {
//		final int A = 10; 
//		 a에 10이 대입되는 것이 이게 마지막임. -> 그 뒤에 다른 값 대입 못함. 대문자로 표기하는 것이 관례
//		a = 20; 이걸 넣어버리면 오류남.
		final String[] DAYS = {"일","월","화","수","목","금","토"};
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0 ~ 11
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1 ~ 7, 일요일 ~ 토요일.
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + (month+1 < 10 ? "0" : "")+(month + 1) + "월 " + (date < 10 ? "0" : "") + date +  "일 " 
		+DAYS[day-1]+"요일 "+ hour + "시 " + minute + "분 " + second+"초");
		
	}

}
