package com.smu.unicen.ul.cudo.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; 

public class DateUtil {
	
	public static int getDayOfWeek(Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_WEEK);
	}
	
	public static String toString(String format, Date date){
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
	
	public static Date toDate(String format, String date) throws ParseException  {
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.parse(date);
	}
	
	
	public static Date changeDateFormat(String format, Date date) throws ParseException{
		
		SimpleDateFormat dateForm = new SimpleDateFormat(format);
		String newDate = dateForm.format(date);            
		Date changeDate = dateForm.parse(newDate);
		return changeDate;
	
	}
	
   public static Date truncateDate(Date date) throws ParseException{
		
	   Calendar cal = Calendar.getInstance(); // locale-specific
	   cal.setTime(date);
	   cal.set(Calendar.HOUR_OF_DAY, 0);
	   cal.set(Calendar.MINUTE, 0);
	   cal.set(Calendar.SECOND, 0);
	   cal.set(Calendar.MILLISECOND, 0);   
	   
	   return cal.getTime();
	
	}
   
   public static Date truncateDate(int levelTruncation, Date date) throws ParseException{
		
	   Calendar cal = Calendar.getInstance(); // locale-specific
	   cal.setTime(date);
	   switch(levelTruncation){
	   		case Calendar.HOUR_OF_DAY:
	   		   cal.set(Calendar.MINUTE, 0);
		   	   cal.set(Calendar.SECOND, 0);
		   	   cal.set(Calendar.MILLISECOND, 0);
		   	   break;
		   	 
	   		default: break;
	   }
	   return cal.getTime();
	
	}
   
   public static Date concatDateTime(Date date, Date time) throws ParseException{
		
	   Calendar cal1 = Calendar.getInstance();
	   cal1.setTime(date);
	   
	   Calendar cal2 = Calendar.getInstance();
	   cal2.setTime(time);
	  
	   cal1.set(Calendar.HOUR, cal2.get(Calendar.HOUR));
	   cal1.set(Calendar.MINUTE, cal2.get(Calendar.MINUTE));
	   
	   return truncateDate(Calendar.HOUR_OF_DAY,cal1.getTime());
	
	}
   
   public static Date addDays(Date date, int noOfDays) throws ParseException{
		
	   Calendar cal = Calendar.getInstance();
	   cal.setTime(date);
	   cal.add(Calendar.DATE, noOfDays);
	   return cal.getTime();
	   
	}
	

}
