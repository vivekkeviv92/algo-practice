package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_diff {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String time1 = "18:59:59.999";
		String time2 = "19:00:00.000";

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.S");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime(); 
		System.out.println(difference/1000.000);

	}

}
