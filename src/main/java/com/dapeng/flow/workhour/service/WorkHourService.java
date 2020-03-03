package com.dapeng.flow.workhour.service;


import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.workhour.dto.WorkHourDto;

public interface WorkHourService {

	ResponseData saveWorkHour(WorkHourDto hourDto);

}
