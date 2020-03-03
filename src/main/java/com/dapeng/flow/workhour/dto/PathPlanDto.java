package com.dapeng.flow.workhour.dto;

import lombok.Data;

@Data
public class PathPlanDto {


    private String pathType;

    private String departPlace;

    private String departLongitude;

    private String departLatitude;

    private String destination;

    private String destinationLongitude;

    private String destinationLatitude;

    private Integer distance;

    private Integer pathPlanTime;
    

}