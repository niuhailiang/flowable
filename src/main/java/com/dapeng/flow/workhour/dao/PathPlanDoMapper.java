package com.dapeng.flow.workhour.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dapeng.flow.workhour.pojo.PathPlanDo;
@Mapper
public interface PathPlanDoMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(PathPlanDo record);

    PathPlanDo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PathPlanDo record);
    
    PathPlanDo getOnePath(@Param("wrCode")String wrCode,@Param("planType")Byte planType);


}