package com.smu.unicen.ul.cudo.utilities;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class StringUtil {

	public static String replaceLast(String string, String toReplace, String replacement) {
	    int pos = string.lastIndexOf(toReplace);
	    if (pos > -1) {
	        return string.substring(0, pos)
	             + replacement
	             + string.substring(pos + toReplace.length(), string.length());
	    } else {
	        return string;
	    }
	}
	
	  public static String concatStrings(List<String> strings, String separator)
	  {
	  	StringBuilder sb = new StringBuilder();
	  	for(int i = 0; i < strings.size(); i++)
	  	{
	  		sb.append(strings.get(i));
	  		if(i < strings.size() - 1)
	  			sb.append(separator);
	  	}
	  	return sb.toString();				
	  }
	  
	  public static String joinQueryCriteria(String query, HashMap<String,String> criteria)
	  {
		  
		  Iterator set = criteria.entrySet().iterator();
			while (set.hasNext()) {
				Map.Entry entry = (Map.Entry) set.next();

				if (entry.getValue() != null)
					query += entry.getKey() + "='" + entry.getValue() + "' and ";
			}

			query = StringUtil.replaceLast(query, "and", "");
			return query;
	  }
	  

		public static boolean isNumeric(String str)
		{
		  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
		}
		
		public static long getMissingHours(String input) throws Exception{
			String[] missingHours= input.split(",");
			long hours=0;
			for(String eachMissed: missingHours){
				String[] fromTo= eachMissed.split("=>");
				Date from= DateUtil.toDate("dd-MM-yyyy HH:mm:ss", fromTo[0]);
				Date to= DateUtil.toDate("dd-MM-yyyy HH:mm:ss", fromTo[1]);
				
				long diff= to.getTime()- from.getTime();
				long eachHours = TimeUnit.MILLISECONDS.toHours(diff); 
				hours+=eachHours;
			}
			return hours;
		}
		
		public static void main(String[] args){
			try{
			String input="01-11-2015 01:00:00=>01-11-2015 04:00:00";
			long hours=getMissingHours(input);
			System.out.println(hours);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
			
		}

}
