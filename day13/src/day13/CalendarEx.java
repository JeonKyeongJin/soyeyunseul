package day13;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String message, Calendar cal) {
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);

		System.out.println(message + hour + "시 " + minute + "분 입니다. ");

		if (hourOfDay >= 4 && hourOfDay < 12)
			System.out.println("Good Morning");
		else if (hourOfDay >= 12 && hourOfDay < 18)
			System.out.println("Good Afternoon");
		else if (hourOfDay >= 18 && hourOfDay < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");

	}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재 시간은 ", now);

	}

}
