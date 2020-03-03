package com.dapeng.flow.workhour.dto;

import java.util.Date;

import lombok.Data;
@Data
public class WorkHourDto  {
    private String instanceId;

    private String wrCode;

    private String nodeId;

    private String nodeName;

    private String nodeAttr;

    private Byte nodeType;

    private Integer sortNo;

    private Date beginTime;

    private Date endTime;

    private Integer proPeople;

    private String proPeopleName;

    private Boolean tpCalculate;

    private Integer createId;

    private String createName;
    /**实际路途**/
    private RealPathDto realPath;
    /**路途规划**/
    private PathPlanDto pathPlan;

}