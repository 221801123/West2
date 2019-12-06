package com.xier.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 工具类
 * @author wuyongyi
 * 2019-12-04
 */
public final class CommonUtil {
	/**
	 * 获得生产日期
	 * @param dataStr
	 * @return
	 * @throws ParseException
	 */
	public static Calendar getProduceDate(String dataStr) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//String->Date
		Date date = sdf.parse(dataStr);
		//Date->Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	
	/**
	 * 将Calendar转换为日期字符串
	 * @param calendar
	 * @return
	 * @throws ParseException
	 */
	public static String convertCalendarToString(Calendar calendar){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date=calendar.getTime();
		return sdf.format(date);
	}
}
