package com.smu.unicen.ul.cudo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class ConfigurationHelper {
	
	public static Map<String,String> SysConfig;
	
	public static void getProperties(String filename) throws Exception{
		
		Properties SysProperties = new Properties();
		InputStream input = null;
		
	    try {
	    	input = new FileInputStream(filename);
	    	String appConfig= Constants.SysConfig.APP_CONFIG.toString(),
	    			malletKeyword= Constants.SysConfig.MALLET_KEYWORD.toString(), 
	    			companyKeyword=Constants.SysConfig.EVENT_KEYWORD.toString(),
	    			eventScore=Constants.SysConfig.EVENT_SCORE.toString(),
	    			conferenceData=Constants.SysConfig.CONFERENCE_DATA.toString(),
	    			floorplan= Constants.SysConfig.FLOORPLAN.toString();
	    	SysProperties.load(input);
	    	
	    	SysConfig= new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
	    	
	    	SysConfig.put(appConfig,(String)SysProperties.get(appConfig));
	    	SysConfig.put(malletKeyword,(String)SysProperties.get(malletKeyword));
	    	SysConfig.put(companyKeyword,(String)SysProperties.get(companyKeyword));
	    	SysConfig.put(eventScore,(String)SysProperties.get(eventScore));
	    	SysConfig.put(conferenceData,(String)SysProperties.get(conferenceData));
	    	SysConfig.put(floorplan,(String)SysProperties.get(floorplan));
	    	
	    	
	    } catch (Exception ex) { 
	    	   throw ex;
	    }finally{
	    	if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					throw e;
				}
			}
	    }
	}
	
	public static Map<String, String> getCommandLineArguments(String[] args) {
        Map<String,String> parameters = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

        for(int i = 0; i < args.length; i+=2) {
            parameters.put(args[i].replaceAll("-",""), args[i+1]);
        }

        return parameters;
    }
}
