package com.dapeng.flow.workhour.pojo;

import java.util.Date;

public class PathPlanDo {
    private String id;

    private String wrCode;

    private Byte planType;

    private String pathType;

    private String departPlace;

    private String departLongitude;

    private String departLatitude;

    private String destination;

    private String destinationLongitude;

    private String destinationLatitude;

    private Integer distance;

    private Integer pathPlanTime;

    private String location;

    private String locLongitude;

    private String locLatitude;

    private Integer offsetDistance;

    private Integer pathRealTime;

    private Integer createId;

    private String createName;

    private Date createTime;

    private Integer updateId;

    private String updateName;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWrCode() {
        return wrCode;
    }

    public void setWrCode(String wrCode) {
        this.wrCode = wrCode == null ? null : wrCode.trim();
    }

    public Byte getPlanType() {
        return planType;
    }

    public void setPlanType(Byte planType) {
        this.planType = planType;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(String pathType) {
        this.pathType = pathType == null ? null : pathType.trim();
    }

    public String getDepartPlace() {
        return departPlace;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace == null ? null : departPlace.trim();
    }

    public String getDepartLongitude() {
        return departLongitude;
    }

    public void setDepartLongitude(String departLongitude) {
        this.departLongitude = departLongitude == null ? null : departLongitude.trim();
    }

    public String getDepartLatitude() {
        return departLatitude;
    }

    public void setDepartLatitude(String departLatitude) {
        this.departLatitude = departLatitude == null ? null : departLatitude.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getDestinationLongitude() {
        return destinationLongitude;
    }

    public void setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude == null ? null : destinationLongitude.trim();
    }

    public String getDestinationLatitude() {
        return destinationLatitude;
    }

    public void setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude == null ? null : destinationLatitude.trim();
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getPathPlanTime() {
        return pathPlanTime;
    }

    public void setPathPlanTime(Integer pathPlanTime) {
        this.pathPlanTime = pathPlanTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(String locLongitude) {
        this.locLongitude = locLongitude == null ? null : locLongitude.trim();
    }

    public String getLocLatitude() {
        return locLatitude;
    }

    public void setLocLatitude(String locLatitude) {
        this.locLatitude = locLatitude == null ? null : locLatitude.trim();
    }

    public Integer getOffsetDistance() {
        return offsetDistance;
    }

    public void setOffsetDistance(Integer offsetDistance) {
        this.offsetDistance = offsetDistance;
    }

    public Integer getPathRealTime() {
        return pathRealTime;
    }

    public void setPathRealTime(Integer pathRealTime) {
        this.pathRealTime = pathRealTime;
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

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}