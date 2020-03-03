package com.dapeng.flow.workhour.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 * 百度地图key
 * 
 * @Author: 牛海亮
 * @CreateDate: 2020年1月10日 下午3:30:30
 * @UpdateUser: 牛海亮
 * @UpdateDate: 2020年1月10日 下午3:30:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class BMapUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(BMapUtils.class);

	private static final String distanceUrl = "http://api.map.baidu.com/directionlite/v1/driving?origin=%s&destination=%s&ak=%s";

	/**
	 * 
	 * 计算驾车的位移
	 * 
	 * @author: 牛海亮
	 * @param fromLatitude   出发纬度
	 * @param fromLongtitude 出发经度
	 * @param toLatitude     到达纬度
	 * @param toLongtitude   到达经度
	 * @return:Integer
	 * @date: 2020年1月10日 下午3:40:37
	 */
//	public static Integer getDistance(String fromLatitude, String fromLongtitude, String toLatitude,
//			String toLongtitude) {
//		Integer distance = null;
//		String source = fromLatitude + ',' + fromLongtitude;
//		String destination = toLatitude + ',' + toLongtitude;
//		String url = String.format(distanceUrl, source, destination, BMapKey.KEY);
//		String jsonStr = HttpUtils.httpGetRequest(url);
//		com.alibaba.fastjson.JSONObject json = com.alibaba.fastjson.JSONObject.parseObject(jsonStr);
//		String status = "status";
//		if (json.getInteger(status) == 0) {
//			JSONObject distanceJson = json.getJSONObject("result");
//			JSONArray routes = distanceJson.getJSONArray("routes");
//			JSONObject object = (JSONObject) routes.get(0);
//			distance = object.getInteger("distance");
//		} else {
//			LOGGER.error("调用百度地图获取两点距离信息失败,出发地址信息:" + source + ",到达地址信息:" + destination);
//		}
//		return distance;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(getDistance("39.862268", "116.434395", "39.862542", "116.434651"));
//	}

}
