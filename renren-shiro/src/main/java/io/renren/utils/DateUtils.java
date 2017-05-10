package io.renren.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日期工具类
 * 
 * @author zhaoziwei
 * @date 2015年10月26日 下午5:36:13
 */
public class DateUtils {
	private static Logger log = LoggerFactory.getLogger(DateUtils.class);

	private DateUtils(){}

	/**
	 * 根据指定格式要求格式化日期
	 * 
	 * @throws ParseException
	 */
	public static Date formatDate(Date date, String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		String str = dateFormat.format(date);
		Date ret = null;

		try {
			ret = dateFormat.parse(str);
		} catch (ParseException e) {
			log.error("字符串转日期异常!", e);
		}
		return ret;
	}

	/**
	 * 根据指定日期与天数(可为负数),返回当前日期加上此天数侯的日期
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date getDay(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}

	/**
	 * 根据指定格式 把字符串转成日期格式
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static Date strToDate(String str, String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date ret = null;
		try {
			ret = dateFormat.parse(str);
		} catch (ParseException e) {
			log.error("字符串转日期异常!", e);
		}
		return ret;
	}
	
	/**
	 * 根据指定格式把日期转成字符串
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String dateToStr(Date date, String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}
	

}
