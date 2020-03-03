package com.dapeng.flow.workhour.strategy;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.utils.DateUtils;
import com.dapeng.flow.utils.UUIDUtil;
import com.dapeng.flow.workhour.constant.PathConst;
import com.dapeng.flow.workhour.dao.NodeWorkHourDoMapper;
import com.dapeng.flow.workhour.dao.PathPlanDoMapper;
import com.dapeng.flow.workhour.dto.PathPlanDto;
import com.dapeng.flow.workhour.dto.RealPathDto;
import com.dapeng.flow.workhour.dto.WorkHourDto;
import com.dapeng.flow.workhour.pojo.NodeWorkHourDo;
import com.dapeng.flow.workhour.pojo.PathPlanDo;

@Service("pathWorkHourStrategy")
public class PathWorkHourStrategy implements WorkHourStrategy {
	@Autowired
	private NodeWorkHourDoMapper nodeWorkHourDoMapper;
    @Autowired
    private PathPlanDoMapper pathPlanDoMapper;
    @Transactional
	@Override
	public ResponseData doSaveWorkHour(WorkHourDto hourDto) {
    	NodeWorkHourDo hourDo=new NodeWorkHourDo();
		hourDo.setId(UUIDUtil.getUUID());
		hourDo.setCostTime(DateUtils.getCostTimeByTwoDate(hourDto.getBeginTime(),hourDto.getEndTime(),"sec").intValue());
		BeanUtils.copyProperties(hourDto, hourDo);
		nodeWorkHourDoMapper.insertSelective(hourDo);
		Byte nodeType=hourDto.getNodeType();
		PathPlanDo pathDo=null;
		//1 出发
        if(nodeType==PathConst.DEST_START&&hourDto.getPathPlan()!=null){
        	pathDo=new PathPlanDo();
        	BeanUtils.copyProperties(hourDto.getPathPlan(), pathDo);
        	pathDo.setId(UUIDUtil.getUUID());
        	pathDo.setCreateId(hourDto.getProPeople());
        	pathDo.setCreateName(hourDto.getProPeopleName());
        	pathDo.setCreateTime(new Date());
        	pathDo.setPlanType(PathConst.DEST_TYPE);
        	pathPlanDoMapper.insertSelective(pathDo);
        }else if(nodeType==PathConst.DEST_ARRIVE&&hourDto.getRealPath()!=null){
        	PathPlanDo destPath=pathPlanDoMapper.getOnePath(hourDto.getWrCode(), PathConst.DEST_TYPE);
        	if(destPath!=null){
        		pathDo=new PathPlanDo();
        		BeanUtils.copyProperties(hourDto.getRealPath(), pathDo);
        		pathDo.setId(destPath.getId());
        		pathDo.setUpdateId(hourDto.getProPeople());
            	pathDo.setUpdateName(hourDto.getProPeopleName());
            	pathDo.setUpdateTime(new Date());
        		pathPlanDoMapper.updateByPrimaryKeySelective(pathDo);
        	}
        } else if(nodeType==PathConst.BACK_START&&hourDto.getPathPlan()!=null){
        	pathDo=new PathPlanDo();
        	BeanUtils.copyProperties(hourDto.getPathPlan(), pathDo);
        	pathDo.setId(UUIDUtil.getUUID());
        	pathDo.setCreateId(hourDto.getProPeople());
        	pathDo.setCreateName(hourDto.getProPeopleName());
        	pathDo.setCreateTime(new Date());
        	pathDo.setPlanType(PathConst.BACK_TYPE);
        	pathPlanDoMapper.insertSelective(pathDo);
        }else if(nodeType==PathConst.BACK_ARRIVE&&hourDto.getRealPath()!=null){
        	PathPlanDo destPath=pathPlanDoMapper.getOnePath(hourDto.getWrCode(), PathConst.BACK_TYPE);
        	if(destPath!=null){
        		pathDo=new PathPlanDo();
        		BeanUtils.copyProperties(hourDto.getRealPath(), pathDo);
        		pathDo.setId(destPath.getId());
        		pathDo.setUpdateId(hourDto.getProPeople());
            	pathDo.setUpdateName(hourDto.getProPeopleName());
            	pathDo.setUpdateTime(new Date());
        		pathPlanDoMapper.updateByPrimaryKeySelective(pathDo);
        	}
        }
		return ResponseData.success();

		
	}
    
    

}
