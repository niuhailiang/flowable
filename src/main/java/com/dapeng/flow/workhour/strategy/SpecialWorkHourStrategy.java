package com.dapeng.flow.workhour.strategy;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.utils.DateUtils;
import com.dapeng.flow.utils.UUIDUtil;
import com.dapeng.flow.workhour.dao.NodeWorkHourDoMapper;
import com.dapeng.flow.workhour.dto.WorkHourDto;
import com.dapeng.flow.workhour.pojo.NodeWorkHourDo;

@Service("specialWorkHourStrategy")
public class SpecialWorkHourStrategy implements WorkHourStrategy {
    @Autowired
	private NodeWorkHourDoMapper nodeWorkHourDoMapper;
    @Transactional
	@Override
	public ResponseData doSaveWorkHour(WorkHourDto hourDto) {
    	NodeWorkHourDo hourDo=new NodeWorkHourDo();
		hourDo.setId(UUIDUtil.getUUID());
		hourDo.setCostTime(DateUtils.getCostTimeByTwoDate(hourDto.getBeginTime(),hourDto.getEndTime(),"sec").intValue());
		BeanUtils.copyProperties(hourDto, hourDo);
		//恢复操作
		if(hourDto.getNodeType().intValue()==5&&hourDto.getTpCalculate()==null){
			hourDto.setTpCalculate(false);
		}
		int num=nodeWorkHourDoMapper.insertSelective(hourDo);
		if(num>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

}
