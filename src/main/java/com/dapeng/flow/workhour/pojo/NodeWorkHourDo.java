package com.dapeng.flow.workhour.pojo;

import java.util.Date;

public class NodeWorkHourDo extends NodeWorkHourDoKey {
    private String instanceId;

    private String wrCode;

    private String nodeId;

    private String nodeName;

    private String nodeAttr;

    private Byte nodeType;

    private Integer sortNo;

    private Date beginTime;

    private Date endTime;

    private Integer costTime;

    private Integer proPeople;

    private String proPeopleName;

    private Boolean tpCalculate;

    private Integer createId;

    private String createName;

    private Date createTime;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }

    public String getWrCode() {
        return wrCode;
    }

    public void setWrCode(String wrCode) {
        this.wrCode = wrCode == null ? null : wrCode.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeAttr() {
        return nodeAttr;
    }

    public void setNodeAttr(String nodeAttr) {
        this.nodeAttr = nodeAttr == null ? null : nodeAttr.trim();
    }

    public Byte getNodeType() {
        return nodeType;
    }

    public void setNodeType(Byte nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public Integer getProPeople() {
        return proPeople;
    }

    public void setProPeople(Integer proPeople) {
        this.proPeople = proPeople;
    }

    public String getProPeopleName() {
        return proPeopleName;
    }

    public void setProPeopleName(String proPeopleName) {
        this.proPeopleName = proPeopleName == null ? null : proPeopleName.trim();
    }

    public Boolean getTpCalculate() {
        return tpCalculate;
    }

    public void setTpCalculate(Boolean tpCalculate) {
        this.tpCalculate = tpCalculate;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}