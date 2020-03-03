package com.dapeng.flow.utils;

import java.util.Date;

/**
 * @Description:    时间工具类
 * @Author:         牛海亮
 * @CreateDate:     2019年10月24日 上午10:41:32
 * @UpdateUser:     牛海亮
 * @UpdateDate:     2019年10月24日 上午10:41:32
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class DateUtils {
	/**
	 * 一天的毫秒数
	 */
	public static long DAY_MILSECONDS=86400000L;
	/**
	 * 一小时的毫秒数
	 */
	public static long HOUR_MILSECONDS=3600000L;
	/**
	 *  一分钟的毫秒数
	 */
	public static long MINUTE_MILSECONDS=60000L;
	/**
	 * 一秒的毫秒数
	 */
	public static long SECOND_MILSECONDS=1000L;

	/**
	 * 
	* 计算两个日期之间的相隔时间，自定义单位
	* @author: 牛海亮
	* @param startTime
	* @param endTime
	* @param unit
	* @return: 参数
	* @return: 返回类型
	* @throws:
	* @date:  2019年10月24日 上午10:54:09
	 */
	public static Long getCostTimeByTwoDate(Date startTime, Date endTime, String unit) {

	    long diff = endTime.getTime() - startTime.getTime();
	    if (unit.equals("day")) {
	      return Long.valueOf(diff / DAY_MILSECONDS);
	    }
	    if (unit.equals("hour")) {
	      return Long.valueOf(diff / HOUR_MILSECONDS);
	    }
	    if (unit.equals("min")) {
	      return Long.valueOf(diff / MINUTE_MILSECONDS);
	    }
	    if (unit.equals("sec")) {
	      return Long.valueOf(diff / SECOND_MILSECONDS);
	    }
	    if (unit.equals("milsec")) {
	    	return diff;
		}
	    return null;
	}
	

	
	

}
