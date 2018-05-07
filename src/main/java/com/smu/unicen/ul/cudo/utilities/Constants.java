package com.smu.unicen.ul.cudo.utilities;

public class Constants {
	
	public static enum Arguments {INPUT,CONFIG};
	public static enum SysConfig {APP_CONFIG,MALLET_KEYWORD,EVENT_KEYWORD,EVENT_SCORE,CONFERENCE_DATA,FLOORPLAN};
	public static enum CodeType {EVENT_TYPE,EVENT_STATUS, PERSON_TYPE, KEYWORD_SOURCE,PREFERENCE};
	public static enum CodeVal {MALLET, EVENT,MUSTGO, MUSTSKIP};
	public static int System=-1;
	public static int Mallet=0;
	public static int Event=1;
	public static boolean ASC=true,DESC=false;
	public static char comma=',',semicolon=';';
	public static enum Status {SUCCESSFUL,UNSUCCESSFUL};
	public static enum PERSON_TYPE {SPEAKER,CHAIR};
		
}
