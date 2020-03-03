package com.dapeng.flow.workhour.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.workhour.dto.WorkHourDto;
/**
 * 工时策略管理器
 * @author Administrator
 *
 */
@Component
public class WorkHourStrategyContext {
	private final Map<String, WorkHourStrategy> strategyMap = new ConcurrentHashMap<>();
	/**策略后缀**/
	private final static String suffix="WorkHourStrategy";
	
	/**
	 * 将实现工时策略接口的实现类注入进来
	 * @param strategyMap
	 */
	@Autowired
	public WorkHourStrategyContext(Map<String,WorkHourStrategy> strategyMap){
		this.strategyMap.clear();
		strategyMap.forEach((k,v)->this.strategyMap.put(k, v));
	}
	
	/**
	 * 策略执行
	 * @param hourDto
	 * @return
	 */
	public ResponseData executeStrategy(WorkHourDto hourDto){
		WorkHourStrategy strategy=strategyMap.get(hourDto.getNodeAttr()+suffix);
		if(strategy==null){
			System.out.println("没有合适的策略执行");
			return null;
		}else{
			return strategy.doSaveWorkHour(hourDto);
		}
   }
	

}
