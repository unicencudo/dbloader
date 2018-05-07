package com.smu.unicen.ul.cudo.client;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smu.unicen.ul.cudo.utilities.ConfigurationHelper;
import com.smu.unicen.ul.cudo.utilities.Constants;

public class Loader 
{
	private static final Logger LOGGER = LogManager.getLogger();
	public static ApplicationContext context;
	
    public static void main( String[] args )
    {
    	 Map<String,String> argMap = ConfigurationHelper.getCommandLineArguments(args);
		 String configFile= argMap.get(Constants.Arguments.CONFIG.toString());
		 if(configFile==null) configFile="./config/AppConfig.cnf";
		 
		 try {
			 ConfigurationHelper.getProperties(configFile);
			 String app_config= ConfigurationHelper.SysConfig.get(Constants.SysConfig.APP_CONFIG.toString());
			 context = new ClassPathXmlApplicationContext(app_config);
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
    }
}

