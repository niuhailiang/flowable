package com.dapeng.flow.workhour.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.workhour.dto.WorkHourDto;
import com.dapeng.flow.workhour.service.WorkHourService;
import com.dapeng.flow.workhour.strategy.WorkHourStrategyContext;

@Service
public class WorkHourServiceImpl implements WorkHourService {
	
	@Autowired
   private WorkHourStrategyContext strategyContext;
	@Override
	public ResponseData saveWorkHour(WorkHourDto hourDto) {
		return strategyContext.executeStrategy(hourDto);
	}

}
