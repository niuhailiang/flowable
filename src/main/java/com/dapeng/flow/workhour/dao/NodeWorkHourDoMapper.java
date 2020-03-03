package com.dapeng.flow.workhour.dao;

import org.apache.ibatis.annotations.Mapper;

import com.dapeng.flow.workhour.pojo.NodeWorkHourDo;
import com.dapeng.flow.workhour.pojo.NodeWorkHourDoKey;
@Mapper
public interface NodeWorkHourDoMapper {
    int deleteByPrimaryKey(NodeWorkHourDoKey key);

    int insertSelective(NodeWorkHourDo record);

    NodeWorkHourDo selectByPrimaryKey(NodeWorkHourDoKey key);

    int updateByPrimaryKeySelective(NodeWorkHourDo record);

}