package com.dapeng.flow.workhour.strategy;

import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.workhour.dto.WorkHourDto;

public interface WorkHourStrategy {
	
	public ResponseData doSaveWorkHour(WorkHourDto hourDto);

}
